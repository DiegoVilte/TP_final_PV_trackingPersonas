/**
 * 
 */
package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.model.Persona;
import ar.edu.unju.fi.model.Usuario;
import ar.edu.unju.fi.repository.IUsuarioDAO;

/**
 * @author daniel-gnu
 *
 */
@Service
public class UsuarioServiceImp implements IUsuarioService {
	@Autowired
	//@Qualifier("usuarioDAOImpMySQL")
	private IUsuarioDAO iUsuario;

	@Override
	public void guardar(Usuario usuario) {
		iUsuario.save(usuario);
	}

	@Override
	public Usuario modificar(Usuario usuario) throws Exception {
		Usuario encontrado = iUsuario.findById(usuario.getId()).orElse(null);
        encontrado.setApellidoReal(usuario.getApellidoReal());
        encontrado.setNombreReal(usuario.getNombreReal());
        encontrado.setNombreUsuario(usuario.getNombreUsuario());
        encontrado.setPassword(usuario.getPassword());
        encontrado.setTipoUsuario(usuario.getTipoUsuario());
        return iUsuario.save(encontrado);
		
		/*Usuario modificado = buscarUsuario(usuario.getId());
		mapearUsuario(usuario, modificado);	
		return iUsuario.save(modificado);*/
	}

	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub
		iUsuario.deleteById(id);
	}

	@Override
	public Iterable<Usuario> listar() {
		return iUsuario.findAll();
	}
	
	public void mapearUsuario(Usuario usuario, Usuario modificado) {
		usuario.setApellidoReal(modificado.getApellidoReal());
		usuario.setNombreReal(modificado.getNombreReal());
		usuario.setNombreUsuario(modificado.getNombreUsuario());
		usuario.setPassword(modificado.getPassword());
		usuario.setTipoUsuario(modificado.getTipoUsuario());
	}

	@Override
	public Usuario buscarUsuario(Long id) throws Exception {
		return iUsuario.findById(id).orElseThrow(()-> new Exception("El Usuario no Existe"));
	}
	
	
	
	
	/**
	 * modificacion para adaptar al  nuevo metodo con parametros
	 */
	/**@Override
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
	}*/
}
