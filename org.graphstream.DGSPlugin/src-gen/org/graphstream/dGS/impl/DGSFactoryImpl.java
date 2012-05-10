/**
 * <copyright>
 * </copyright>
 *

 */
package org.graphstream.dGS.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.graphstream.dGS.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DGSFactoryImpl extends EFactoryImpl implements DGSFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DGSFactory init()
  {
    try
    {
      DGSFactory theDGSFactory = (DGSFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.graphstream.org/DGS"); 
      if (theDGSFactory != null)
      {
        return theDGSFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DGSFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DGSFactoryImpl()
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
      case DGSPackage.DGS: return createDgs();
      case DGSPackage.HEADER: return createHeader();
      case DGSPackage.EVENT: return createEvent();
      case DGSPackage.AN: return createAn();
      case DGSPackage.CN: return createCn();
      case DGSPackage.DN: return createDn();
      case DGSPackage.AE: return createAe();
      case DGSPackage.CE: return createCe();
      case DGSPackage.DE: return createDe();
      case DGSPackage.CG: return createCg();
      case DGSPackage.ST: return createSt();
      case DGSPackage.ATTRIBUTES: return createAttributes();
      case DGSPackage.ATTRIBUTE: return createAttribute();
      case DGSPackage.VALUE: return createValue();
      case DGSPackage.ARRAY: return createArray();
      case DGSPackage.MAP: return createMap();
      case DGSPackage.MAPPING: return createMapping();
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
  public DGSPackage getDGSPackage()
  {
    return (DGSPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DGSPackage getPackage()
  {
    return DGSPackage.eINSTANCE;
  }

} //DGSFactoryImpl
