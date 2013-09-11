package QAPipeline;

import org.apache.uima.UimaContext;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.cas.text.AnnotationIndex;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.resource.ResourceInitializationException;

import QAAnnotation.Base;
import QAAnnotation.NGram;

public class NGramAnnotator extends JCasAnnotator_ImplBase
{
  
  // These parameters must be set in the analysis engine descriptor
  private static String N_PARAMETER_NAME = "n";
  private static String TYPE_PARAMETER_NAME = "typename";
  private static String COMPONENT_PARAMETER_NAME = "componetId";
  
  private Integer n;
  private String typeName, componentId;
  
  @Override
  public void initialize(UimaContext aContext) throws ResourceInitializationException
  {
    super.initialize(aContext);
    
    componentId = (String) aContext.getConfigParameterValue(COMPONENT_PARAMETER_NAME);
    typeName = (String) aContext.getConfigParameterValue(TYPE_PARAMETER_NAME);
    //n = (Integer) aContext.getConfigParameterValue(N_PARAMETER_NAME);
    n = 2;
    
    
    System.out.println(n);
    System.out.println(typeName);
    System.out.println(componentId);
  }

  @Override
  public void process(JCas jcas) throws AnalysisEngineProcessException {
    AnnotationIndex<?> index = jcas.getAnnotationIndex(jcas.getTypeSystem().getType(typeName));
    Base[] array = new Base[index.size()];
    FSIterator<?> iterator = index.iterator();
    for (int i=0 ; i <index.size(); i++)
      array[i]= (Base)iterator.next();
    int lastNGramStart = index.size() -n +1;
    for(int offset =0 ; offset < lastNGramStart ; offset++)
    {
      FSArray elementsArray = new FSArray(jcas, n);
      for (int i=0 ; i<n ; i++)
        elementsArray.set(i, array[offset + i]);
      NGram a = new NGram(jcas , array[offset].getBegin(), array[offset + n -1].getEnd());
      a.setElementType(typeName);
      a.setElements(elementsArray);
      a.setSource(componentId);
      a.setConfidence(1.0d);
      a.addToIndexes();
     // if (DEBUG) System.out.println(a);
    }
  }
  
}

