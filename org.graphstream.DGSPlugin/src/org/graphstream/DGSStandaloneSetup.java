
package org.graphstream;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class DGSStandaloneSetup extends DGSStandaloneSetupGenerated{

	public static void doSetup() {
		new DGSStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

