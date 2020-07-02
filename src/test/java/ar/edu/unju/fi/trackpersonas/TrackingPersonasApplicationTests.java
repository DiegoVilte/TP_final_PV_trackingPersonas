package ar.edu.unju.fi.trackpersonas;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ar.edu.unju.fi.model.Persona;
import ar.edu.unju.fi.model.RegistroTracking;
import ar.edu.unju.fi.model.Usuario;
import ar.edu.unju.fi.model.ValidadorCondicionSanitaria;
import ar.edu.unju.fi.repository.IPersonaDAO;
import ar.edu.unju.fi.repository.IRegistroTrackingDAO;
import ar.edu.unju.fi.repository.IUsuarioDAO;
import ar.edu.unju.fi.repository.IValidadorCondicionSanitariaDAO;

@SpringBootTest
class TrackingPersonasApplicationTests {
	@Autowired
	private IUsuarioDAO usuarioDAO;
	/**@Autowired
	private IPersonaDAO personaDAO;
	@Autowired
	private IRegistroTrackingDAO RTDAO;
	@Autowired
	private IValidadorCondicionSanitariaDAO VCDAO;
*/
	@Test
	void contextLoads() {
		Usuario usuario = new Usuario();
		usuario.setNombreReal("juan");
		usuario.setApellidoReal("asdas");
		usuario.setNombreUsuario("juanusuario");
		usuario.setPassword("1213");
		usuario.setTipoUsuario("ADMIN");
		usuarioDAO.save(usuario);
		/**
		Persona persona = new Persona();
		persona.setApellido("per");
		persona.setDocumento("2324");
		persona.setNacionalidad("asdsw");
		persona.setNombres("nomPer");
		personaDAO.guardar();
		
		RegistroTracking RT = new RegistroTracking();
		RT.setDetalleLugarRegistro("lugarR");
		RT.setFechaHora(LocalDateTime.now());
		RTDAO.guardar();
		
		ValidadorCondicionSanitaria VC = new ValidadorCondicionSanitaria();
		VC.setCumpleTerminacionDNI(true);
		VC.setEstaAcompañado(false);
		//VC.setPersona(persona);
		VC.setUsaTapabocas(true);
		VCDAO.guardar();
	*/
	
	}

}
