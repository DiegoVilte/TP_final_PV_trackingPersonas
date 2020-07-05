/**
 * 
 */
package ar.edu.unju.fi.service;

import antlr.collections.List;
import ar.edu.unju.fi.model.Persona;
import ar.edu.unju.fi.model.Usuario;

/**
 * @author Diego
 *
 */
public interface IPersonaService {
	
	public void guardar(Persona persona);

	public Persona modificar(Persona persona) throws Exception;

	public void eliminar(Long id);

	public Iterable<Persona> listar();
	
	public void mapearPersona(Persona persona, Persona modificado);
	
	public Persona buscarPersona(Long id) throws Exception;

}
