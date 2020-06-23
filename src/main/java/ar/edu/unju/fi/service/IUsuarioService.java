/**
 * 
 */
package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.Usuario;

/**
 * @author daniel-gnu
 *
 */
public interface IUsuarioService {
	/**
	 * daniel , relizo modificacion de tu metodo para poder realizar el registro de usuario, agrago los parametro
	 * @param usuario tipo  Usuario
	 */
	public void guardar(Usuario usuario);

	public Usuario modificar();

	public void eliminar();

	public Usuario mostrar();

}
