/**
 * 
 */
package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.model.Persona;
import ar.edu.unju.fi.repository.IPersonaDAO;

/**
 * @author Diego
 *
 */
@Repository
public class IPersonaServiceImp implements IPersonaService {
	
	@Autowired
	@Qualifier("personaDAOImpMySQL")
	public IPersonaDAO ipersona;

	@Override
	public void guardar() {
		// TODO Auto-generated method stub
		ipersona.guardar();
	}

	@Override
	public Persona modificar() {
		// TODO Auto-generated method stub
		Persona persona=ipersona.modificar();
		return persona;
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		ipersona.elimina();
	}

	@Override
	public Persona mostrar() {
		// TODO Auto-generated method stub
		Persona persona =ipersona.mostrar();
		return persona;
	}

}
