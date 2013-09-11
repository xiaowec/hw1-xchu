
/* First created by JCasGen Tue Sep 10 20:10:39 EDT 2013 */
package QAAnnotation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;

import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** The system will evaluate the answers by using this annotation
It will sorted the output answer according to their score and calculate the precision score at N
 * @author cxw
 * @version %I%, %G%
 * @since 1.0
 * Updated by JCasGen Wed Sep 11 01:47:52 EDT 2013
 * @generated */
public class Evaluation_Type extends Base_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Evaluation_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Evaluation_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Evaluation(addr, Evaluation_Type.this);
  			   Evaluation_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Evaluation(addr, Evaluation_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Evaluation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("QAAnnotation.Evaluation");



  /** @generated */
  final Feature casFeat_precision;
  /** @generated */
  final int     casFeatCode_precision;
  /** @generated */ 
  public double getPrecision(int addr) {
        if (featOkTst && casFeat_precision == null)
      jcas.throwFeatMissing("precision", "QAAnnotation.Evaluation");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_precision);
  }
  /** @generated */    
  public void setPrecision(int addr, double v) {
        if (featOkTst && casFeat_precision == null)
      jcas.throwFeatMissing("precision", "QAAnnotation.Evaluation");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_precision, v);}
    
  
 
  /** @generated */
  final Feature casFeat_sorted_answer;
  /** @generated */
  final int     casFeatCode_sorted_answer;
  /** @generated */ 
  public int getSorted_answer(int addr) {
        if (featOkTst && casFeat_sorted_answer == null)
      jcas.throwFeatMissing("sorted_answer", "QAAnnotation.Evaluation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_sorted_answer);
  }
  /** @generated */    
  public void setSorted_answer(int addr, int v) {
        if (featOkTst && casFeat_sorted_answer == null)
      jcas.throwFeatMissing("sorted_answer", "QAAnnotation.Evaluation");
    ll_cas.ll_setRefValue(addr, casFeatCode_sorted_answer, v);}
    
   /** @generated */
  public int getSorted_answer(int addr, int i) {
        if (featOkTst && casFeat_sorted_answer == null)
      jcas.throwFeatMissing("sorted_answer", "QAAnnotation.Evaluation");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_sorted_answer), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_sorted_answer), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_sorted_answer), i);
  }
   
  /** @generated */ 
  public void setSorted_answer(int addr, int i, int v) {
        if (featOkTst && casFeat_sorted_answer == null)
      jcas.throwFeatMissing("sorted_answer", "QAAnnotation.Evaluation");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_sorted_answer), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_sorted_answer), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_sorted_answer), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Evaluation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_precision = jcas.getRequiredFeatureDE(casType, "precision", "uima.cas.Double", featOkTst);
    casFeatCode_precision  = (null == casFeat_precision) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_precision).getCode();

 
    casFeat_sorted_answer = jcas.getRequiredFeatureDE(casType, "sorted_answer", "uima.cas.FSArray", featOkTst);
    casFeatCode_sorted_answer  = (null == casFeat_sorted_answer) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sorted_answer).getCode();

  }
}



    