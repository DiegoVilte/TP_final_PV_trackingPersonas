/**
 * 
 */
package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.TrackingPersonasApplication;
import ar.edu.unju.fi.model.ValidadorCondicionSanitaria;

/**
 * @author Diego
 *
 */
@Repository("validacionCondicionSanitariaDAOImp")
public class ValidacionCondicionSanitariaDAOImp implements IValidadorCondicionSanitariaDAO {
	
	@Autowired
	private ValidadorCondicionSanitaria vcs;
	
	public static Logger LOG = LoggerFactory.getLogger(TrackingPersonasApplication.class);

	@Override
	public void guardar() {
		// TODO Auto-generated method stub
		LOG.info("se a guardado la condicion sanitaria de "+vcs.getPersona());
	}

	@Override
	public ValidadorCondicionSanitaria modificar() {
		// TODO Auto-generated method stub
		LOG.info("Se modificaron los datos de condicion sanitaria de la persona"+vcs.getPersona());
		return vcs;
		
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		LOG.info("Se ELIMINO validacion de condicion sanitaria");

	}

	@Override
	public ValidadorCondicionSanitaria mostrar() {
		// TODO Auto-generated method stub
		LOG.info("mostrar datos de condicion sanitaria");
		return vcs;
	}

}
