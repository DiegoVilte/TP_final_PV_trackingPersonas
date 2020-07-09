package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unju.fi.model.Barrio;
import ar.edu.unju.fi.model.Usuario;
import ar.edu.unju.fi.service.IBarrioService;
import ar.edu.unju.fi.service.IUsuarioService;
/**
 * 
 * @author Castillo Rolando
 *
 */
@Controller //anotacion para avisar ala aplicacion q es el controlador
//@RequestMapping("/") 
public class GestorController {
	
	@Autowired
	private IUsuarioService usuarioService;
	@Autowired
	private IBarrioService barrioService;
	
	@GetMapping("gestor")
	public String gestor(Model model) {
		//model.addAttribute("usuario", usuarioService.mostrar().getApellido());
		/**
		 * se crea un nuevo usuario , se lo manda ala pajina como "formusuario"
		 */
		model.addAttribute("formusuario", new Usuario());
		model.addAttribute("usuarios", usuarioService.listar());
		model.addAttribute("formTab", "active");
		
		model.addAttribute("formBarrio", new Barrio());
		model.addAttribute("barrios", barrioService.obtenerBarrios());
		
		return "gestor";
	}
	
	/**
	 * PostMapping se ejecuta el metodo cuando se da al boton 
	 * @param usuario se usa para guardar los datos que vienen de la pajina mediante @modelAttribute formusuario
	 * @param model 
	 * @return devuelve de nuevo la pajina html
	 */
	@PostMapping("/gestor")
	public String crearUsuario(@ModelAttribute("formusuario") Usuario usuario, ModelMap model) {
		/**
		 * guarda el usuario
		 */
		usuarioService.guardar(usuario);
		/**
		 * se crea un nuevo usuario para que los campos vuelvan a estar en blanco
		 */
		model.addAttribute("formusuario", new Usuario());
		model.addAttribute("usuarios", usuarioService.listar());
		model.addAttribute("listTab", "active");
		return "gestor";
	}
	/**
	 * elimina un usuario de la BD
	 * @param model 
	 * @param id toma el id del usuario que se va a eliminar
	 * @return devuelve la pagina de gestor mediante el metodo gestor()
	 */
	@GetMapping("/eliminarUsuario/{id}")
	public String eliminarUsuario(Model model, @PathVariable(name="id") Long id) {
		try {
			usuarioService.eliminar(id); //si no tiene error elimina el usuario
		}
		catch(Exception e){
			model.addAttribute("listErrorMessage",e.getMessage()); //si ocurre un error se muestra mensaje
		}			
		return gestor(model);
	}
	@GetMapping("/editarUsuario/{id}")
	public String CargarFormularioEditar(Model model, @PathVariable(name="id") Long id) throws Exception{
		Usuario usuarioParaEditar = usuarioService.buscarUsuario(id);
		model.addAttribute("formusuario", usuarioParaEditar);
		model.addAttribute("formTab", "active");
		model.addAttribute("modoEditar", "true");
		return "gestor";
	}
	@PostMapping("/editarUsuario")
	public String editarUsuario(@ModelAttribute("formusuario") Usuario usuario, ModelMap model) throws Exception{
		usuarioService.modificar(usuario);
		model.addAttribute("usuarios", usuarioService.listar());
		model.addAttribute("listTab", "active");
		model.addAttribute("modoEditar", "false");
		return "gestor";
	}
	@GetMapping("/cancelar")
	public String cancelar(ModelMap model) {
		return "redirect:/gestor";
	}
	
	/**
	@GetMapping("/gestorBarrio")
	public String formularioBarrio(Model model) {
		
		model.addAttribute("formBarrio", new Barrio());
		model.addAttribute("barrios", barrioService.obtenerBarrios());
		model.addAttribute("formTab2", "active");
		return "gestorBarrio";
	}
	@PostMapping("/formularioBarrio")
	public String crearBarrio(@ModelAttribute("formBarrio") Barrio barrio, ModelMap model) {
		
		barrioService.crearBarrio(barrio);
		
		model.addAttribute("formBarrio", new Barrio());
		model.addAttribute("barrios", barrioService.obtenerBarrios());
		model.addAttribute("listBarrio", "active");
		return "gestor";
	}*/
	
}
