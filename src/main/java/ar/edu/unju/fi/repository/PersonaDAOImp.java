/*package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.TrackingPersonasApplication;
import ar.edu.unju.fi.model.Persona;

@Repository("personaDAOImp")
public class PersonaDAOImp implements IPersonaDAO {
	
	@Autowired
	private Persona persona;
	public static Logger LOG = LoggerFactory.getLogger(TrackingPersonasApplication.class);

	@Override
	public void guardar() {
		// TODO Auto-generated method stub
		LOG.info("Se a guardado la persona "+persona.getNombres()+" "+ persona.getApellido()+" "+persona.getDocumento());
	}

	@Override
	public Persona modificar() {
		// TODO Auto-generated method stub
		LOG.info("Se a modifiaco los datos");
		return persona;
	}

	@Override
	public void elimina() {
		// TODO Auto-generated method stub
		LOG.info("Se a ELIMINADO persona");

	}

	@Override
	public Persona mostrar() {
		// TODO Auto-generated method stub
		LOG.info("Mostrar los datos de Persona");
		return persona;
	}

}*/
