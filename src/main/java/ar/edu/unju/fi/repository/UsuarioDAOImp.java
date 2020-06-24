/**
 * 
 */
package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.TrackingPersonasApplication;
import ar.edu.unju.fi.model.Usuario;

/**
 * @author daniel-gnu
 *
 */
@Repository("usuarioDAOImp")
public class UsuarioDAOImp implements IUsuarioDAO {
	@Autowired
	private Usuario usuario;
	public static Logger LOG = LoggerFactory.getLogger(TrackingPersonasApplication.class);

	/**
	 * modificacion para el formulario de usuario
	 */
	@Override
	public void guardar(Usuario usuario) {
		LOG.info("el usuario fue guardado " + usuario.getApellidoReal() + ", " + 
				usuario.getNombreReal()+ ", " + usuario.getNombreUsuario()+ ", " +usuario.getPassword()+ ", " +
				usuario.getTipoUsuario());
	}

	@Override
	public Usuario modificar() {
		LOG.info("los datos del usuario modificados");
		return usuario;
	}

	@Override
	public void eliminar() {
		LOG.info("el usuario fue eliminado");
	}

	@Override
	public Usuario mostrar() {
		LOG.info("Mostrar datos del usuario");
		return usuario;
	}
}
