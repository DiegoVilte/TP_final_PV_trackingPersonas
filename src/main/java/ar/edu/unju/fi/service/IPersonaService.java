/**
 * 
 */
package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.Persona;
import ar.edu.unju.fi.model.Usuario;

/**
 * @author Diego
 *
 */
public interface IPersonaService {
	
	public void guardar(Persona persona);

	public Persona modificar(Persona persona) throws Exception;

	public void eliminar(long id);

	public Persona mostrar(long id);
	
	public void mapearPersona(Persona persona, Persona modificado);
	
	public Persona buscarPersona(Long id) throws Exception;

}
