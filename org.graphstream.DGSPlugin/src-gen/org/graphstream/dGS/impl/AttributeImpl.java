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

import org.graphstream.dGS.Attribute;
import org.graphstream.dGS.DGSPackage;
import org.graphstream.dGS.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.graphstream.dGS.impl.AttributeImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.graphstream.dGS.impl.AttributeImpl#getIdAttribute <em>Id Attribute</em>}</li>
 *   <li>{@link org.graphstream.dGS.impl.AttributeImpl#getAssign <em>Assign</em>}</li>
 *   <li>{@link org.graphstream.dGS.impl.AttributeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.graphstream.dGS.impl.AttributeImpl#getOtherValues <em>Other Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeImpl extends MinimalEObjectImpl.Container implements Attribute
{
  /**
   * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected static final String OPERATOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected String operator = OPERATOR_EDEFAULT;

  /**
   * The default value of the '{@link #getIdAttribute() <em>Id Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdAttribute()
   * @generated
   * @ordered
   */
  protected static final String ID_ATTRIBUTE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIdAttribute() <em>Id Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdAttribute()
   * @generated
   * @ordered
   */
  protected String idAttribute = ID_ATTRIBUTE_EDEFAULT;

  /**
   * The default value of the '{@link #getAssign() <em>Assign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssign()
   * @generated
   * @ordered
   */
  protected static final String ASSIGN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAssign() <em>Assign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssign()
   * @generated
   * @ordered
   */
  protected String assign = ASSIGN_EDEFAULT;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected Value value;

  /**
   * The cached value of the '{@link #getOtherValues() <em>Other Values</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOtherValues()
   * @generated
   * @ordered
   */
  protected EList<Value> otherValues;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeImpl()
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
    return DGSPackage.Literals.ATTRIBUTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperator(String newOperator)
  {
    String oldOperator = operator;
    operator = newOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DGSPackage.ATTRIBUTE__OPERATOR, oldOperator, operator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIdAttribute()
  {
    return idAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdAttribute(String newIdAttribute)
  {
    String oldIdAttribute = idAttribute;
    idAttribute = newIdAttribute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DGSPackage.ATTRIBUTE__ID_ATTRIBUTE, oldIdAttribute, idAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAssign()
  {
    return assign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssign(String newAssign)
  {
    String oldAssign = assign;
    assign = newAssign;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DGSPackage.ATTRIBUTE__ASSIGN, oldAssign, assign));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(Value newValue, NotificationChain msgs)
  {
    Value oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DGSPackage.ATTRIBUTE__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(Value newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DGSPackage.ATTRIBUTE__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DGSPackage.ATTRIBUTE__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DGSPackage.ATTRIBUTE__VALUE, newValue, newValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Value> getOtherValues()
  {
    if (otherValues == null)
    {
      otherValues = new EObjectContainmentEList<Value>(Value.class, this, DGSPackage.ATTRIBUTE__OTHER_VALUES);
    }
    return otherValues;
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
      case DGSPackage.ATTRIBUTE__VALUE:
        return basicSetValue(null, msgs);
      case DGSPackage.ATTRIBUTE__OTHER_VALUES:
        return ((InternalEList<?>)getOtherValues()).basicRemove(otherEnd, msgs);
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
      case DGSPackage.ATTRIBUTE__OPERATOR:
        return getOperator();
      case DGSPackage.ATTRIBUTE__ID_ATTRIBUTE:
        return getIdAttribute();
      case DGSPackage.ATTRIBUTE__ASSIGN:
        return getAssign();
      case DGSPackage.ATTRIBUTE__VALUE:
        return getValue();
      case DGSPackage.ATTRIBUTE__OTHER_VALUES:
        return getOtherValues();
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
      case DGSPackage.ATTRIBUTE__OPERATOR:
        setOperator((String)newValue);
        return;
      case DGSPackage.ATTRIBUTE__ID_ATTRIBUTE:
        setIdAttribute((String)newValue);
        return;
      case DGSPackage.ATTRIBUTE__ASSIGN:
        setAssign((String)newValue);
        return;
      case DGSPackage.ATTRIBUTE__VALUE:
        setValue((Value)newValue);
        return;
      case DGSPackage.ATTRIBUTE__OTHER_VALUES:
        getOtherValues().clear();
        getOtherValues().addAll((Collection<? extends Value>)newValue);
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
      case DGSPackage.ATTRIBUTE__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case DGSPackage.ATTRIBUTE__ID_ATTRIBUTE:
        setIdAttribute(ID_ATTRIBUTE_EDEFAULT);
        return;
      case DGSPackage.ATTRIBUTE__ASSIGN:
        setAssign(ASSIGN_EDEFAULT);
        return;
      case DGSPackage.ATTRIBUTE__VALUE:
        setValue((Value)null);
        return;
      case DGSPackage.ATTRIBUTE__OTHER_VALUES:
        getOtherValues().clear();
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
      case DGSPackage.ATTRIBUTE__OPERATOR:
        return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
      case DGSPackage.ATTRIBUTE__ID_ATTRIBUTE:
        return ID_ATTRIBUTE_EDEFAULT == null ? idAttribute != null : !ID_ATTRIBUTE_EDEFAULT.equals(idAttribute);
      case DGSPackage.ATTRIBUTE__ASSIGN:
        return ASSIGN_EDEFAULT == null ? assign != null : !ASSIGN_EDEFAULT.equals(assign);
      case DGSPackage.ATTRIBUTE__VALUE:
        return value != null;
      case DGSPackage.ATTRIBUTE__OTHER_VALUES:
        return otherValues != null && !otherValues.isEmpty();
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
    result.append(" (operator: ");
    result.append(operator);
    result.append(", idAttribute: ");
    result.append(idAttribute);
    result.append(", assign: ");
    result.append(assign);
    result.append(')');
    return result.toString();
  }

} //AttributeImpl
