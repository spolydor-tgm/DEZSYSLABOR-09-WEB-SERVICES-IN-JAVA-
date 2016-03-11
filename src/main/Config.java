package main;

/**
 * @author Stefan Polydor &lt;spolydor@student.tgm.ac.at&gt;
 * @version 11.03.16
 */
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

import javax.inject.Named;

/**
 * Hier werden die Endpunkte definiert
 *
 * @author Stefan Geyer
 * @version 20160218.1
 */
@Named
public class Config extends ResourceConfig {

	public Config() {
		// this.register(AccountEndpoint.class);
		this.register(Registrieren.class);
		this.register(Login.class);
		this.register(JacksonFeature.class);
	}
}