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
	public void guardar();

	public Usuario modificar();

	public void eliminar();

	public Usuario mostrar();
}
