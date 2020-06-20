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
	public void guardar();

	public Usuario modificar();

	public void eliminar();

	public Usuario mostrar();

}
