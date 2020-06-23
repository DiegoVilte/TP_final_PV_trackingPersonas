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
	 * @param usuario
	 */
	public void guardar(Usuario usuario);

	public Usuario modificar();

	public void eliminar();

	public Usuario mostrar();
}
