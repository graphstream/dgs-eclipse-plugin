/**
 * <copyright>
 * </copyright>
 *
 */
package org.graphstream.dgs.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.graphstream.dgs.DgsPackage;
import org.graphstream.dgs.Dn;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dn</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.graphstream.dgs.impl.DnImpl#getIdNode <em>Id Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DnImpl extends MinimalEObjectImpl.Container implements Dn
{
  /**
   * The default value of the '{@link #getIdNode() <em>Id Node</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdNode()
   * @generated
   * @ordered
   */
  protected static final String ID_NODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIdNode() <em>Id Node</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdNode()
   * @generated
   * @ordered
   */
  protected String idNode = ID_NODE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DnImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DgsPackage.Literals.DN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIdNode()
  {
    return idNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdNode(String newIdNode)
  {
    String oldIdNode = idNode;
    idNode = newIdNode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DgsPackage.DN__ID_NODE, oldIdNode, idNode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DgsPackage.DN__ID_NODE:
        return getIdNode();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DgsPackage.DN__ID_NODE:
        setIdNode((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DgsPackage.DN__ID_NODE:
        setIdNode(ID_NODE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DgsPackage.DN__ID_NODE:
        return ID_NODE_EDEFAULT == null ? idNode != null : !ID_NODE_EDEFAULT.equals(idNode);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (idNode: ");
    result.append(idNode);
    result.append(')');
    return result.toString();
  }

} //DnImpl
