/**
 * <copyright>
 * </copyright>
 *
 */
package org.graphstream.dgs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dn</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.graphstream.dgs.Dn#getIdNode <em>Id Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.graphstream.dgs.DgsPackage#getDn()
 * @model
 * @generated
 */
public interface Dn extends EObject
{
  /**
   * Returns the value of the '<em><b>Id Node</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id Node</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id Node</em>' attribute.
   * @see #setIdNode(String)
   * @see org.graphstream.dgs.DgsPackage#getDn_IdNode()
   * @model
   * @generated
   */
  String getIdNode();

  /**
   * Sets the value of the '{@link org.graphstream.dgs.Dn#getIdNode <em>Id Node</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id Node</em>' attribute.
   * @see #getIdNode()
   * @generated
   */
  void setIdNode(String value);

} // Dn
