/**
 * 
 */
package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.TrackingPersonasApplication;
import ar.edu.unju.fi.model.RegistroTracking;

/**
 * @author daniel-gnu
 *
 */
@Repository("registroDAOImp")
public class RegistroTrackingDAOImp implements IRegistroTrackingDAO {
	@Autowired
	private RegistroTracking registroTracking;
	public Logger LOG = LoggerFactory.getLogger(TrackingPersonasApplication.class);

	@Override
	public void guardar() {
		LOG.info("El registro tracking fue guardado " + registroTracking.getLocalidad() + ", "
				+ registroTracking.getFechaHora() + ", " + registroTracking.getDetalleLugarRegistro() + ", "
				+ registroTracking.getPersonas());
	}

	@Override
	public RegistroTracking modificar() {
		LOG.info("los datos de registro tracking fueron modificados");
		return registroTracking;
	}

	@Override
	public void eliminar() {
		LOG.info("los datos de registro tracking fueron eliminados");
	}

	@Override
	public RegistroTracking mostrar() {
		LOG.info("mostrar registro tracking");
		return registroTracking;
	}

}
