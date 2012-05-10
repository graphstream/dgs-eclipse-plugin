package org.graphstream.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.graphstream.dGS.Ae;
import org.graphstream.dGS.An;
import org.graphstream.dGS.Array;
import org.graphstream.dGS.Attribute;
import org.graphstream.dGS.Attributes;
import org.graphstream.dGS.Ce;
import org.graphstream.dGS.Cg;
import org.graphstream.dGS.Cn;
import org.graphstream.dGS.DGSPackage;
import org.graphstream.dGS.De;
import org.graphstream.dGS.Dgs;
import org.graphstream.dGS.Dn;
import org.graphstream.dGS.Event;
import org.graphstream.dGS.Header;
import org.graphstream.dGS.Map;
import org.graphstream.dGS.Mapping;
import org.graphstream.dGS.St;
import org.graphstream.dGS.Value;
import org.graphstream.services.DGSGrammarAccess;

@SuppressWarnings("restriction")
public class AbstractDGSSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected DGSGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DGSPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DGSPackage.AE:
				if(context == grammarAccess.getAeRule()) {
					sequence_Ae(context, (Ae) semanticObject); 
					return; 
				}
				else break;
			case DGSPackage.AN:
				if(context == grammarAccess.getAnRule()) {
					sequence_An(context, (An) semanticObject); 
					return; 
				}
				else break;
			case DGSPackage.ARRAY:
				if(context == grammarAccess.getArrayRule()) {
					sequence_Array(context, (Array) semanticObject); 
					return; 
				}
				else break;
			case DGSPackage.ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule()) {
					sequence_Attribute(context, (Attribute) semanticObject); 
					return; 
				}
				else break;
			case DGSPackage.ATTRIBUTES:
				if(context == grammarAccess.getAttributesRule()) {
					sequence_Attributes(context, (Attributes) semanticObject); 
					return; 
				}
				else break;
			case DGSPackage.CE:
				if(context == grammarAccess.getCeRule()) {
					sequence_Ce(context, (Ce) semanticObject); 
					return; 
				}
				else break;
			case DGSPackage.CG:
				if(context == grammarAccess.getCgRule()) {
					sequence_Cg(context, (Cg) semanticObject); 
					return; 
				}
				else break;
			case DGSPackage.CN:
				if(context == grammarAccess.getCnRule()) {
					sequence_Cn(context, (Cn) semanticObject); 
					return; 
				}
				else break;
			case DGSPackage.DE:
				if(context == grammarAccess.getDeRule()) {
					sequence_De(context, (De) semanticObject); 
					return; 
				}
				else break;
			case DGSPackage.DGS:
				if(context == grammarAccess.getDgsRule()) {
					sequence_Dgs(context, (Dgs) semanticObject); 
					return; 
				}
				else break;
			case DGSPackage.DN:
				if(context == grammarAccess.getDnRule()) {
					sequence_Dn(context, (Dn) semanticObject); 
					return; 
				}
				else break;
			case DGSPackage.EVENT:
				if(context == grammarAccess.getEventRule()) {
					sequence_Event(context, (Event) semanticObject); 
					return; 
				}
				else break;
			case DGSPackage.HEADER:
				if(context == grammarAccess.getHeaderRule()) {
					sequence_Header(context, (Header) semanticObject); 
					return; 
				}
				else break;
			case DGSPackage.MAP:
				if(context == grammarAccess.getMapRule()) {
					sequence_Map(context, (Map) semanticObject); 
					return; 
				}
				else break;
			case DGSPackage.MAPPING:
				if(context == grammarAccess.getMappingRule()) {
					sequence_Mapping(context, (Mapping) semanticObject); 
					return; 
				}
				else break;
			case DGSPackage.ST:
				if(context == grammarAccess.getStRule()) {
					sequence_St(context, (St) semanticObject); 
					return; 
				}
				else break;
			case DGSPackage.VALUE:
				if(context == grammarAccess.getValueRule()) {
					sequence_Value(context, (Value) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     ((idEdge=ID | idEdge=STRING) (idNode1=ID | idNode1=STRING) direction=DIRECTION? (idNode2=ID | idNode2=STRING) attributes=Attributes)
	 */
	protected void sequence_Ae(EObject context, Ae semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((idNode=ID | idNode=STRING) attributes=Attributes)
	 */
	protected void sequence_An(EObject context, An semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((value=Value otherValues+=Value*)?)
	 */
	protected void sequence_Array(EObject context, Array semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((idAttribute=ID | idAttribute=STRING) (assign=ASSIGN value=Value otherValues+=Value*)?)
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (attribute+=Attribute*)
	 */
	protected void sequence_Attributes(EObject context, Attributes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((idNode=ID | idNode=STRING) attributes=Attributes)
	 */
	protected void sequence_Ce(EObject context, Ce semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     attributes=Attributes
	 */
	protected void sequence_Cg(EObject context, Cg semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DGSPackage.Literals.CG__ATTRIBUTES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DGSPackage.Literals.CG__ATTRIBUTES));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCgAccess().getAttributesAttributesParserRuleCall_1_0(), semanticObject.getAttributes());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((idNode=ID | idNode=STRING) attributes=Attributes)
	 */
	protected void sequence_Cn(EObject context, Cn semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (idEdge=ID | idEdge=STRING)
	 */
	protected void sequence_De(EObject context, De semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (header=Header (event+=Event | comment+=COMMENT)*)
	 */
	protected void sequence_Dgs(EObject context, Dgs semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (idNode=ID | idNode=STRING)
	 */
	protected void sequence_Dn(EObject context, Dn semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             an=An | 
	 *             cn=Cn | 
	 *             dn=Dn | 
	 *             ae=Ae | 
	 *             ce=Ce | 
	 *             de=De | 
	 *             cg=Cg | 
	 *             st=St | 
	 *             cl=Cl
	 *         ) 
	 *         comment=COMMENT?
	 *     )
	 */
	protected void sequence_Event(EObject context, Event semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (magic=MAGIC (name=ID | name=STRING) numberOfSteps=INT numberOfEvents=INT)
	 */
	protected void sequence_Header(EObject context, Header semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (mapping=Mapping otherMapping+=Mapping*)
	 */
	protected void sequence_Map(EObject context, Map semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((id=ID | id=STRING) assign=ASSIGN value=Value)
	 */
	protected void sequence_Mapping(EObject context, Mapping semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     real=Real
	 */
	protected void sequence_St(EObject context, St semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DGSPackage.Literals.ST__REAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DGSPackage.Literals.ST__REAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStAccess().getRealRealParserRuleCall_1_0(), semanticObject.getReal());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (string=STRING | real=Real | array=Array | map=Map)
	 */
	protected void sequence_Value(EObject context, Value semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
