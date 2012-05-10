/**
 * <copyright>
 * </copyright>
 *

 */
package org.graphstream.dGS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.graphstream.dGS.Ae;
import org.graphstream.dGS.Attributes;
import org.graphstream.dGS.DGSPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ae</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.graphstream.dGS.impl.AeImpl#getIdEdge <em>Id Edge</em>}</li>
 *   <li>{@link org.graphstream.dGS.impl.AeImpl#getIdNode1 <em>Id Node1</em>}</li>
 *   <li>{@link org.graphstream.dGS.impl.AeImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.graphstream.dGS.impl.AeImpl#getIdNode2 <em>Id Node2</em>}</li>
 *   <li>{@link org.graphstream.dGS.impl.AeImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AeImpl extends MinimalEObjectImpl.Container implements Ae
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
   * The default value of the '{@link #getIdNode1() <em>Id Node1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdNode1()
   * @generated
   * @ordered
   */
  protected static final String ID_NODE1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIdNode1() <em>Id Node1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdNode1()
   * @generated
   * @ordered
   */
  protected String idNode1 = ID_NODE1_EDEFAULT;

  /**
   * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirection()
   * @generated
   * @ordered
   */
  protected static final String DIRECTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirection()
   * @generated
   * @ordered
   */
  protected String direction = DIRECTION_EDEFAULT;

  /**
   * The default value of the '{@link #getIdNode2() <em>Id Node2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdNode2()
   * @generated
   * @ordered
   */
  protected static final String ID_NODE2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIdNode2() <em>Id Node2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdNode2()
   * @generated
   * @ordered
   */
  protected String idNode2 = ID_NODE2_EDEFAULT;

  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected Attributes attributes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AeImpl()
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
    return DGSPackage.Literals.AE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DGSPackage.AE__ID_EDGE, oldIdEdge, idEdge));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIdNode1()
  {
    return idNode1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdNode1(String newIdNode1)
  {
    String oldIdNode1 = idNode1;
    idNode1 = newIdNode1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DGSPackage.AE__ID_NODE1, oldIdNode1, idNode1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDirection()
  {
    return direction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDirection(String newDirection)
  {
    String oldDirection = direction;
    direction = newDirection;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DGSPackage.AE__DIRECTION, oldDirection, direction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIdNode2()
  {
    return idNode2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdNode2(String newIdNode2)
  {
    String oldIdNode2 = idNode2;
    idNode2 = newIdNode2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DGSPackage.AE__ID_NODE2, oldIdNode2, idNode2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attributes getAttributes()
  {
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAttributes(Attributes newAttributes, NotificationChain msgs)
  {
    Attributes oldAttributes = attributes;
    attributes = newAttributes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DGSPackage.AE__ATTRIBUTES, oldAttributes, newAttributes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttributes(Attributes newAttributes)
  {
    if (newAttributes != attributes)
    {
      NotificationChain msgs = null;
      if (attributes != null)
        msgs = ((InternalEObject)attributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DGSPackage.AE__ATTRIBUTES, null, msgs);
      if (newAttributes != null)
        msgs = ((InternalEObject)newAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DGSPackage.AE__ATTRIBUTES, null, msgs);
      msgs = basicSetAttributes(newAttributes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DGSPackage.AE__ATTRIBUTES, newAttributes, newAttributes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DGSPackage.AE__ATTRIBUTES:
        return basicSetAttributes(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case DGSPackage.AE__ID_EDGE:
        return getIdEdge();
      case DGSPackage.AE__ID_NODE1:
        return getIdNode1();
      case DGSPackage.AE__DIRECTION:
        return getDirection();
      case DGSPackage.AE__ID_NODE2:
        return getIdNode2();
      case DGSPackage.AE__ATTRIBUTES:
        return getAttributes();
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
      case DGSPackage.AE__ID_EDGE:
        setIdEdge((String)newValue);
        return;
      case DGSPackage.AE__ID_NODE1:
        setIdNode1((String)newValue);
        return;
      case DGSPackage.AE__DIRECTION:
        setDirection((String)newValue);
        return;
      case DGSPackage.AE__ID_NODE2:
        setIdNode2((String)newValue);
        return;
      case DGSPackage.AE__ATTRIBUTES:
        setAttributes((Attributes)newValue);
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
      case DGSPackage.AE__ID_EDGE:
        setIdEdge(ID_EDGE_EDEFAULT);
        return;
      case DGSPackage.AE__ID_NODE1:
        setIdNode1(ID_NODE1_EDEFAULT);
        return;
      case DGSPackage.AE__DIRECTION:
        setDirection(DIRECTION_EDEFAULT);
        return;
      case DGSPackage.AE__ID_NODE2:
        setIdNode2(ID_NODE2_EDEFAULT);
        return;
      case DGSPackage.AE__ATTRIBUTES:
        setAttributes((Attributes)null);
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
      case DGSPackage.AE__ID_EDGE:
        return ID_EDGE_EDEFAULT == null ? idEdge != null : !ID_EDGE_EDEFAULT.equals(idEdge);
      case DGSPackage.AE__ID_NODE1:
        return ID_NODE1_EDEFAULT == null ? idNode1 != null : !ID_NODE1_EDEFAULT.equals(idNode1);
      case DGSPackage.AE__DIRECTION:
        return DIRECTION_EDEFAULT == null ? direction != null : !DIRECTION_EDEFAULT.equals(direction);
      case DGSPackage.AE__ID_NODE2:
        return ID_NODE2_EDEFAULT == null ? idNode2 != null : !ID_NODE2_EDEFAULT.equals(idNode2);
      case DGSPackage.AE__ATTRIBUTES:
        return attributes != null;
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
    result.append(", idNode1: ");
    result.append(idNode1);
    result.append(", direction: ");
    result.append(direction);
    result.append(", idNode2: ");
    result.append(idNode2);
    result.append(')');
    return result.toString();
  }

} //AeImpl
