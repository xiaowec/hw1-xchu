

/* First created by JCasGen Tue Sep 10 19:53:59 EDT 2013 */
package QAAnnotation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** A base annotation type. 
All other types inherit from this base annotation type.
 * Updated by JCasGen Tue Sep 10 21:24:27 EDT 2013
 * XML source: /media/DISK1_VOL4/CMU/11791/hw1-xchu/src/main/resources/hw1-xchu-aeDescriptor.xml
 * @generated */
public class Base extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Base.class);
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
  protected Base() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Base(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Base(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Base(JCas jcas, int begin, int end) {
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
  //* Feature: source

  /** 
   * getter for source - gets To keep track of where an annotation was originally made by
   * This method will return the source of annotation
   * @see #getSource()
   * @since 1.0
   * @generated */
  public String getSource() {
    if (Base_Type.featOkTst && ((Base_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "QAAnnotation.Base");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Base_Type)jcasType).casFeatCode_source);}
    
  /** 
   * setter for source - sets To keep track of where an annotation was originally made by
   * This method will set the source of annotation
   * @param v the source of annotation 
   * @see #setSource(String)
   * @since 1.0
   * @generated */
  public void setSource(String v) {
    if (Base_Type.featOkTst && ((Base_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "QAAnnotation.Base");
    jcasType.ll_cas.ll_setStringValue(addr, ((Base_Type)jcasType).casFeatCode_source, v);}    
   
    
  //*--------------*
  //* Feature: confidence

  /** getter for confidence - gets the confidence of annotation
   * @generated */
  public double getConfidence() {
    if (Base_Type.featOkTst && ((Base_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "QAAnnotation.Base");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Base_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets the confidence of annotation 
   * @generated */
  public void setConfidence(double v) {
    if (Base_Type.featOkTst && ((Base_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "QAAnnotation.Base");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Base_Type)jcasType).casFeatCode_confidence, v);}    
  }

    