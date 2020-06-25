/**
 * 
 */
package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Usuario;

/**
 * @author daniel-gnu
 *
 */
public interface IUsuarioDAO {
	/**
	 * modificacion para el formulario de registro de usuario
	 * 
	 * @param usuario
	 */
	// metodo que guarda un objeto usuario
	public void guardar(Usuario usuario);

	// metodo que modifica un objeto usuario
	public Usuario modificar();

	// metodo que elimina un objeto usuario
	public void eliminar();

	// metodo que muestra un objeto usuario
	public Usuario mostrar();
}
