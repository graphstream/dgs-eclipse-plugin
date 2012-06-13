/**
 * <copyright>
 * </copyright>
 *
 */
package org.graphstream.dgs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ae</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.graphstream.dgs.Ae#getIdEdge <em>Id Edge</em>}</li>
 *   <li>{@link org.graphstream.dgs.Ae#getIdNode1 <em>Id Node1</em>}</li>
 *   <li>{@link org.graphstream.dgs.Ae#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.graphstream.dgs.Ae#getIdNode2 <em>Id Node2</em>}</li>
 *   <li>{@link org.graphstream.dgs.Ae#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.graphstream.dgs.DgsPackage#getAe()
 * @model
 * @generated
 */
public interface Ae extends EObject
{
  /**
   * Returns the value of the '<em><b>Id Edge</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id Edge</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id Edge</em>' attribute.
   * @see #setIdEdge(String)
   * @see org.graphstream.dgs.DgsPackage#getAe_IdEdge()
   * @model
   * @generated
   */
  String getIdEdge();

  /**
   * Sets the value of the '{@link org.graphstream.dgs.Ae#getIdEdge <em>Id Edge</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id Edge</em>' attribute.
   * @see #getIdEdge()
   * @generated
   */
  void setIdEdge(String value);

  /**
   * Returns the value of the '<em><b>Id Node1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id Node1</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id Node1</em>' attribute.
   * @see #setIdNode1(String)
   * @see org.graphstream.dgs.DgsPackage#getAe_IdNode1()
   * @model
   * @generated
   */
  String getIdNode1();

  /**
   * Sets the value of the '{@link org.graphstream.dgs.Ae#getIdNode1 <em>Id Node1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id Node1</em>' attribute.
   * @see #getIdNode1()
   * @generated
   */
  void setIdNode1(String value);

  /**
   * Returns the value of the '<em><b>Direction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Direction</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Direction</em>' attribute.
   * @see #setDirection(String)
   * @see org.graphstream.dgs.DgsPackage#getAe_Direction()
   * @model
   * @generated
   */
  String getDirection();

  /**
   * Sets the value of the '{@link org.graphstream.dgs.Ae#getDirection <em>Direction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Direction</em>' attribute.
   * @see #getDirection()
   * @generated
   */
  void setDirection(String value);

  /**
   * Returns the value of the '<em><b>Id Node2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id Node2</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id Node2</em>' attribute.
   * @see #setIdNode2(String)
   * @see org.graphstream.dgs.DgsPackage#getAe_IdNode2()
   * @model
   * @generated
   */
  String getIdNode2();

  /**
   * Sets the value of the '{@link org.graphstream.dgs.Ae#getIdNode2 <em>Id Node2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id Node2</em>' attribute.
   * @see #getIdNode2()
   * @generated
   */
  void setIdNode2(String value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference.
   * @see #setAttributes(Attributes)
   * @see org.graphstream.dgs.DgsPackage#getAe_Attributes()
   * @model containment="true"
   * @generated
   */
  Attributes getAttributes();

  /**
   * Sets the value of the '{@link org.graphstream.dgs.Ae#getAttributes <em>Attributes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attributes</em>' containment reference.
   * @see #getAttributes()
   * @generated
   */
  void setAttributes(Attributes value);

} // Ae
