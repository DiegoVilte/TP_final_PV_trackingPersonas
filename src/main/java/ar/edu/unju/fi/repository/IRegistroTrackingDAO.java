/**
 * 
 */
package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.RegistroTracking;

/**
 * modificacion para el formulario de registro de registroTracking
 * @author daniel-gnu
 *
 */
//interface de registroTracking
public interface IRegistroTrackingDAO {
	// metodo que guarda un objeto registroTYracking
	public void guardar();

	// metodo que modifica un objeto registroTYracking
	public RegistroTracking modificar();

	// metodo que elimina un objeto registroTYracking
	public void eliminar();

	// metodo que muestra un objeto registroTYracking
	public RegistroTracking mostrar();

}
