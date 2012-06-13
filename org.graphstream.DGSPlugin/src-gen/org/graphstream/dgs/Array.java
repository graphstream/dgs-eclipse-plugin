/**
 * <copyright>
 * </copyright>
 *
 */
package org.graphstream.dgs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.graphstream.dgs.Array#getValue <em>Value</em>}</li>
 *   <li>{@link org.graphstream.dgs.Array#getOtherValues <em>Other Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.graphstream.dgs.DgsPackage#getArray()
 * @model
 * @generated
 */
public interface Array extends EObject
{
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
   * @see org.graphstream.dgs.DgsPackage#getArray_Value()
   * @model containment="true"
   * @generated
   */
  Value getValue();

  /**
   * Sets the value of the '{@link org.graphstream.dgs.Array#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Value value);

  /**
   * Returns the value of the '<em><b>Other Values</b></em>' containment reference list.
   * The list contents are of type {@link org.graphstream.dgs.Value}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Other Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Other Values</em>' containment reference list.
   * @see org.graphstream.dgs.DgsPackage#getArray_OtherValues()
   * @model containment="true"
   * @generated
   */
  EList<Value> getOtherValues();

} // Array
