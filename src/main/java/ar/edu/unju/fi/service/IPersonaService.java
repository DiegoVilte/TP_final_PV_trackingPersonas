/**
 * 
 */
package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.Persona;

/**
 * @author Diego
 *
 */
public interface IPersonaService {
	
	public void guardar();

	public Persona modificar();

	public void eliminar();

	public Persona mostrar();

}
