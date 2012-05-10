/**
 * <copyright>
 * </copyright>
 *

 */
package org.graphstream.dGS.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.graphstream.dGS.DGSPackage;
import org.graphstream.dGS.St;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>St</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.graphstream.dGS.impl.StImpl#getReal <em>Real</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StImpl extends MinimalEObjectImpl.Container implements St
{
  /**
   * The default value of the '{@link #getReal() <em>Real</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReal()
   * @generated
   * @ordered
   */
  protected static final double REAL_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getReal() <em>Real</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReal()
   * @generated
   * @ordered
   */
  protected double real = REAL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StImpl()
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
    return DGSPackage.Literals.ST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getReal()
  {
    return real;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReal(double newReal)
  {
    double oldReal = real;
    real = newReal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DGSPackage.ST__REAL, oldReal, real));
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
      case DGSPackage.ST__REAL:
        return getReal();
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
      case DGSPackage.ST__REAL:
        setReal((Double)newValue);
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
      case DGSPackage.ST__REAL:
        setReal(REAL_EDEFAULT);
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
      case DGSPackage.ST__REAL:
        return real != REAL_EDEFAULT;
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
    result.append(" (real: ");
    result.append(real);
    result.append(')');
    return result.toString();
  }

} //StImpl
