package ar.edu.unju.fi.trackpersonas;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ar.edu.unju.fi.model.Barrio;
import ar.edu.unju.fi.model.Persona;
import ar.edu.unju.fi.model.RegistroTracking;
import ar.edu.unju.fi.model.Usuario;
import ar.edu.unju.fi.model.ValidadorCondicionSanitaria;
import ar.edu.unju.fi.repository.IPersonaDAO;
import ar.edu.unju.fi.repository.IRegistroTrackingDAO;
import ar.edu.unju.fi.repository.IUsuarioDAO;
import ar.edu.unju.fi.repository.IValidadorCondicionSanitariaDAO;
import ar.edu.unju.fi.service.PersonaServiceImp;
import ar.edu.unju.fi.service.BarrioServiceImp;
import ar.edu.unju.fi.service.IUsuarioService;
import ar.edu.unju.fi.service.UsuarioServiceImp;

@SpringBootTest
class TrackingPersonasApplicationTests {
	
	@Autowired
	private PersonaServiceImp personaServi;
	@Autowired
	private UsuarioServiceImp usuarioServi;
	@Autowired
	private BarrioServiceImp barrioServi;
	
	//****DAOS***
	@Autowired
	private IUsuarioDAO usuarioDAO;
	@Autowired
	private IPersonaDAO personaDAO;
	@Autowired
	private IRegistroTrackingDAO RTDAO;
	@Autowired
	private IValidadorCondicionSanitariaDAO VCDAO;
	
	@Test
	void contextLoads() throws Exception {
		
		//Persona persona = new Persona();
		/**
		persona.setApellido("per2mmmm");
		persona.setDocumento("1111");
		persona.setNacionalidad("22222");
		persona.setNombres("nomPer2mmmmmm");
		persona.setId(5);
		personaServi.guardar(persona);*/ //funciona correctamente
		//personaServi.eliminar(2); //funciona correctamente
		//personaServi.modificar(persona); //todavia tiene error
		//persona = personaServi.mostrar(1); //toavia con error
		//System.out.println("nombre: "+ persona.getNombres());
		
		//Usuario usuario = new Usuario();
		/**long idd=5;
		usuario.setApellidoReal("aaaa2");
		usuario.setNombreReal("aaa2");
		usuario.setNombreUsuario("aa2");
		usuario.setPassword("a2");
		usuario.setTipoUsuario("ADMIN2");
		//usuarioServi.guardar(usuario); //funciona correctamente
		usuario.setId(idd);*/
		//usuarioServi.modificar(usuario); //no anda todavia
		//usuarioServi.eliminar(3);  //funciona ccorrectamente
		
		Barrio barrio = new Barrio();
		
		
		
		                      //**************DAOS****************
		/** Todo los DAOS funcionan correctamente
		Usuario usuario = new Usuario();
		usuario.setNombreReal("juan");
		usuario.setApellidoReal("asdas");
		usuario.setNombreUsuario("juanusuario");
		usuario.setPassword("1213");
		usuario.setTipoUsuario("ADMIN");
		usuarioDAO.save(usuario);
		
		Persona persona = new Persona();
		persona.setApellido("per");
		persona.setDocumento("2324");
		persona.setNacionalidad("asdsw");
		persona.setNombres("nomPer");
		personaDAO.save(persona);
		
		RegistroTracking RT = new RegistroTracking();
		RT.setDetalleLugarRegistro("lugarR");
		RT.setFechaHora(LocalDateTime.now());
		RTDAO.save(RT);
		
		ValidadorCondicionSanitaria VC = new ValidadorCondicionSanitaria();
		VC.setCumpleTerminacionDNI(true);
		VC.setEstaAcompañado(false);
		//VC.setPersona(persona);
		VC.setUsaTapabocas(true);
		VCDAO.save(VC);
	*/
	}

}
