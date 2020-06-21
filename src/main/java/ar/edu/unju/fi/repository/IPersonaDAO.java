/**
 * 
 */
package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Persona;

/**
 * @author Diego
 *
 */
public interface IPersonaDAO {
	public void guardar();
	public Persona modificar();
	public void elimina();
	public Persona mostrar();
	

}
