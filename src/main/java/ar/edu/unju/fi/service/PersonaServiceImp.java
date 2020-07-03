/**
 * 
 */
package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.model.Persona;
import ar.edu.unju.fi.model.Usuario;
import ar.edu.unju.fi.repository.IPersonaDAO;

/**
 * @author Diego
 *
 */
@Service
public class PersonaServiceImp implements IPersonaService {
	
	@Autowired
	//@Qualifier("personaDAOImpMySQL")
	public IPersonaDAO ipersona;

	@Override
	public void guardar(Persona persona) {
		ipersona.save(persona);
	}

	@Override
	public Persona modificar(Persona persona) throws Exception{
		Persona personaParaModificar = buscarPersona(persona.getId());
		mapearPersona(persona, personaParaModificar);
		return ipersona.save(personaParaModificar);
	}

	@Override
	public void eliminar(long id) {
		ipersona.deleteById(id);
	}

	@Override
	public Persona mostrar(long id) {
		Persona persona = ipersona.getOne(id);
		return persona;
	}
	
	public void mapearPersona(Persona persona, Persona modificado) {
		persona.setApellido(modificado.getApellido());
		persona.setNombres(modificado.getNombres());
		persona.setDocumento(modificado.getDocumento());
		persona.setId(modificado.getId());
		persona.setNacionalidad(modificado.getNacionalidad());
	}
	
	@Override
	public Persona buscarPersona(Long id) throws Exception {
		return ipersona.findById(id).orElseThrow(()-> new Exception("El Usuario no Existe"));
	}

}
