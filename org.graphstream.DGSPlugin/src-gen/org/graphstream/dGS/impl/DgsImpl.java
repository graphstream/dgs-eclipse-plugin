/**
 * <copyright>
 * </copyright>
 *

 */
package org.graphstream.dGS.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.graphstream.dGS.DGSPackage;
import org.graphstream.dGS.Dgs;
import org.graphstream.dGS.Event;
import org.graphstream.dGS.Header;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dgs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.graphstream.dGS.impl.DgsImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.graphstream.dGS.impl.DgsImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link org.graphstream.dGS.impl.DgsImpl#getComment <em>Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DgsImpl extends MinimalEObjectImpl.Container implements Dgs
{
  /**
   * The cached value of the '{@link #getHeader() <em>Header</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeader()
   * @generated
   * @ordered
   */
  protected Header header;

  /**
   * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvent()
   * @generated
   * @ordered
   */
  protected EList<Event> event;

  /**
   * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComment()
   * @generated
   * @ordered
   */
  protected EList<String> comment;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DgsImpl()
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
    return DGSPackage.Literals.DGS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Header getHeader()
  {
    return header;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHeader(Header newHeader, NotificationChain msgs)
  {
    Header oldHeader = header;
    header = newHeader;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DGSPackage.DGS__HEADER, oldHeader, newHeader);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeader(Header newHeader)
  {
    if (newHeader != header)
    {
      NotificationChain msgs = null;
      if (header != null)
        msgs = ((InternalEObject)header).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DGSPackage.DGS__HEADER, null, msgs);
      if (newHeader != null)
        msgs = ((InternalEObject)newHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DGSPackage.DGS__HEADER, null, msgs);
      msgs = basicSetHeader(newHeader, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DGSPackage.DGS__HEADER, newHeader, newHeader));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Event> getEvent()
  {
    if (event == null)
    {
      event = new EObjectContainmentEList<Event>(Event.class, this, DGSPackage.DGS__EVENT);
    }
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getComment()
  {
    if (comment == null)
    {
      comment = new EDataTypeEList<String>(String.class, this, DGSPackage.DGS__COMMENT);
    }
    return comment;
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
      case DGSPackage.DGS__HEADER:
        return basicSetHeader(null, msgs);
      case DGSPackage.DGS__EVENT:
        return ((InternalEList<?>)getEvent()).basicRemove(otherEnd, msgs);
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
      case DGSPackage.DGS__HEADER:
        return getHeader();
      case DGSPackage.DGS__EVENT:
        return getEvent();
      case DGSPackage.DGS__COMMENT:
        return getComment();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DGSPackage.DGS__HEADER:
        setHeader((Header)newValue);
        return;
      case DGSPackage.DGS__EVENT:
        getEvent().clear();
        getEvent().addAll((Collection<? extends Event>)newValue);
        return;
      case DGSPackage.DGS__COMMENT:
        getComment().clear();
        getComment().addAll((Collection<? extends String>)newValue);
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
      case DGSPackage.DGS__HEADER:
        setHeader((Header)null);
        return;
      case DGSPackage.DGS__EVENT:
        getEvent().clear();
        return;
      case DGSPackage.DGS__COMMENT:
        getComment().clear();
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
      case DGSPackage.DGS__HEADER:
        return header != null;
      case DGSPackage.DGS__EVENT:
        return event != null && !event.isEmpty();
      case DGSPackage.DGS__COMMENT:
        return comment != null && !comment.isEmpty();
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
    result.append(" (comment: ");
    result.append(comment);
    result.append(')');
    return result.toString();
  }

} //DgsImpl
