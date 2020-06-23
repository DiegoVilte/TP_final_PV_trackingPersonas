/**
 * 
 */
package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.model.Usuario;
import ar.edu.unju.fi.repository.IUsuarioDAO;

/**
 * @author daniel-gnu
 *
 */
@Repository
public class IUsuarioServiceImp implements IUsuarioService {
	@Autowired
	//@Qualifier("usuarioDAOImpMySQL")
	private IUsuarioDAO iUsuario;
	
	/**
	 * modificacion para adaptar al  nuevo metodo con parametros
	 */
	@Override
	public void guardar(Usuario usuario) {
		iUsuario.guardar(usuario);
	}

	@Override
	public Usuario modificar() {
		Usuario usuario = iUsuario.modificar();
		return usuario;
	}

	@Override
	public void eliminar() {
		iUsuario.eliminar();
	}

	@Override
	public Usuario mostrar() {
		Usuario usuario = iUsuario.mostrar();
		return usuario;
	}
}
