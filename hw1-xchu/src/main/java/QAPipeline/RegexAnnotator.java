package QAPipeline;

import java.lang.reflect.Constructor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.uima.UimaContext;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;

import QAAnnotation.Base;

public class RegexAnnotator extends JCasAnnotator_ImplBase
{
  
  //These parameters must be set in the analysis engine descriptor
  private static String REGEX_PARAMETER_NAME = "regex";
  private static String TYPE_PARAMETER_NAME = "typeName";
  
  private Pattern regex;
  private Constructor<?> typeInstanceConstructor;
  private static Boolean DEBUG = true;
  
  @Override
  public void initialize( UimaContext context)
  {
    //System.out.println(context.getConfigParameterValue(REGEX_PARAMETER_NAME));
    regex = Pattern.compile( (String) context.getConfigParameterValue(REGEX_PARAMETER_NAME));
    try 
    {
      typeInstanceConstructor = Class.forName((String)context.getConfigParameterValue(TYPE_PARAMETER_NAME)).getConstructor(JCas.class, int.class, int.class);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public void process(JCas jcas) throws AnalysisEngineProcessException {
    Matcher match = regex.matcher(jcas.getDocumentText());
    while (match.find())
    {
      try {
        Base a = (Base)typeInstanceConstructor.newInstance(jcas, match.start(), match.end());
        a.setSource(this.getClass().getName());
        a.setConfidence(1.0d);
        a.addToIndexes();
        if (DEBUG) System.out.println(a);
      } catch (Exception e) {
        throw new AnalysisEngineProcessException(e);
      }
    }
  }
}
    