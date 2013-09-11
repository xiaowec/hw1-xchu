

/* First created by JCasGen Tue Sep 10 20:10:39 EDT 2013 */
package QAAnnotation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.TOP;


import org.apache.uima.jcas.cas.FloatArray;


/** The system will evaluate the answers by using this annotation
It will sorted the output answer according to their score and calculate the precision score at N
 * @author cxw
 * @version %I%, %G%
 * @since 1.0
 * Updated by JCasGen Wed Sep 11 01:47:52 EDT 2013
 * XML source: /home/cxw/git/hw1-xchu/hw1-xchu/src/main/resources/hw1-xchu-typesystem.xml
 * @generated */
public class Evaluation extends Base {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Evaluation.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Evaluation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Evaluation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Evaluation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Evaluation(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
  //*--------------*
  //* Feature: precision

  /** getter for precision - gets Calculate precision at N( where N is the total number of correct answers)
 * @since 1.0
   * @generated */
  public double getPrecision() {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_precision == null)
      jcasType.jcas.throwFeatMissing("precision", "QAAnnotation.Evaluation");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Evaluation_Type)jcasType).casFeatCode_precision);}
    
  /** setter for precision - sets Calculate precision at N( where N is the total number of correct answers)
 * @since 1.0 
   * @generated */
  public void setPrecision(double v) {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_precision == null)
      jcasType.jcas.throwFeatMissing("precision", "QAAnnotation.Evaluation");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Evaluation_Type)jcasType).casFeatCode_precision, v);}    
   
    
  //*--------------*
  //* Feature: sorted_answer

  /** getter for sorted_answer - gets The system will sort the answers according to their scores
 * @since 1.0
   * @generated */
  public FSArray getSorted_answer() {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_sorted_answer == null)
      jcasType.jcas.throwFeatMissing("sorted_answer", "QAAnnotation.Evaluation");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_sorted_answer)));}
    
  /** setter for sorted_answer - sets The system will sort the answers according to their scores
 * @since 1.0 
   * @generated */
  public void setSorted_answer(FSArray v) {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_sorted_answer == null)
      jcasType.jcas.throwFeatMissing("sorted_answer", "QAAnnotation.Evaluation");
    jcasType.ll_cas.ll_setRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_sorted_answer, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for sorted_answer - gets an indexed value - The system will sort the answers according to their scores
   * @generated */
  public TOP getSorted_answer(int i) {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_sorted_answer == null)
      jcasType.jcas.throwFeatMissing("sorted_answer", "QAAnnotation.Evaluation");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_sorted_answer), i);
    return (TOP)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_sorted_answer), i)));}

  /** indexed setter for sorted_answer - sets an indexed value - The system will sort the answers according to their scores
   * @generated */
  public void setSorted_answer(int i, TOP v) { 
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_sorted_answer == null)
      jcasType.jcas.throwFeatMissing("sorted_answer", "QAAnnotation.Evaluation");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_sorted_answer), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_sorted_answer), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    