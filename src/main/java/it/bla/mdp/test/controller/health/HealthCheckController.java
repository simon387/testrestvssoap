package it.bla.mdp.test.controller.health;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Liveness;

import javax.enterprise.context.ApplicationScoped;


@Liveness
@ApplicationScoped
public class HealthCheckController implements HealthCheck {

	@Override
	public HealthCheckResponse call () {
		return HealthCheckResponse.up ( "Simple health check" );
	}
}