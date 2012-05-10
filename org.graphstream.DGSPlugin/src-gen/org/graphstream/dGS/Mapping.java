/**
 * <copyright>
 * </copyright>
 *

 */
package org.graphstream.dGS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.graphstream.dGS.Mapping#getId <em>Id</em>}</li>
 *   <li>{@link org.graphstream.dGS.Mapping#getAssign <em>Assign</em>}</li>
 *   <li>{@link org.graphstream.dGS.Mapping#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.graphstream.dGS.DGSPackage#getMapping()
 * @model
 * @generated
 */
public interface Mapping extends EObject
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.graphstream.dGS.DGSPackage#getMapping_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.graphstream.dGS.Mapping#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

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
   * @see org.graphstream.dGS.DGSPackage#getMapping_Assign()
   * @model
   * @generated
   */
  String getAssign();

  /**
   * Sets the value of the '{@link org.graphstream.dGS.Mapping#getAssign <em>Assign</em>}' attribute.
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
   * @see org.graphstream.dGS.DGSPackage#getMapping_Value()
   * @model containment="true"
   * @generated
   */
  Value getValue();

  /**
   * Sets the value of the '{@link org.graphstream.dGS.Mapping#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Value value);

} // Mapping
