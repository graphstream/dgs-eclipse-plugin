/**
 * <copyright>
 * </copyright>
 *

 */
package org.graphstream.dGS.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.graphstream.dGS.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.graphstream.dGS.DGSPackage
 * @generated
 */
public class DGSAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DGSPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DGSAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = DGSPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DGSSwitch<Adapter> modelSwitch =
    new DGSSwitch<Adapter>()
    {
      @Override
      public Adapter caseDgs(Dgs object)
      {
        return createDgsAdapter();
      }
      @Override
      public Adapter caseHeader(Header object)
      {
        return createHeaderAdapter();
      }
      @Override
      public Adapter caseEvent(Event object)
      {
        return createEventAdapter();
      }
      @Override
      public Adapter caseAn(An object)
      {
        return createAnAdapter();
      }
      @Override
      public Adapter caseCn(Cn object)
      {
        return createCnAdapter();
      }
      @Override
      public Adapter caseDn(Dn object)
      {
        return createDnAdapter();
      }
      @Override
      public Adapter caseAe(Ae object)
      {
        return createAeAdapter();
      }
      @Override
      public Adapter caseCe(Ce object)
      {
        return createCeAdapter();
      }
      @Override
      public Adapter caseDe(De object)
      {
        return createDeAdapter();
      }
      @Override
      public Adapter caseCg(Cg object)
      {
        return createCgAdapter();
      }
      @Override
      public Adapter caseSt(St object)
      {
        return createStAdapter();
      }
      @Override
      public Adapter caseAttributes(Attributes object)
      {
        return createAttributesAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseValue(Value object)
      {
        return createValueAdapter();
      }
      @Override
      public Adapter caseArray(Array object)
      {
        return createArrayAdapter();
      }
      @Override
      public Adapter caseMap(Map object)
      {
        return createMapAdapter();
      }
      @Override
      public Adapter caseMapping(Mapping object)
      {
        return createMappingAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.graphstream.dGS.Dgs <em>Dgs</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.graphstream.dGS.Dgs
   * @generated
   */
  public Adapter createDgsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.graphstream.dGS.Header <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.graphstream.dGS.Header
   * @generated
   */
  public Adapter createHeaderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.graphstream.dGS.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.graphstream.dGS.Event
   * @generated
   */
  public Adapter createEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.graphstream.dGS.An <em>An</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.graphstream.dGS.An
   * @generated
   */
  public Adapter createAnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.graphstream.dGS.Cn <em>Cn</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.graphstream.dGS.Cn
   * @generated
   */
  public Adapter createCnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.graphstream.dGS.Dn <em>Dn</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.graphstream.dGS.Dn
   * @generated
   */
  public Adapter createDnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.graphstream.dGS.Ae <em>Ae</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.graphstream.dGS.Ae
   * @generated
   */
  public Adapter createAeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.graphstream.dGS.Ce <em>Ce</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.graphstream.dGS.Ce
   * @generated
   */
  public Adapter createCeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.graphstream.dGS.De <em>De</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.graphstream.dGS.De
   * @generated
   */
  public Adapter createDeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.graphstream.dGS.Cg <em>Cg</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.graphstream.dGS.Cg
   * @generated
   */
  public Adapter createCgAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.graphstream.dGS.St <em>St</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.graphstream.dGS.St
   * @generated
   */
  public Adapter createStAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.graphstream.dGS.Attributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.graphstream.dGS.Attributes
   * @generated
   */
  public Adapter createAttributesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.graphstream.dGS.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.graphstream.dGS.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.graphstream.dGS.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.graphstream.dGS.Value
   * @generated
   */
  public Adapter createValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.graphstream.dGS.Array <em>Array</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.graphstream.dGS.Array
   * @generated
   */
  public Adapter createArrayAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.graphstream.dGS.Map <em>Map</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.graphstream.dGS.Map
   * @generated
   */
  public Adapter createMapAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.graphstream.dGS.Mapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.graphstream.dGS.Mapping
   * @generated
   */
  public Adapter createMappingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //DGSAdapterFactory
