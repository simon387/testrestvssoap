package it.bla.mdp.test.soap.impl;



import it.bla.mdp.test.soap.AppProxyService;

import javax.jws.WebService;


@WebService ( serviceName = "AppProxyService" )
public class AppProxyServiceImpl implements AppProxyService {

	@Override
	public String test () {
		return null;
	}
}
