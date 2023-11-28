package it.bla.mdp.test.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;


//@WebService ( name = "AppProxyService", serviceName = "AppProxyService" ) // if comment this one it works (HealthCheckTest.http as test)
public interface AppProxyService {

	@WebMethod
	String test ();
}
