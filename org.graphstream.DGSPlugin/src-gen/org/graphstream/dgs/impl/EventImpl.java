/**
 * <copyright>
 * </copyright>
 *
 */
package org.graphstream.dgs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.graphstream.dgs.Ae;
import org.graphstream.dgs.An;
import org.graphstream.dgs.Ce;
import org.graphstream.dgs.Cg;
import org.graphstream.dgs.Cn;
import org.graphstream.dgs.De;
import org.graphstream.dgs.DgsPackage;
import org.graphstream.dgs.Dn;
import org.graphstream.dgs.Event;
import org.graphstream.dgs.St;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.graphstream.dgs.impl.EventImpl#getAn <em>An</em>}</li>
 *   <li>{@link org.graphstream.dgs.impl.EventImpl#getCn <em>Cn</em>}</li>
 *   <li>{@link org.graphstream.dgs.impl.EventImpl#getDn <em>Dn</em>}</li>
 *   <li>{@link org.graphstream.dgs.impl.EventImpl#getAe <em>Ae</em>}</li>
 *   <li>{@link org.graphstream.dgs.impl.EventImpl#getCe <em>Ce</em>}</li>
 *   <li>{@link org.graphstream.dgs.impl.EventImpl#getDe <em>De</em>}</li>
 *   <li>{@link org.graphstream.dgs.impl.EventImpl#getCg <em>Cg</em>}</li>
 *   <li>{@link org.graphstream.dgs.impl.EventImpl#getSt <em>St</em>}</li>
 *   <li>{@link org.graphstream.dgs.impl.EventImpl#getCl <em>Cl</em>}</li>
 *   <li>{@link org.graphstream.dgs.impl.EventImpl#getComment <em>Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventImpl extends MinimalEObjectImpl.Container implements Event
{
  /**
   * The cached value of the '{@link #getAn() <em>An</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAn()
   * @generated
   * @ordered
   */
  protected An an;

  /**
   * The cached value of the '{@link #getCn() <em>Cn</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCn()
   * @generated
   * @ordered
   */
  protected Cn cn;

  /**
   * The cached value of the '{@link #getDn() <em>Dn</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDn()
   * @generated
   * @ordered
   */
  protected Dn dn;

  /**
   * The cached value of the '{@link #getAe() <em>Ae</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAe()
   * @generated
   * @ordered
   */
  protected Ae ae;

  /**
   * The cached value of the '{@link #getCe() <em>Ce</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCe()
   * @generated
   * @ordered
   */
  protected Ce ce;

  /**
   * The cached value of the '{@link #getDe() <em>De</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDe()
   * @generated
   * @ordered
   */
  protected De de;

  /**
   * The cached value of the '{@link #getCg() <em>Cg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCg()
   * @generated
   * @ordered
   */
  protected Cg cg;

  /**
   * The cached value of the '{@link #getSt() <em>St</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSt()
   * @generated
   * @ordered
   */
  protected St st;

  /**
   * The default value of the '{@link #getCl() <em>Cl</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCl()
   * @generated
   * @ordered
   */
  protected static final String CL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCl() <em>Cl</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCl()
   * @generated
   * @ordered
   */
  protected String cl = CL_EDEFAULT;

  /**
   * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComment()
   * @generated
   * @ordered
   */
  protected static final String COMMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComment()
   * @generated
   * @ordered
   */
  protected String comment = COMMENT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EventImpl()
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
    return DgsPackage.Literals.EVENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public An getAn()
  {
    return an;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAn(An newAn, NotificationChain msgs)
  {
    An oldAn = an;
    an = newAn;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DgsPackage.EVENT__AN, oldAn, newAn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAn(An newAn)
  {
    if (newAn != an)
    {
      NotificationChain msgs = null;
      if (an != null)
        msgs = ((InternalEObject)an).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DgsPackage.EVENT__AN, null, msgs);
      if (newAn != null)
        msgs = ((InternalEObject)newAn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DgsPackage.EVENT__AN, null, msgs);
      msgs = basicSetAn(newAn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DgsPackage.EVENT__AN, newAn, newAn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cn getCn()
  {
    return cn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCn(Cn newCn, NotificationChain msgs)
  {
    Cn oldCn = cn;
    cn = newCn;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DgsPackage.EVENT__CN, oldCn, newCn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCn(Cn newCn)
  {
    if (newCn != cn)
    {
      NotificationChain msgs = null;
      if (cn != null)
        msgs = ((InternalEObject)cn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DgsPackage.EVENT__CN, null, msgs);
      if (newCn != null)
        msgs = ((InternalEObject)newCn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DgsPackage.EVENT__CN, null, msgs);
      msgs = basicSetCn(newCn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DgsPackage.EVENT__CN, newCn, newCn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dn getDn()
  {
    return dn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDn(Dn newDn, NotificationChain msgs)
  {
    Dn oldDn = dn;
    dn = newDn;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DgsPackage.EVENT__DN, oldDn, newDn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDn(Dn newDn)
  {
    if (newDn != dn)
    {
      NotificationChain msgs = null;
      if (dn != null)
        msgs = ((InternalEObject)dn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DgsPackage.EVENT__DN, null, msgs);
      if (newDn != null)
        msgs = ((InternalEObject)newDn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DgsPackage.EVENT__DN, null, msgs);
      msgs = basicSetDn(newDn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DgsPackage.EVENT__DN, newDn, newDn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ae getAe()
  {
    return ae;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAe(Ae newAe, NotificationChain msgs)
  {
    Ae oldAe = ae;
    ae = newAe;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DgsPackage.EVENT__AE, oldAe, newAe);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAe(Ae newAe)
  {
    if (newAe != ae)
    {
      NotificationChain msgs = null;
      if (ae != null)
        msgs = ((InternalEObject)ae).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DgsPackage.EVENT__AE, null, msgs);
      if (newAe != null)
        msgs = ((InternalEObject)newAe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DgsPackage.EVENT__AE, null, msgs);
      msgs = basicSetAe(newAe, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DgsPackage.EVENT__AE, newAe, newAe));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ce getCe()
  {
    return ce;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCe(Ce newCe, NotificationChain msgs)
  {
    Ce oldCe = ce;
    ce = newCe;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DgsPackage.EVENT__CE, oldCe, newCe);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCe(Ce newCe)
  {
    if (newCe != ce)
    {
      NotificationChain msgs = null;
      if (ce != null)
        msgs = ((InternalEObject)ce).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DgsPackage.EVENT__CE, null, msgs);
      if (newCe != null)
        msgs = ((InternalEObject)newCe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DgsPackage.EVENT__CE, null, msgs);
      msgs = basicSetCe(newCe, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DgsPackage.EVENT__CE, newCe, newCe));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public De getDe()
  {
    return de;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDe(De newDe, NotificationChain msgs)
  {
    De oldDe = de;
    de = newDe;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DgsPackage.EVENT__DE, oldDe, newDe);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDe(De newDe)
  {
    if (newDe != de)
    {
      NotificationChain msgs = null;
      if (de != null)
        msgs = ((InternalEObject)de).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DgsPackage.EVENT__DE, null, msgs);
      if (newDe != null)
        msgs = ((InternalEObject)newDe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DgsPackage.EVENT__DE, null, msgs);
      msgs = basicSetDe(newDe, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DgsPackage.EVENT__DE, newDe, newDe));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cg getCg()
  {
    return cg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCg(Cg newCg, NotificationChain msgs)
  {
    Cg oldCg = cg;
    cg = newCg;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DgsPackage.EVENT__CG, oldCg, newCg);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCg(Cg newCg)
  {
    if (newCg != cg)
    {
      NotificationChain msgs = null;
      if (cg != null)
        msgs = ((InternalEObject)cg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DgsPackage.EVENT__CG, null, msgs);
      if (newCg != null)
        msgs = ((InternalEObject)newCg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DgsPackage.EVENT__CG, null, msgs);
      msgs = basicSetCg(newCg, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DgsPackage.EVENT__CG, newCg, newCg));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public St getSt()
  {
    return st;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSt(St newSt, NotificationChain msgs)
  {
    St oldSt = st;
    st = newSt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DgsPackage.EVENT__ST, oldSt, newSt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSt(St newSt)
  {
    if (newSt != st)
    {
      NotificationChain msgs = null;
      if (st != null)
        msgs = ((InternalEObject)st).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DgsPackage.EVENT__ST, null, msgs);
      if (newSt != null)
        msgs = ((InternalEObject)newSt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DgsPackage.EVENT__ST, null, msgs);
      msgs = basicSetSt(newSt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DgsPackage.EVENT__ST, newSt, newSt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCl()
  {
    return cl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCl(String newCl)
  {
    String oldCl = cl;
    cl = newCl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DgsPackage.EVENT__CL, oldCl, cl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getComment()
  {
    return comment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComment(String newComment)
  {
    String oldComment = comment;
    comment = newComment;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DgsPackage.EVENT__COMMENT, oldComment, comment));
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
      case DgsPackage.EVENT__AN:
        return basicSetAn(null, msgs);
      case DgsPackage.EVENT__CN:
        return basicSetCn(null, msgs);
      case DgsPackage.EVENT__DN:
        return basicSetDn(null, msgs);
      case DgsPackage.EVENT__AE:
        return basicSetAe(null, msgs);
      case DgsPackage.EVENT__CE:
        return basicSetCe(null, msgs);
      case DgsPackage.EVENT__DE:
        return basicSetDe(null, msgs);
      case DgsPackage.EVENT__CG:
        return basicSetCg(null, msgs);
      case DgsPackage.EVENT__ST:
        return basicSetSt(null, msgs);
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
      case DgsPackage.EVENT__AN:
        return getAn();
      case DgsPackage.EVENT__CN:
        return getCn();
      case DgsPackage.EVENT__DN:
        return getDn();
      case DgsPackage.EVENT__AE:
        return getAe();
      case DgsPackage.EVENT__CE:
        return getCe();
      case DgsPackage.EVENT__DE:
        return getDe();
      case DgsPackage.EVENT__CG:
        return getCg();
      case DgsPackage.EVENT__ST:
        return getSt();
      case DgsPackage.EVENT__CL:
        return getCl();
      case DgsPackage.EVENT__COMMENT:
        return getComment();
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
      case DgsPackage.EVENT__AN:
        setAn((An)newValue);
        return;
      case DgsPackage.EVENT__CN:
        setCn((Cn)newValue);
        return;
      case DgsPackage.EVENT__DN:
        setDn((Dn)newValue);
        return;
      case DgsPackage.EVENT__AE:
        setAe((Ae)newValue);
        return;
      case DgsPackage.EVENT__CE:
        setCe((Ce)newValue);
        return;
      case DgsPackage.EVENT__DE:
        setDe((De)newValue);
        return;
      case DgsPackage.EVENT__CG:
        setCg((Cg)newValue);
        return;
      case DgsPackage.EVENT__ST:
        setSt((St)newValue);
        return;
      case DgsPackage.EVENT__CL:
        setCl((String)newValue);
        return;
      case DgsPackage.EVENT__COMMENT:
        setComment((String)newValue);
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
      case DgsPackage.EVENT__AN:
        setAn((An)null);
        return;
      case DgsPackage.EVENT__CN:
        setCn((Cn)null);
        return;
      case DgsPackage.EVENT__DN:
        setDn((Dn)null);
        return;
      case DgsPackage.EVENT__AE:
        setAe((Ae)null);
        return;
      case DgsPackage.EVENT__CE:
        setCe((Ce)null);
        return;
      case DgsPackage.EVENT__DE:
        setDe((De)null);
        return;
      case DgsPackage.EVENT__CG:
        setCg((Cg)null);
        return;
      case DgsPackage.EVENT__ST:
        setSt((St)null);
        return;
      case DgsPackage.EVENT__CL:
        setCl(CL_EDEFAULT);
        return;
      case DgsPackage.EVENT__COMMENT:
        setComment(COMMENT_EDEFAULT);
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
      case DgsPackage.EVENT__AN:
        return an != null;
      case DgsPackage.EVENT__CN:
        return cn != null;
      case DgsPackage.EVENT__DN:
        return dn != null;
      case DgsPackage.EVENT__AE:
        return ae != null;
      case DgsPackage.EVENT__CE:
        return ce != null;
      case DgsPackage.EVENT__DE:
        return de != null;
      case DgsPackage.EVENT__CG:
        return cg != null;
      case DgsPackage.EVENT__ST:
        return st != null;
      case DgsPackage.EVENT__CL:
        return CL_EDEFAULT == null ? cl != null : !CL_EDEFAULT.equals(cl);
      case DgsPackage.EVENT__COMMENT:
        return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
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
    result.append(" (cl: ");
    result.append(cl);
    result.append(", comment: ");
    result.append(comment);
    result.append(')');
    return result.toString();
  }

} //EventImpl
