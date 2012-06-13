/**
 * <copyright>
 * </copyright>
 *
 */
package org.graphstream.dgs;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.graphstream.dgs.DgsFactory
 * @model kind="package"
 * @generated
 */
public interface DgsPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "dgs";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.graphstream.org/DGS";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "dgs";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DgsPackage eINSTANCE = org.graphstream.dgs.impl.DgsPackageImpl.init();

  /**
   * The meta object id for the '{@link org.graphstream.dgs.impl.DgsImpl <em>Dgs</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.graphstream.dgs.impl.DgsImpl
   * @see org.graphstream.dgs.impl.DgsPackageImpl#getDgs()
   * @generated
   */
  int DGS = 0;

  /**
   * The feature id for the '<em><b>Header</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DGS__HEADER = 0;

  /**
   * The feature id for the '<em><b>Event</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DGS__EVENT = 1;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DGS__COMMENT = 2;

  /**
   * The number of structural features of the '<em>Dgs</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DGS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.graphstream.dgs.impl.HeaderImpl <em>Header</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.graphstream.dgs.impl.HeaderImpl
   * @see org.graphstream.dgs.impl.DgsPackageImpl#getHeader()
   * @generated
   */
  int HEADER = 1;

  /**
   * The feature id for the '<em><b>Magic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER__MAGIC = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER__NAME = 1;

  /**
   * The feature id for the '<em><b>Number Of Steps</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER__NUMBER_OF_STEPS = 2;

  /**
   * The feature id for the '<em><b>Number Of Events</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER__NUMBER_OF_EVENTS = 3;

  /**
   * The number of structural features of the '<em>Header</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.graphstream.dgs.impl.EventImpl <em>Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.graphstream.dgs.impl.EventImpl
   * @see org.graphstream.dgs.impl.DgsPackageImpl#getEvent()
   * @generated
   */
  int EVENT = 2;

  /**
   * The feature id for the '<em><b>An</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__AN = 0;

  /**
   * The feature id for the '<em><b>Cn</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__CN = 1;

  /**
   * The feature id for the '<em><b>Dn</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__DN = 2;

  /**
   * The feature id for the '<em><b>Ae</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__AE = 3;

  /**
   * The feature id for the '<em><b>Ce</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__CE = 4;

  /**
   * The feature id for the '<em><b>De</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__DE = 5;

  /**
   * The feature id for the '<em><b>Cg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__CG = 6;

  /**
   * The feature id for the '<em><b>St</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__ST = 7;

  /**
   * The feature id for the '<em><b>Cl</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__CL = 8;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__COMMENT = 9;

  /**
   * The number of structural features of the '<em>Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE_COUNT = 10;

  /**
   * The meta object id for the '{@link org.graphstream.dgs.impl.AnImpl <em>An</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.graphstream.dgs.impl.AnImpl
   * @see org.graphstream.dgs.impl.DgsPackageImpl#getAn()
   * @generated
   */
  int AN = 3;

  /**
   * The feature id for the '<em><b>Id Node</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AN__ID_NODE = 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AN__ATTRIBUTES = 1;

  /**
   * The number of structural features of the '<em>An</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.graphstream.dgs.impl.CnImpl <em>Cn</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.graphstream.dgs.impl.CnImpl
   * @see org.graphstream.dgs.impl.DgsPackageImpl#getCn()
   * @generated
   */
  int CN = 4;

  /**
   * The feature id for the '<em><b>Id Node</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CN__ID_NODE = 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CN__ATTRIBUTES = 1;

  /**
   * The number of structural features of the '<em>Cn</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.graphstream.dgs.impl.DnImpl <em>Dn</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.graphstream.dgs.impl.DnImpl
   * @see org.graphstream.dgs.impl.DgsPackageImpl#getDn()
   * @generated
   */
  int DN = 5;

  /**
   * The feature id for the '<em><b>Id Node</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DN__ID_NODE = 0;

  /**
   * The number of structural features of the '<em>Dn</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DN_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.graphstream.dgs.impl.AeImpl <em>Ae</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.graphstream.dgs.impl.AeImpl
   * @see org.graphstream.dgs.impl.DgsPackageImpl#getAe()
   * @generated
   */
  int AE = 6;

  /**
   * The feature id for the '<em><b>Id Edge</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AE__ID_EDGE = 0;

  /**
   * The feature id for the '<em><b>Id Node1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AE__ID_NODE1 = 1;

  /**
   * The feature id for the '<em><b>Direction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AE__DIRECTION = 2;

  /**
   * The feature id for the '<em><b>Id Node2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AE__ID_NODE2 = 3;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AE__ATTRIBUTES = 4;

  /**
   * The number of structural features of the '<em>Ae</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.graphstream.dgs.impl.CeImpl <em>Ce</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.graphstream.dgs.impl.CeImpl
   * @see org.graphstream.dgs.impl.DgsPackageImpl#getCe()
   * @generated
   */
  int CE = 7;

  /**
   * The feature id for the '<em><b>Id Edge</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CE__ID_EDGE = 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CE__ATTRIBUTES = 1;

  /**
   * The number of structural features of the '<em>Ce</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.graphstream.dgs.impl.DeImpl <em>De</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.graphstream.dgs.impl.DeImpl
   * @see org.graphstream.dgs.impl.DgsPackageImpl#getDe()
   * @generated
   */
  int DE = 8;

  /**
   * The feature id for the '<em><b>Id Edge</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DE__ID_EDGE = 0;

  /**
   * The number of structural features of the '<em>De</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.graphstream.dgs.impl.CgImpl <em>Cg</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.graphstream.dgs.impl.CgImpl
   * @see org.graphstream.dgs.impl.DgsPackageImpl#getCg()
   * @generated
   */
  int CG = 9;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CG__ATTRIBUTES = 0;

  /**
   * The number of structural features of the '<em>Cg</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CG_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.graphstream.dgs.impl.StImpl <em>St</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.graphstream.dgs.impl.StImpl
   * @see org.graphstream.dgs.impl.DgsPackageImpl#getSt()
   * @generated
   */
  int ST = 10;

  /**
   * The feature id for the '<em><b>Real</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ST__REAL = 0;

  /**
   * The number of structural features of the '<em>St</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.graphstream.dgs.impl.AttributesImpl <em>Attributes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.graphstream.dgs.impl.AttributesImpl
   * @see org.graphstream.dgs.impl.DgsPackageImpl#getAttributes()
   * @generated
   */
  int ATTRIBUTES = 11;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTES__ATTRIBUTE = 0;

  /**
   * The number of structural features of the '<em>Attributes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.graphstream.dgs.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.graphstream.dgs.impl.AttributeImpl
   * @see org.graphstream.dgs.impl.DgsPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 12;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__OPERATOR = 0;

  /**
   * The feature id for the '<em><b>Id Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__ID_ATTRIBUTE = 1;

  /**
   * The feature id for the '<em><b>Assign</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__ASSIGN = 2;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__VALUE = 3;

  /**
   * The feature id for the '<em><b>Other Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__OTHER_VALUES = 4;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.graphstream.dgs.impl.ValueImpl <em>Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.graphstream.dgs.impl.ValueImpl
   * @see org.graphstream.dgs.impl.DgsPackageImpl#getValue()
   * @generated
   */
  int VALUE = 13;

  /**
   * The feature id for the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__STRING = 0;

  /**
   * The feature id for the '<em><b>Real</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__REAL = 1;

  /**
   * The feature id for the '<em><b>Int</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__INT = 2;

  /**
   * The feature id for the '<em><b>Array</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__ARRAY = 3;

  /**
   * The feature id for the '<em><b>Map</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__MAP = 4;

  /**
   * The number of structural features of the '<em>Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.graphstream.dgs.impl.ArrayImpl <em>Array</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.graphstream.dgs.impl.ArrayImpl
   * @see org.graphstream.dgs.impl.DgsPackageImpl#getArray()
   * @generated
   */
  int ARRAY = 14;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY__VALUE = 0;

  /**
   * The feature id for the '<em><b>Other Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY__OTHER_VALUES = 1;

  /**
   * The number of structural features of the '<em>Array</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.graphstream.dgs.impl.MapImpl <em>Map</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.graphstream.dgs.impl.MapImpl
   * @see org.graphstream.dgs.impl.DgsPackageImpl#getMap()
   * @generated
   */
  int MAP = 15;

  /**
   * The feature id for the '<em><b>Mapping</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP__MAPPING = 0;

  /**
   * The feature id for the '<em><b>Other Mapping</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP__OTHER_MAPPING = 1;

  /**
   * The number of structural features of the '<em>Map</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.graphstream.dgs.impl.MappingImpl <em>Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.graphstream.dgs.impl.MappingImpl
   * @see org.graphstream.dgs.impl.DgsPackageImpl#getMapping()
   * @generated
   */
  int MAPPING = 16;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__ID = 0;

  /**
   * The feature id for the '<em><b>Assign</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__ASSIGN = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__VALUE = 2;

  /**
   * The number of structural features of the '<em>Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link org.graphstream.dgs.Dgs <em>Dgs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dgs</em>'.
   * @see org.graphstream.dgs.Dgs
   * @generated
   */
  EClass getDgs();

  /**
   * Returns the meta object for the containment reference '{@link org.graphstream.dgs.Dgs#getHeader <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Header</em>'.
   * @see org.graphstream.dgs.Dgs#getHeader()
   * @see #getDgs()
   * @generated
   */
  EReference getDgs_Header();

  /**
   * Returns the meta object for the containment reference list '{@link org.graphstream.dgs.Dgs#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Event</em>'.
   * @see org.graphstream.dgs.Dgs#getEvent()
   * @see #getDgs()
   * @generated
   */
  EReference getDgs_Event();

  /**
   * Returns the meta object for the attribute list '{@link org.graphstream.dgs.Dgs#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Comment</em>'.
   * @see org.graphstream.dgs.Dgs#getComment()
   * @see #getDgs()
   * @generated
   */
  EAttribute getDgs_Comment();

  /**
   * Returns the meta object for class '{@link org.graphstream.dgs.Header <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Header</em>'.
   * @see org.graphstream.dgs.Header
   * @generated
   */
  EClass getHeader();

  /**
   * Returns the meta object for the attribute '{@link org.graphstream.dgs.Header#getMagic <em>Magic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Magic</em>'.
   * @see org.graphstream.dgs.Header#getMagic()
   * @see #getHeader()
   * @generated
   */
  EAttribute getHeader_Magic();

  /**
   * Returns the meta object for the attribute '{@link org.graphstream.dgs.Header#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.graphstream.dgs.Header#getName()
   * @see #getHeader()
   * @generated
   */
  EAttribute getHeader_Name();

  /**
   * Returns the meta object for the attribute '{@link org.graphstream.dgs.Header#getNumberOfSteps <em>Number Of Steps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number Of Steps</em>'.
   * @see org.graphstream.dgs.Header#getNumberOfSteps()
   * @see #getHeader()
   * @generated
   */
  EAttribute getHeader_NumberOfSteps();

  /**
   * Returns the meta object for the attribute '{@link org.graphstream.dgs.Header#getNumberOfEvents <em>Number Of Events</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number Of Events</em>'.
   * @see org.graphstream.dgs.Header#getNumberOfEvents()
   * @see #getHeader()
   * @generated
   */
  EAttribute getHeader_NumberOfEvents();

  /**
   * Returns the meta object for class '{@link org.graphstream.dgs.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event</em>'.
   * @see org.graphstream.dgs.Event
   * @generated
   */
  EClass getEvent();

  /**
   * Returns the meta object for the containment reference '{@link org.graphstream.dgs.Event#getAn <em>An</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>An</em>'.
   * @see org.graphstream.dgs.Event#getAn()
   * @see #getEvent()
   * @generated
   */
  EReference getEvent_An();

  /**
   * Returns the meta object for the containment reference '{@link org.graphstream.dgs.Event#getCn <em>Cn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cn</em>'.
   * @see org.graphstream.dgs.Event#getCn()
   * @see #getEvent()
   * @generated
   */
  EReference getEvent_Cn();

  /**
   * Returns the meta object for the containment reference '{@link org.graphstream.dgs.Event#getDn <em>Dn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dn</em>'.
   * @see org.graphstream.dgs.Event#getDn()
   * @see #getEvent()
   * @generated
   */
  EReference getEvent_Dn();

  /**
   * Returns the meta object for the containment reference '{@link org.graphstream.dgs.Event#getAe <em>Ae</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ae</em>'.
   * @see org.graphstream.dgs.Event#getAe()
   * @see #getEvent()
   * @generated
   */
  EReference getEvent_Ae();

  /**
   * Returns the meta object for the containment reference '{@link org.graphstream.dgs.Event#getCe <em>Ce</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ce</em>'.
   * @see org.graphstream.dgs.Event#getCe()
   * @see #getEvent()
   * @generated
   */
  EReference getEvent_Ce();

  /**
   * Returns the meta object for the containment reference '{@link org.graphstream.dgs.Event#getDe <em>De</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>De</em>'.
   * @see org.graphstream.dgs.Event#getDe()
   * @see #getEvent()
   * @generated
   */
  EReference getEvent_De();

  /**
   * Returns the meta object for the containment reference '{@link org.graphstream.dgs.Event#getCg <em>Cg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cg</em>'.
   * @see org.graphstream.dgs.Event#getCg()
   * @see #getEvent()
   * @generated
   */
  EReference getEvent_Cg();

  /**
   * Returns the meta object for the containment reference '{@link org.graphstream.dgs.Event#getSt <em>St</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>St</em>'.
   * @see org.graphstream.dgs.Event#getSt()
   * @see #getEvent()
   * @generated
   */
  EReference getEvent_St();

  /**
   * Returns the meta object for the attribute '{@link org.graphstream.dgs.Event#getCl <em>Cl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cl</em>'.
   * @see org.graphstream.dgs.Event#getCl()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_Cl();

  /**
   * Returns the meta object for the attribute '{@link org.graphstream.dgs.Event#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see org.graphstream.dgs.Event#getComment()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_Comment();

  /**
   * Returns the meta object for class '{@link org.graphstream.dgs.An <em>An</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>An</em>'.
   * @see org.graphstream.dgs.An
   * @generated
   */
  EClass getAn();

  /**
   * Returns the meta object for the attribute '{@link org.graphstream.dgs.An#getIdNode <em>Id Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id Node</em>'.
   * @see org.graphstream.dgs.An#getIdNode()
   * @see #getAn()
   * @generated
   */
  EAttribute getAn_IdNode();

  /**
   * Returns the meta object for the containment reference '{@link org.graphstream.dgs.An#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attributes</em>'.
   * @see org.graphstream.dgs.An#getAttributes()
   * @see #getAn()
   * @generated
   */
  EReference getAn_Attributes();

  /**
   * Returns the meta object for class '{@link org.graphstream.dgs.Cn <em>Cn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cn</em>'.
   * @see org.graphstream.dgs.Cn
   * @generated
   */
  EClass getCn();

  /**
   * Returns the meta object for the attribute '{@link org.graphstream.dgs.Cn#getIdNode <em>Id Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id Node</em>'.
   * @see org.graphstream.dgs.Cn#getIdNode()
   * @see #getCn()
   * @generated
   */
  EAttribute getCn_IdNode();

  /**
   * Returns the meta object for the containment reference '{@link org.graphstream.dgs.Cn#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attributes</em>'.
   * @see org.graphstream.dgs.Cn#getAttributes()
   * @see #getCn()
   * @generated
   */
  EReference getCn_Attributes();

  /**
   * Returns the meta object for class '{@link org.graphstream.dgs.Dn <em>Dn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dn</em>'.
   * @see org.graphstream.dgs.Dn
   * @generated
   */
  EClass getDn();

  /**
   * Returns the meta object for the attribute '{@link org.graphstream.dgs.Dn#getIdNode <em>Id Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id Node</em>'.
   * @see org.graphstream.dgs.Dn#getIdNode()
   * @see #getDn()
   * @generated
   */
  EAttribute getDn_IdNode();

  /**
   * Returns the meta object for class '{@link org.graphstream.dgs.Ae <em>Ae</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ae</em>'.
   * @see org.graphstream.dgs.Ae
   * @generated
   */
  EClass getAe();

  /**
   * Returns the meta object for the attribute '{@link org.graphstream.dgs.Ae#getIdEdge <em>Id Edge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id Edge</em>'.
   * @see org.graphstream.dgs.Ae#getIdEdge()
   * @see #getAe()
   * @generated
   */
  EAttribute getAe_IdEdge();

  /**
   * Returns the meta object for the attribute '{@link org.graphstream.dgs.Ae#getIdNode1 <em>Id Node1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id Node1</em>'.
   * @see org.graphstream.dgs.Ae#getIdNode1()
   * @see #getAe()
   * @generated
   */
  EAttribute getAe_IdNode1();

  /**
   * Returns the meta object for the attribute '{@link org.graphstream.dgs.Ae#getDirection <em>Direction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Direction</em>'.
   * @see org.graphstream.dgs.Ae#getDirection()
   * @see #getAe()
   * @generated
   */
  EAttribute getAe_Direction();

  /**
   * Returns the meta object for the attribute '{@link org.graphstream.dgs.Ae#getIdNode2 <em>Id Node2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id Node2</em>'.
   * @see org.graphstream.dgs.Ae#getIdNode2()
   * @see #getAe()
   * @generated
   */
  EAttribute getAe_IdNode2();

  /**
   * Returns the meta object for the containment reference '{@link org.graphstream.dgs.Ae#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attributes</em>'.
   * @see org.graphstream.dgs.Ae#getAttributes()
   * @see #getAe()
   * @generated
   */
  EReference getAe_Attributes();

  /**
   * Returns the meta object for class '{@link org.graphstream.dgs.Ce <em>Ce</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ce</em>'.
   * @see org.graphstream.dgs.Ce
   * @generated
   */
  EClass getCe();

  /**
   * Returns the meta object for the attribute '{@link org.graphstream.dgs.Ce#getIdEdge <em>Id Edge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id Edge</em>'.
   * @see org.graphstream.dgs.Ce#getIdEdge()
   * @see #getCe()
   * @generated
   */
  EAttribute getCe_IdEdge();

  /**
   * Returns the meta object for the containment reference '{@link org.graphstream.dgs.Ce#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attributes</em>'.
   * @see org.graphstream.dgs.Ce#getAttributes()
   * @see #getCe()
   * @generated
   */
  EReference getCe_Attributes();

  /**
   * Returns the meta object for class '{@link org.graphstream.dgs.De <em>De</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>De</em>'.
   * @see org.graphstream.dgs.De
   * @generated
   */
  EClass getDe();

  /**
   * Returns the meta object for the attribute '{@link org.graphstream.dgs.De#getIdEdge <em>Id Edge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id Edge</em>'.
   * @see org.graphstream.dgs.De#getIdEdge()
   * @see #getDe()
   * @generated
   */
  EAttribute getDe_IdEdge();

  /**
   * Returns the meta object for class '{@link org.graphstream.dgs.Cg <em>Cg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cg</em>'.
   * @see org.graphstream.dgs.Cg
   * @generated
   */
  EClass getCg();

  /**
   * Returns the meta object for the containment reference '{@link org.graphstream.dgs.Cg#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attributes</em>'.
   * @see org.graphstream.dgs.Cg#getAttributes()
   * @see #getCg()
   * @generated
   */
  EReference getCg_Attributes();

  /**
   * Returns the meta object for class '{@link org.graphstream.dgs.St <em>St</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>St</em>'.
   * @see org.graphstream.dgs.St
   * @generated
   */
  EClass getSt();

  /**
   * Returns the meta object for the attribute '{@link org.graphstream.dgs.St#getReal <em>Real</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Real</em>'.
   * @see org.graphstream.dgs.St#getReal()
   * @see #getSt()
   * @generated
   */
  EAttribute getSt_Real();

  /**
   * Returns the meta object for class '{@link org.graphstream.dgs.Attributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attributes</em>'.
   * @see org.graphstream.dgs.Attributes
   * @generated
   */
  EClass getAttributes();

  /**
   * Returns the meta object for the containment reference list '{@link org.graphstream.dgs.Attributes#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attribute</em>'.
   * @see org.graphstream.dgs.Attributes#getAttribute()
   * @see #getAttributes()
   * @generated
   */
  EReference getAttributes_Attribute();

  /**
   * Returns the meta object for class '{@link org.graphstream.dgs.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see org.graphstream.dgs.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link org.graphstream.dgs.Attribute#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see org.graphstream.dgs.Attribute#getOperator()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Operator();

  /**
   * Returns the meta object for the attribute '{@link org.graphstream.dgs.Attribute#getIdAttribute <em>Id Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id Attribute</em>'.
   * @see org.graphstream.dgs.Attribute#getIdAttribute()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_IdAttribute();

  /**
   * Returns the meta object for the attribute '{@link org.graphstream.dgs.Attribute#getAssign <em>Assign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Assign</em>'.
   * @see org.graphstream.dgs.Attribute#getAssign()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Assign();

  /**
   * Returns the meta object for the containment reference '{@link org.graphstream.dgs.Attribute#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.graphstream.dgs.Attribute#getValue()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_Value();

  /**
   * Returns the meta object for the containment reference list '{@link org.graphstream.dgs.Attribute#getOtherValues <em>Other Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Other Values</em>'.
   * @see org.graphstream.dgs.Attribute#getOtherValues()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_OtherValues();

  /**
   * Returns the meta object for class '{@link org.graphstream.dgs.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value</em>'.
   * @see org.graphstream.dgs.Value
   * @generated
   */
  EClass getValue();

  /**
   * Returns the meta object for the attribute '{@link org.graphstream.dgs.Value#getString <em>String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String</em>'.
   * @see org.graphstream.dgs.Value#getString()
   * @see #getValue()
   * @generated
   */
  EAttribute getValue_String();

  /**
   * Returns the meta object for the attribute '{@link org.graphstream.dgs.Value#getReal <em>Real</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Real</em>'.
   * @see org.graphstream.dgs.Value#getReal()
   * @see #getValue()
   * @generated
   */
  EAttribute getValue_Real();

  /**
   * Returns the meta object for the attribute '{@link org.graphstream.dgs.Value#getInt <em>Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Int</em>'.
   * @see org.graphstream.dgs.Value#getInt()
   * @see #getValue()
   * @generated
   */
  EAttribute getValue_Int();

  /**
   * Returns the meta object for the containment reference '{@link org.graphstream.dgs.Value#getArray <em>Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Array</em>'.
   * @see org.graphstream.dgs.Value#getArray()
   * @see #getValue()
   * @generated
   */
  EReference getValue_Array();

  /**
   * Returns the meta object for the containment reference '{@link org.graphstream.dgs.Value#getMap <em>Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Map</em>'.
   * @see org.graphstream.dgs.Value#getMap()
   * @see #getValue()
   * @generated
   */
  EReference getValue_Map();

  /**
   * Returns the meta object for class '{@link org.graphstream.dgs.Array <em>Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array</em>'.
   * @see org.graphstream.dgs.Array
   * @generated
   */
  EClass getArray();

  /**
   * Returns the meta object for the containment reference '{@link org.graphstream.dgs.Array#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.graphstream.dgs.Array#getValue()
   * @see #getArray()
   * @generated
   */
  EReference getArray_Value();

  /**
   * Returns the meta object for the containment reference list '{@link org.graphstream.dgs.Array#getOtherValues <em>Other Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Other Values</em>'.
   * @see org.graphstream.dgs.Array#getOtherValues()
   * @see #getArray()
   * @generated
   */
  EReference getArray_OtherValues();

  /**
   * Returns the meta object for class '{@link org.graphstream.dgs.Map <em>Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Map</em>'.
   * @see org.graphstream.dgs.Map
   * @generated
   */
  EClass getMap();

  /**
   * Returns the meta object for the containment reference '{@link org.graphstream.dgs.Map#getMapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mapping</em>'.
   * @see org.graphstream.dgs.Map#getMapping()
   * @see #getMap()
   * @generated
   */
  EReference getMap_Mapping();

  /**
   * Returns the meta object for the containment reference list '{@link org.graphstream.dgs.Map#getOtherMapping <em>Other Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Other Mapping</em>'.
   * @see org.graphstream.dgs.Map#getOtherMapping()
   * @see #getMap()
   * @generated
   */
  EReference getMap_OtherMapping();

  /**
   * Returns the meta object for class '{@link org.graphstream.dgs.Mapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapping</em>'.
   * @see org.graphstream.dgs.Mapping
   * @generated
   */
  EClass getMapping();

  /**
   * Returns the meta object for the attribute '{@link org.graphstream.dgs.Mapping#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.graphstream.dgs.Mapping#getId()
   * @see #getMapping()
   * @generated
   */
  EAttribute getMapping_Id();

  /**
   * Returns the meta object for the attribute '{@link org.graphstream.dgs.Mapping#getAssign <em>Assign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Assign</em>'.
   * @see org.graphstream.dgs.Mapping#getAssign()
   * @see #getMapping()
   * @generated
   */
  EAttribute getMapping_Assign();

  /**
   * Returns the meta object for the containment reference '{@link org.graphstream.dgs.Mapping#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.graphstream.dgs.Mapping#getValue()
   * @see #getMapping()
   * @generated
   */
  EReference getMapping_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DgsFactory getDgsFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.graphstream.dgs.impl.DgsImpl <em>Dgs</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.graphstream.dgs.impl.DgsImpl
     * @see org.graphstream.dgs.impl.DgsPackageImpl#getDgs()
     * @generated
     */
    EClass DGS = eINSTANCE.getDgs();

    /**
     * The meta object literal for the '<em><b>Header</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DGS__HEADER = eINSTANCE.getDgs_Header();

    /**
     * The meta object literal for the '<em><b>Event</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DGS__EVENT = eINSTANCE.getDgs_Event();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DGS__COMMENT = eINSTANCE.getDgs_Comment();

    /**
     * The meta object literal for the '{@link org.graphstream.dgs.impl.HeaderImpl <em>Header</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.graphstream.dgs.impl.HeaderImpl
     * @see org.graphstream.dgs.impl.DgsPackageImpl#getHeader()
     * @generated
     */
    EClass HEADER = eINSTANCE.getHeader();

    /**
     * The meta object literal for the '<em><b>Magic</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HEADER__MAGIC = eINSTANCE.getHeader_Magic();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HEADER__NAME = eINSTANCE.getHeader_Name();

    /**
     * The meta object literal for the '<em><b>Number Of Steps</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HEADER__NUMBER_OF_STEPS = eINSTANCE.getHeader_NumberOfSteps();

    /**
     * The meta object literal for the '<em><b>Number Of Events</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HEADER__NUMBER_OF_EVENTS = eINSTANCE.getHeader_NumberOfEvents();

    /**
     * The meta object literal for the '{@link org.graphstream.dgs.impl.EventImpl <em>Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.graphstream.dgs.impl.EventImpl
     * @see org.graphstream.dgs.impl.DgsPackageImpl#getEvent()
     * @generated
     */
    EClass EVENT = eINSTANCE.getEvent();

    /**
     * The meta object literal for the '<em><b>An</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT__AN = eINSTANCE.getEvent_An();

    /**
     * The meta object literal for the '<em><b>Cn</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT__CN = eINSTANCE.getEvent_Cn();

    /**
     * The meta object literal for the '<em><b>Dn</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT__DN = eINSTANCE.getEvent_Dn();

    /**
     * The meta object literal for the '<em><b>Ae</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT__AE = eINSTANCE.getEvent_Ae();

    /**
     * The meta object literal for the '<em><b>Ce</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT__CE = eINSTANCE.getEvent_Ce();

    /**
     * The meta object literal for the '<em><b>De</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT__DE = eINSTANCE.getEvent_De();

    /**
     * The meta object literal for the '<em><b>Cg</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT__CG = eINSTANCE.getEvent_Cg();

    /**
     * The meta object literal for the '<em><b>St</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT__ST = eINSTANCE.getEvent_St();

    /**
     * The meta object literal for the '<em><b>Cl</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__CL = eINSTANCE.getEvent_Cl();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__COMMENT = eINSTANCE.getEvent_Comment();

    /**
     * The meta object literal for the '{@link org.graphstream.dgs.impl.AnImpl <em>An</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.graphstream.dgs.impl.AnImpl
     * @see org.graphstream.dgs.impl.DgsPackageImpl#getAn()
     * @generated
     */
    EClass AN = eINSTANCE.getAn();

    /**
     * The meta object literal for the '<em><b>Id Node</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AN__ID_NODE = eINSTANCE.getAn_IdNode();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AN__ATTRIBUTES = eINSTANCE.getAn_Attributes();

    /**
     * The meta object literal for the '{@link org.graphstream.dgs.impl.CnImpl <em>Cn</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.graphstream.dgs.impl.CnImpl
     * @see org.graphstream.dgs.impl.DgsPackageImpl#getCn()
     * @generated
     */
    EClass CN = eINSTANCE.getCn();

    /**
     * The meta object literal for the '<em><b>Id Node</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CN__ID_NODE = eINSTANCE.getCn_IdNode();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CN__ATTRIBUTES = eINSTANCE.getCn_Attributes();

    /**
     * The meta object literal for the '{@link org.graphstream.dgs.impl.DnImpl <em>Dn</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.graphstream.dgs.impl.DnImpl
     * @see org.graphstream.dgs.impl.DgsPackageImpl#getDn()
     * @generated
     */
    EClass DN = eINSTANCE.getDn();

    /**
     * The meta object literal for the '<em><b>Id Node</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DN__ID_NODE = eINSTANCE.getDn_IdNode();

    /**
     * The meta object literal for the '{@link org.graphstream.dgs.impl.AeImpl <em>Ae</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.graphstream.dgs.impl.AeImpl
     * @see org.graphstream.dgs.impl.DgsPackageImpl#getAe()
     * @generated
     */
    EClass AE = eINSTANCE.getAe();

    /**
     * The meta object literal for the '<em><b>Id Edge</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AE__ID_EDGE = eINSTANCE.getAe_IdEdge();

    /**
     * The meta object literal for the '<em><b>Id Node1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AE__ID_NODE1 = eINSTANCE.getAe_IdNode1();

    /**
     * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AE__DIRECTION = eINSTANCE.getAe_Direction();

    /**
     * The meta object literal for the '<em><b>Id Node2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AE__ID_NODE2 = eINSTANCE.getAe_IdNode2();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AE__ATTRIBUTES = eINSTANCE.getAe_Attributes();

    /**
     * The meta object literal for the '{@link org.graphstream.dgs.impl.CeImpl <em>Ce</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.graphstream.dgs.impl.CeImpl
     * @see org.graphstream.dgs.impl.DgsPackageImpl#getCe()
     * @generated
     */
    EClass CE = eINSTANCE.getCe();

    /**
     * The meta object literal for the '<em><b>Id Edge</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CE__ID_EDGE = eINSTANCE.getCe_IdEdge();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CE__ATTRIBUTES = eINSTANCE.getCe_Attributes();

    /**
     * The meta object literal for the '{@link org.graphstream.dgs.impl.DeImpl <em>De</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.graphstream.dgs.impl.DeImpl
     * @see org.graphstream.dgs.impl.DgsPackageImpl#getDe()
     * @generated
     */
    EClass DE = eINSTANCE.getDe();

    /**
     * The meta object literal for the '<em><b>Id Edge</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DE__ID_EDGE = eINSTANCE.getDe_IdEdge();

    /**
     * The meta object literal for the '{@link org.graphstream.dgs.impl.CgImpl <em>Cg</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.graphstream.dgs.impl.CgImpl
     * @see org.graphstream.dgs.impl.DgsPackageImpl#getCg()
     * @generated
     */
    EClass CG = eINSTANCE.getCg();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CG__ATTRIBUTES = eINSTANCE.getCg_Attributes();

    /**
     * The meta object literal for the '{@link org.graphstream.dgs.impl.StImpl <em>St</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.graphstream.dgs.impl.StImpl
     * @see org.graphstream.dgs.impl.DgsPackageImpl#getSt()
     * @generated
     */
    EClass ST = eINSTANCE.getSt();

    /**
     * The meta object literal for the '<em><b>Real</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ST__REAL = eINSTANCE.getSt_Real();

    /**
     * The meta object literal for the '{@link org.graphstream.dgs.impl.AttributesImpl <em>Attributes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.graphstream.dgs.impl.AttributesImpl
     * @see org.graphstream.dgs.impl.DgsPackageImpl#getAttributes()
     * @generated
     */
    EClass ATTRIBUTES = eINSTANCE.getAttributes();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTES__ATTRIBUTE = eINSTANCE.getAttributes_Attribute();

    /**
     * The meta object literal for the '{@link org.graphstream.dgs.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.graphstream.dgs.impl.AttributeImpl
     * @see org.graphstream.dgs.impl.DgsPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__OPERATOR = eINSTANCE.getAttribute_Operator();

    /**
     * The meta object literal for the '<em><b>Id Attribute</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__ID_ATTRIBUTE = eINSTANCE.getAttribute_IdAttribute();

    /**
     * The meta object literal for the '<em><b>Assign</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__ASSIGN = eINSTANCE.getAttribute_Assign();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__VALUE = eINSTANCE.getAttribute_Value();

    /**
     * The meta object literal for the '<em><b>Other Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__OTHER_VALUES = eINSTANCE.getAttribute_OtherValues();

    /**
     * The meta object literal for the '{@link org.graphstream.dgs.impl.ValueImpl <em>Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.graphstream.dgs.impl.ValueImpl
     * @see org.graphstream.dgs.impl.DgsPackageImpl#getValue()
     * @generated
     */
    EClass VALUE = eINSTANCE.getValue();

    /**
     * The meta object literal for the '<em><b>String</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE__STRING = eINSTANCE.getValue_String();

    /**
     * The meta object literal for the '<em><b>Real</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE__REAL = eINSTANCE.getValue_Real();

    /**
     * The meta object literal for the '<em><b>Int</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE__INT = eINSTANCE.getValue_Int();

    /**
     * The meta object literal for the '<em><b>Array</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUE__ARRAY = eINSTANCE.getValue_Array();

    /**
     * The meta object literal for the '<em><b>Map</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUE__MAP = eINSTANCE.getValue_Map();

    /**
     * The meta object literal for the '{@link org.graphstream.dgs.impl.ArrayImpl <em>Array</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.graphstream.dgs.impl.ArrayImpl
     * @see org.graphstream.dgs.impl.DgsPackageImpl#getArray()
     * @generated
     */
    EClass ARRAY = eINSTANCE.getArray();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY__VALUE = eINSTANCE.getArray_Value();

    /**
     * The meta object literal for the '<em><b>Other Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY__OTHER_VALUES = eINSTANCE.getArray_OtherValues();

    /**
     * The meta object literal for the '{@link org.graphstream.dgs.impl.MapImpl <em>Map</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.graphstream.dgs.impl.MapImpl
     * @see org.graphstream.dgs.impl.DgsPackageImpl#getMap()
     * @generated
     */
    EClass MAP = eINSTANCE.getMap();

    /**
     * The meta object literal for the '<em><b>Mapping</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAP__MAPPING = eINSTANCE.getMap_Mapping();

    /**
     * The meta object literal for the '<em><b>Other Mapping</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAP__OTHER_MAPPING = eINSTANCE.getMap_OtherMapping();

    /**
     * The meta object literal for the '{@link org.graphstream.dgs.impl.MappingImpl <em>Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.graphstream.dgs.impl.MappingImpl
     * @see org.graphstream.dgs.impl.DgsPackageImpl#getMapping()
     * @generated
     */
    EClass MAPPING = eINSTANCE.getMapping();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPING__ID = eINSTANCE.getMapping_Id();

    /**
     * The meta object literal for the '<em><b>Assign</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPING__ASSIGN = eINSTANCE.getMapping_Assign();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING__VALUE = eINSTANCE.getMapping_Value();

  }

} //DgsPackage
