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

import org.graphstream.dgs.De;
import org.graphstream.dgs.DgsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>De</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.graphstream.dgs.impl.DeImpl#getIdEdge <em>Id Edge</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeImpl extends MinimalEObjectImpl.Container implements De
{
  /**
   * The default value of the '{@link #getIdEdge() <em>Id Edge</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdEdge()
   * @generated
   * @ordered
   */
  protected static final String ID_EDGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIdEdge() <em>Id Edge</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdEdge()
   * @generated
   * @ordered
   */
  protected String idEdge = ID_EDGE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeImpl()
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
    return DgsPackage.Literals.DE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIdEdge()
  {
    return idEdge;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdEdge(String newIdEdge)
  {
    String oldIdEdge = idEdge;
    idEdge = newIdEdge;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DgsPackage.DE__ID_EDGE, oldIdEdge, idEdge));
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
      case DgsPackage.DE__ID_EDGE:
        return getIdEdge();
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
      case DgsPackage.DE__ID_EDGE:
        setIdEdge((String)newValue);
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
      case DgsPackage.DE__ID_EDGE:
        setIdEdge(ID_EDGE_EDEFAULT);
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
      case DgsPackage.DE__ID_EDGE:
        return ID_EDGE_EDEFAULT == null ? idEdge != null : !ID_EDGE_EDEFAULT.equals(idEdge);
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
    result.append(" (idEdge: ");
    result.append(idEdge);
    result.append(')');
    return result.toString();
  }

} //DeImpl
