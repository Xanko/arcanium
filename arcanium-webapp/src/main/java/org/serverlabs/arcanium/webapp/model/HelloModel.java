package org.serverlabs.arcanium.webapp.model;

import org.serverlabs.arcanium.webapp.dataproviders.HelloProvider;
import org.zkoss.bind.annotation.Command;
import org.zkoss.spring.DelegatingVariableResolver;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;


/**
 * Modele Hello
 * 
 */
@VariableResolver(DelegatingVariableResolver.class)
public class HelloModel {

    @WireVariable
    private HelloProvider helloProvider;
    	
	/**
	 * Permet d'aller à la page suivante.
	 */
	@Command("getGroup")
	public void getGroup() {
	    this.helloProvider.getGroup();
	}

}
