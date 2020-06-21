/**
 * 
 */
package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import ar.edu.unju.fi.model.RegistroTracking;
import ar.edu.unju.fi.repository.IRegistroTrackingDAO;

/**
 * @author daniel-gnu
 *
 */
/*@Repository
public class IRegistroTrackingServiceImp implements IRegistroTrackingService {
	@Autowired
	@Qualifier("registroTrackingDAOImpMySQL")
	private IRegistroTrackingDAO iRegistroTracking;

	@Override
	public void guardar() {
		iRegistroTracking.guardar();
	}

	@Override
	public RegistroTracking modificar() {
		RegistroTracking registroTracking = iRegistroTracking.modificar();
		return registroTracking;
	}

	@Override
	public void eliminar() {
		iRegistroTracking.eliminar();
	}

	@Override
	public RegistroTracking mostrar() {
		RegistroTracking registroTracking = iRegistroTracking.mostrar();
		return registroTracking;
	}

}*/
