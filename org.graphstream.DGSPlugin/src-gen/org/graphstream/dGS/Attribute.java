/**
 * <copyright>
 * </copyright>
 *

 */
package org.graphstream.dGS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.graphstream.dGS.Attribute#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.graphstream.dGS.Attribute#getIdAttribute <em>Id Attribute</em>}</li>
 *   <li>{@link org.graphstream.dGS.Attribute#getAssign <em>Assign</em>}</li>
 *   <li>{@link org.graphstream.dGS.Attribute#getValue <em>Value</em>}</li>
 *   <li>{@link org.graphstream.dGS.Attribute#getOtherValues <em>Other Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.graphstream.dGS.DGSPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see #setOperator(String)
   * @see org.graphstream.dGS.DGSPackage#getAttribute_Operator()
   * @model
   * @generated
   */
  String getOperator();

  /**
   * Sets the value of the '{@link org.graphstream.dGS.Attribute#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see #getOperator()
   * @generated
   */
  void setOperator(String value);

  /**
   * Returns the value of the '<em><b>Id Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id Attribute</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id Attribute</em>' attribute.
   * @see #setIdAttribute(String)
   * @see org.graphstream.dGS.DGSPackage#getAttribute_IdAttribute()
   * @model
   * @generated
   */
  String getIdAttribute();

  /**
   * Sets the value of the '{@link org.graphstream.dGS.Attribute#getIdAttribute <em>Id Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id Attribute</em>' attribute.
   * @see #getIdAttribute()
   * @generated
   */
  void setIdAttribute(String value);

  /**
   * Returns the value of the '<em><b>Assign</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assign</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assign</em>' attribute.
   * @see #setAssign(String)
   * @see org.graphstream.dGS.DGSPackage#getAttribute_Assign()
   * @model
   * @generated
   */
  String getAssign();

  /**
   * Sets the value of the '{@link org.graphstream.dGS.Attribute#getAssign <em>Assign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assign</em>' attribute.
   * @see #getAssign()
   * @generated
   */
  void setAssign(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Value)
   * @see org.graphstream.dGS.DGSPackage#getAttribute_Value()
   * @model containment="true"
   * @generated
   */
  Value getValue();

  /**
   * Sets the value of the '{@link org.graphstream.dGS.Attribute#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Value value);

  /**
   * Returns the value of the '<em><b>Other Values</b></em>' containment reference list.
   * The list contents are of type {@link org.graphstream.dGS.Value}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Other Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Other Values</em>' containment reference list.
   * @see org.graphstream.dGS.DGSPackage#getAttribute_OtherValues()
   * @model containment="true"
   * @generated
   */
  EList<Value> getOtherValues();

} // Attribute
