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
 * A representation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.graphstream.dgs.Map#getMapping <em>Mapping</em>}</li>
 *   <li>{@link org.graphstream.dgs.Map#getOtherMapping <em>Other Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.graphstream.dgs.DgsPackage#getMap()
 * @model
 * @generated
 */
public interface Map extends EObject
{
  /**
   * Returns the value of the '<em><b>Mapping</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mapping</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mapping</em>' containment reference.
   * @see #setMapping(Mapping)
   * @see org.graphstream.dgs.DgsPackage#getMap_Mapping()
   * @model containment="true"
   * @generated
   */
  Mapping getMapping();

  /**
   * Sets the value of the '{@link org.graphstream.dgs.Map#getMapping <em>Mapping</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mapping</em>' containment reference.
   * @see #getMapping()
   * @generated
   */
  void setMapping(Mapping value);

  /**
   * Returns the value of the '<em><b>Other Mapping</b></em>' containment reference list.
   * The list contents are of type {@link org.graphstream.dgs.Mapping}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Other Mapping</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Other Mapping</em>' containment reference list.
   * @see org.graphstream.dgs.DgsPackage#getMap_OtherMapping()
   * @model containment="true"
   * @generated
   */
  EList<Mapping> getOtherMapping();

} // Map
