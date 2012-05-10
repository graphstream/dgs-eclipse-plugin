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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.graphstream.dGS.DGSPackage;
import org.graphstream.dGS.Map;
import org.graphstream.dGS.Mapping;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.graphstream.dGS.impl.MapImpl#getMapping <em>Mapping</em>}</li>
 *   <li>{@link org.graphstream.dGS.impl.MapImpl#getOtherMapping <em>Other Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MapImpl extends MinimalEObjectImpl.Container implements Map
{
  /**
   * The cached value of the '{@link #getMapping() <em>Mapping</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMapping()
   * @generated
   * @ordered
   */
  protected Mapping mapping;

  /**
   * The cached value of the '{@link #getOtherMapping() <em>Other Mapping</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOtherMapping()
   * @generated
   * @ordered
   */
  protected EList<Mapping> otherMapping;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MapImpl()
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
    return DGSPackage.Literals.MAP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mapping getMapping()
  {
    return mapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMapping(Mapping newMapping, NotificationChain msgs)
  {
    Mapping oldMapping = mapping;
    mapping = newMapping;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DGSPackage.MAP__MAPPING, oldMapping, newMapping);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMapping(Mapping newMapping)
  {
    if (newMapping != mapping)
    {
      NotificationChain msgs = null;
      if (mapping != null)
        msgs = ((InternalEObject)mapping).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DGSPackage.MAP__MAPPING, null, msgs);
      if (newMapping != null)
        msgs = ((InternalEObject)newMapping).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DGSPackage.MAP__MAPPING, null, msgs);
      msgs = basicSetMapping(newMapping, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DGSPackage.MAP__MAPPING, newMapping, newMapping));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Mapping> getOtherMapping()
  {
    if (otherMapping == null)
    {
      otherMapping = new EObjectContainmentEList<Mapping>(Mapping.class, this, DGSPackage.MAP__OTHER_MAPPING);
    }
    return otherMapping;
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
      case DGSPackage.MAP__MAPPING:
        return basicSetMapping(null, msgs);
      case DGSPackage.MAP__OTHER_MAPPING:
        return ((InternalEList<?>)getOtherMapping()).basicRemove(otherEnd, msgs);
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
      case DGSPackage.MAP__MAPPING:
        return getMapping();
      case DGSPackage.MAP__OTHER_MAPPING:
        return getOtherMapping();
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
      case DGSPackage.MAP__MAPPING:
        setMapping((Mapping)newValue);
        return;
      case DGSPackage.MAP__OTHER_MAPPING:
        getOtherMapping().clear();
        getOtherMapping().addAll((Collection<? extends Mapping>)newValue);
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
      case DGSPackage.MAP__MAPPING:
        setMapping((Mapping)null);
        return;
      case DGSPackage.MAP__OTHER_MAPPING:
        getOtherMapping().clear();
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
      case DGSPackage.MAP__MAPPING:
        return mapping != null;
      case DGSPackage.MAP__OTHER_MAPPING:
        return otherMapping != null && !otherMapping.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MapImpl
