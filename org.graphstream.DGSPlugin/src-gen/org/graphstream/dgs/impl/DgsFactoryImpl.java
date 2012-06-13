/**
 * <copyright>
 * </copyright>
 *
 */
package org.graphstream.dgs.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.graphstream.dgs.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DgsFactoryImpl extends EFactoryImpl implements DgsFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DgsFactory init()
  {
    try
    {
      DgsFactory theDgsFactory = (DgsFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.graphstream.org/DGS"); 
      if (theDgsFactory != null)
      {
        return theDgsFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DgsFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DgsFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DgsPackage.DGS: return createDgs();
      case DgsPackage.HEADER: return createHeader();
      case DgsPackage.EVENT: return createEvent();
      case DgsPackage.AN: return createAn();
      case DgsPackage.CN: return createCn();
      case DgsPackage.DN: return createDn();
      case DgsPackage.AE: return createAe();
      case DgsPackage.CE: return createCe();
      case DgsPackage.DE: return createDe();
      case DgsPackage.CG: return createCg();
      case DgsPackage.ST: return createSt();
      case DgsPackage.ATTRIBUTES: return createAttributes();
      case DgsPackage.ATTRIBUTE: return createAttribute();
      case DgsPackage.VALUE: return createValue();
      case DgsPackage.ARRAY: return createArray();
      case DgsPackage.MAP: return createMap();
      case DgsPackage.MAPPING: return createMapping();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dgs createDgs()
  {
    DgsImpl dgs = new DgsImpl();
    return dgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Header createHeader()
  {
    HeaderImpl header = new HeaderImpl();
    return header;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Event createEvent()
  {
    EventImpl event = new EventImpl();
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public An createAn()
  {
    AnImpl an = new AnImpl();
    return an;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cn createCn()
  {
    CnImpl cn = new CnImpl();
    return cn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dn createDn()
  {
    DnImpl dn = new DnImpl();
    return dn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ae createAe()
  {
    AeImpl ae = new AeImpl();
    return ae;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ce createCe()
  {
    CeImpl ce = new CeImpl();
    return ce;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public De createDe()
  {
    DeImpl de = new DeImpl();
    return de;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cg createCg()
  {
    CgImpl cg = new CgImpl();
    return cg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public St createSt()
  {
    StImpl st = new StImpl();
    return st;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attributes createAttributes()
  {
    AttributesImpl attributes = new AttributesImpl();
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value createValue()
  {
    ValueImpl value = new ValueImpl();
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Array createArray()
  {
    ArrayImpl array = new ArrayImpl();
    return array;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Map createMap()
  {
    MapImpl map = new MapImpl();
    return map;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mapping createMapping()
  {
    MappingImpl mapping = new MappingImpl();
    return mapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DgsPackage getDgsPackage()
  {
    return (DgsPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DgsPackage getPackage()
  {
    return DgsPackage.eINSTANCE;
  }

} //DgsFactoryImpl
