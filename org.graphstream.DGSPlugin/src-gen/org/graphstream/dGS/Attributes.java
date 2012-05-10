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
 * A representation of the model object '<em><b>Attributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.graphstream.dGS.Attributes#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.graphstream.dGS.DGSPackage#getAttributes()
 * @model
 * @generated
 */
public interface Attributes extends EObject
{
  /**
   * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
   * The list contents are of type {@link org.graphstream.dGS.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' containment reference list.
   * @see org.graphstream.dGS.DGSPackage#getAttributes_Attribute()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttribute();

} // Attributes
