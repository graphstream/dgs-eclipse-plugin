/**
 * <copyright>
 * </copyright>
 *
 */
package org.graphstream.dgs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.graphstream.dgs.Header#getMagic <em>Magic</em>}</li>
 *   <li>{@link org.graphstream.dgs.Header#getName <em>Name</em>}</li>
 *   <li>{@link org.graphstream.dgs.Header#getNumberOfSteps <em>Number Of Steps</em>}</li>
 *   <li>{@link org.graphstream.dgs.Header#getNumberOfEvents <em>Number Of Events</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.graphstream.dgs.DgsPackage#getHeader()
 * @model
 * @generated
 */
public interface Header extends EObject
{
  /**
   * Returns the value of the '<em><b>Magic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Magic</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Magic</em>' attribute.
   * @see #setMagic(String)
   * @see org.graphstream.dgs.DgsPackage#getHeader_Magic()
   * @model
   * @generated
   */
  String getMagic();

  /**
   * Sets the value of the '{@link org.graphstream.dgs.Header#getMagic <em>Magic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Magic</em>' attribute.
   * @see #getMagic()
   * @generated
   */
  void setMagic(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.graphstream.dgs.DgsPackage#getHeader_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.graphstream.dgs.Header#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Number Of Steps</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Number Of Steps</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number Of Steps</em>' attribute.
   * @see #setNumberOfSteps(int)
   * @see org.graphstream.dgs.DgsPackage#getHeader_NumberOfSteps()
   * @model
   * @generated
   */
  int getNumberOfSteps();

  /**
   * Sets the value of the '{@link org.graphstream.dgs.Header#getNumberOfSteps <em>Number Of Steps</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number Of Steps</em>' attribute.
   * @see #getNumberOfSteps()
   * @generated
   */
  void setNumberOfSteps(int value);

  /**
   * Returns the value of the '<em><b>Number Of Events</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Number Of Events</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number Of Events</em>' attribute.
   * @see #setNumberOfEvents(int)
   * @see org.graphstream.dgs.DgsPackage#getHeader_NumberOfEvents()
   * @model
   * @generated
   */
  int getNumberOfEvents();

  /**
   * Sets the value of the '{@link org.graphstream.dgs.Header#getNumberOfEvents <em>Number Of Events</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number Of Events</em>' attribute.
   * @see #getNumberOfEvents()
   * @generated
   */
  void setNumberOfEvents(int value);

} // Header
