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
	 * 
	 * @param usuario tipo  Usuario
	 */
	public void guardar(Usuario usuario);

	public Usuario modificar(Usuario usuario) throws Exception;

	public void eliminar(Long id);

	public Usuario mostrar();
	
	public void mapearUsuario(Usuario usuario, Usuario modificado);
	
	public Usuario buscarUsuario(Long id) throws Exception;

}
