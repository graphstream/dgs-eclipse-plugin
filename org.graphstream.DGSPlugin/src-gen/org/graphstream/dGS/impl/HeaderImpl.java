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
import org.graphstream.dGS.Header;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.graphstream.dGS.impl.HeaderImpl#getMagic <em>Magic</em>}</li>
 *   <li>{@link org.graphstream.dGS.impl.HeaderImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.graphstream.dGS.impl.HeaderImpl#getNumberOfSteps <em>Number Of Steps</em>}</li>
 *   <li>{@link org.graphstream.dGS.impl.HeaderImpl#getNumberOfEvents <em>Number Of Events</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HeaderImpl extends MinimalEObjectImpl.Container implements Header
{
  /**
   * The default value of the '{@link #getMagic() <em>Magic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMagic()
   * @generated
   * @ordered
   */
  protected static final String MAGIC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMagic() <em>Magic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMagic()
   * @generated
   * @ordered
   */
  protected String magic = MAGIC_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getNumberOfSteps() <em>Number Of Steps</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumberOfSteps()
   * @generated
   * @ordered
   */
  protected static final int NUMBER_OF_STEPS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNumberOfSteps() <em>Number Of Steps</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumberOfSteps()
   * @generated
   * @ordered
   */
  protected int numberOfSteps = NUMBER_OF_STEPS_EDEFAULT;

  /**
   * The default value of the '{@link #getNumberOfEvents() <em>Number Of Events</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumberOfEvents()
   * @generated
   * @ordered
   */
  protected static final int NUMBER_OF_EVENTS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNumberOfEvents() <em>Number Of Events</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumberOfEvents()
   * @generated
   * @ordered
   */
  protected int numberOfEvents = NUMBER_OF_EVENTS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HeaderImpl()
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
    return DGSPackage.Literals.HEADER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMagic()
  {
    return magic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMagic(String newMagic)
  {
    String oldMagic = magic;
    magic = newMagic;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DGSPackage.HEADER__MAGIC, oldMagic, magic));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DGSPackage.HEADER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getNumberOfSteps()
  {
    return numberOfSteps;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumberOfSteps(int newNumberOfSteps)
  {
    int oldNumberOfSteps = numberOfSteps;
    numberOfSteps = newNumberOfSteps;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DGSPackage.HEADER__NUMBER_OF_STEPS, oldNumberOfSteps, numberOfSteps));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getNumberOfEvents()
  {
    return numberOfEvents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumberOfEvents(int newNumberOfEvents)
  {
    int oldNumberOfEvents = numberOfEvents;
    numberOfEvents = newNumberOfEvents;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DGSPackage.HEADER__NUMBER_OF_EVENTS, oldNumberOfEvents, numberOfEvents));
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
      case DGSPackage.HEADER__MAGIC:
        return getMagic();
      case DGSPackage.HEADER__NAME:
        return getName();
      case DGSPackage.HEADER__NUMBER_OF_STEPS:
        return getNumberOfSteps();
      case DGSPackage.HEADER__NUMBER_OF_EVENTS:
        return getNumberOfEvents();
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
      case DGSPackage.HEADER__MAGIC:
        setMagic((String)newValue);
        return;
      case DGSPackage.HEADER__NAME:
        setName((String)newValue);
        return;
      case DGSPackage.HEADER__NUMBER_OF_STEPS:
        setNumberOfSteps((Integer)newValue);
        return;
      case DGSPackage.HEADER__NUMBER_OF_EVENTS:
        setNumberOfEvents((Integer)newValue);
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
      case DGSPackage.HEADER__MAGIC:
        setMagic(MAGIC_EDEFAULT);
        return;
      case DGSPackage.HEADER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DGSPackage.HEADER__NUMBER_OF_STEPS:
        setNumberOfSteps(NUMBER_OF_STEPS_EDEFAULT);
        return;
      case DGSPackage.HEADER__NUMBER_OF_EVENTS:
        setNumberOfEvents(NUMBER_OF_EVENTS_EDEFAULT);
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
      case DGSPackage.HEADER__MAGIC:
        return MAGIC_EDEFAULT == null ? magic != null : !MAGIC_EDEFAULT.equals(magic);
      case DGSPackage.HEADER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DGSPackage.HEADER__NUMBER_OF_STEPS:
        return numberOfSteps != NUMBER_OF_STEPS_EDEFAULT;
      case DGSPackage.HEADER__NUMBER_OF_EVENTS:
        return numberOfEvents != NUMBER_OF_EVENTS_EDEFAULT;
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
    result.append(" (magic: ");
    result.append(magic);
    result.append(", name: ");
    result.append(name);
    result.append(", numberOfSteps: ");
    result.append(numberOfSteps);
    result.append(", numberOfEvents: ");
    result.append(numberOfEvents);
    result.append(')');
    return result.toString();
  }

} //HeaderImpl
