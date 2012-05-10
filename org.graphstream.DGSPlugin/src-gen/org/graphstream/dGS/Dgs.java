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
 * A representation of the model object '<em><b>Dgs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.graphstream.dGS.Dgs#getHeader <em>Header</em>}</li>
 *   <li>{@link org.graphstream.dGS.Dgs#getEvent <em>Event</em>}</li>
 *   <li>{@link org.graphstream.dGS.Dgs#getComment <em>Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.graphstream.dGS.DGSPackage#getDgs()
 * @model
 * @generated
 */
public interface Dgs extends EObject
{
  /**
   * Returns the value of the '<em><b>Header</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Header</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Header</em>' containment reference.
   * @see #setHeader(Header)
   * @see org.graphstream.dGS.DGSPackage#getDgs_Header()
   * @model containment="true"
   * @generated
   */
  Header getHeader();

  /**
   * Sets the value of the '{@link org.graphstream.dGS.Dgs#getHeader <em>Header</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Header</em>' containment reference.
   * @see #getHeader()
   * @generated
   */
  void setHeader(Header value);

  /**
   * Returns the value of the '<em><b>Event</b></em>' containment reference list.
   * The list contents are of type {@link org.graphstream.dGS.Event}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event</em>' containment reference list.
   * @see org.graphstream.dGS.DGSPackage#getDgs_Event()
   * @model containment="true"
   * @generated
   */
  EList<Event> getEvent();

  /**
   * Returns the value of the '<em><b>Comment</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comment</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comment</em>' attribute list.
   * @see org.graphstream.dGS.DGSPackage#getDgs_Comment()
   * @model unique="false"
   * @generated
   */
  EList<String> getComment();

} // Dgs
