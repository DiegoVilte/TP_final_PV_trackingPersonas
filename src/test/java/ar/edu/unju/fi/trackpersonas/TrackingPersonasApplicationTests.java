package ar.edu.unju.fi.trackpersonas;

import java.time.LocalDateTime;
import java.util.Optional;

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
import ar.edu.unju.fi.repository.IBarrioDAO;

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
	private IRegistroTrackingDAO registroDAO;
	@Autowired
	private IValidadorCondicionSanitariaDAO vcsDAO;
	@Autowired
	private IBarrioDAO barrioDAO; 
	
	
	@Test
	void contextLoads() throws Exception {
		
		/*Persona persona = new Persona();		
		persona.setApellido("cast");
		persona.setDocumento("37525615");
		persona.setNacionalidad("Argentina");
		persona.setNombres("ema");
		persona.setId(5);
		//personaServi.guardar(persona); //funciona correctamente
		
		//personaServi.eliminar(2); //funciona correctamente
		personaServi.modificar(persona); //funciona 
		//persona = personaServi.mostrar(1); //toavia con error
		//System.out.println("nombre: "+ persona.getNombres());
		*/
		
		/*Usuario usuario = new Usuario();
		usuario.setApellidoReal("colo");
		usuario.setNombreReal("ema");
		usuario.setNombreUsuario("colo12");
		usuario.setPassword("1234");
		usuario.setTipoUsuario("CONSULTOR");
		//usuarioServi.guardar(usuario); //funciona correctamente
		usuario.setId(1);
		usuarioServi.modificar(usuario); //funciona
		//usuarioServi.eliminar(3);  //funciona ccorrectamente
		*/
		/**Barrio barrio = new Barrio();
		barrio.setNombre("San Pedrito");
		barrioServi.crearBarrio(barrio); //funciona correctamente
		*/
		//barrioServi.borrarBarrio(1); //funciona correctamente
		
		
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
		
		RegistroTracking reg = new RegistroTracking();
		reg.setDetalleLugarRegistro("lugarR");
		reg.setFechaHora(LocalDateTime.now());
		registroDAO.save(RT);
		
		ValidadorCondicionSanitaria vc = new ValidadorCondicionSanitaria();
		vc.setCumpleTerminacionDNI(true);
		vc.setEstaAcompañado(false);
		//vc.setPersona(persona);
		vc.setUsaTapabocas(true);
		vcsDAO.save(VC);
	*/
					// otro modelo de prueba 
		
		Barrio barrio1 = new Barrio();
		barrio1.setNombre("Cuyaya");
		barrioDAO.save(barrio1); 
		
		Persona personax = new Persona();
		personax.setApellido("Lino");
		personax.setNombres("Dario");
		personax.setDocumento("55555555");
		personax.setNacionalidad("Argentina");

		
		Optional<Barrio> unBarrio = barrioDAO.findById(Long.valueOf("1"));


		
		
		
		RegistroTracking registro = new RegistroTracking();
		registro.setFechaHora(LocalDateTime.now());
		registro.setDetalleLugarRegistro("Entrada al Barrio Cuyaya");
		unBarrio.ifPresent(barrio -> {
		    registro.setLocalidad(barrio);
		});

		ValidadorCondicionSanitaria validador01 = new ValidadorCondicionSanitaria();
		validador01.setCumpleTerminacionDNI(true);
		validador01.setEstaAcompañado(false);
		validador01.setPoseePermisoCirculacion(true);
		validador01.setUsaTapabocas(true);
		validador01.setRegistroTracking(registro);

		ValidadorCondicionSanitaria validador02 = new ValidadorCondicionSanitaria();
		validador02.setCumpleTerminacionDNI(true);
		validador02.setEstaAcompañado(false);
		validador02.setPoseePermisoCirculacion(true);
		validador02.setUsaTapabocas(true);
		validador02.setRegistroTracking(registro);
					
		
		registro.getValidadoresCS().add(validador01);
		registro.getValidadoresCS().add(validador02);
		
		registroDAO.save(registro);
			
		
	}

}
