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
	
	//variables utilizadas en los metodos para llamar los metodos de service
	@Autowired
	private IUsuarioService usuarioService;
	@Autowired
	private IBarrioService barrioService;
	
	/**
	 * carga la pajina que contine el formulario y la lista de usuario
	 * @param model para interactuar con la vista 
	 * @return la pajina gestor que contiene form y lista de usuario
	 */
	@GetMapping("gestor")
	public String cargarGestor(Model model) {
		/**
		 * se crea un nuevo usuario , se lo manda ala pajina como "formusuario"
		 */
		model.addAttribute("formusuario", new Usuario());
		//se carga la lista de usuario en "usuarios" que es referenciada en la pajina
		model.addAttribute("usuarios", usuarioService.listar());
		//se activa la seccion del fomulario en la vista
		model.addAttribute("formTab", "active");
		return "gestor";
	}
	
	/**
	 * PostMapping guarda el usuario en la base de datos con los datos mandados dese la vista
	 * @param usuario se usa para guardar los datos que vienen de la pajina mediante @modelAttribute formusuario
	 * @param model para interactuar con la vista 
	 * @return devuelve de nuevo la pajina "gestor.html"
	 */
	@PostMapping("/gestor")
	public String crearUsuario(@ModelAttribute("formusuario") Usuario usuario, ModelMap model) {
		/**
		 * guarda el usuario
		 */
		usuarioService.guardar(usuario);
		// se crea un nuevo usuario para que los campos vuelvan a estar en blanco 
		model.addAttribute("formusuario", new Usuario());
		// se carga la lista en usuarios ppara que se actulice
		model.addAttribute("usuarios", usuarioService.listar());
		// se activa la vista de la lista
		model.addAttribute("listTab", "active");
		return "gestor";
	}
	/**
	 * elimina un usuario de la BD
	 * @param model para interactuar con la vista 
	 * @param id toma el id del usuario que se va a eliminar
	 * @return devuelve la pagina de gestor mediante el metodo gestorGestor()
	 */
	@GetMapping("/eliminarUsuario/{id}")
	public String eliminarUsuario(Model model, @PathVariable(name="id") Long id) {
		try {
			usuarioService.eliminar(id); //si no tiene error elimina el usuario
		}
		catch(Exception e){
			model.addAttribute("listErrorMessage",e.getMessage()); //si ocurre un error se muestra mensaje
		}			
		return cargarGestor(model);
	}
	/**
	 * carga el formulario de usuario en modo editar
	 * @param model para interactuar con la vista 
	 * @param id toma el i del usuario a editar
	 * @return devuelve la pajina gestor.html
	 * @throws Exception
	 */
	@GetMapping("/editarUsuario/{id}")
	public String CargarFormularioEditar(Model model, @PathVariable(name="id") Long id) throws Exception{
		//se busca el usuario a editar meiante el id, y se guarda en usuarioParaEditar
		Usuario usuarioParaEditar = usuarioService.buscarUsuario(id);
		//se carga el usuario encontrado en el formulario
		model.addAttribute("formusuario", usuarioParaEditar);
		//se activa el formulario de la vista
		model.addAttribute("formTab", "active");
		//se pone el modoEditar en verdadero
		model.addAttribute("modoEditar", "true");
		return "gestor";
	}
	/**
	 * edita el usuario mediante usuarioService
	 * @param usuario se carga los datos del formulario "formusuario" 
	 * @param model para interactuar con la vista 
	 * @return la pajina gestor.html
	 * @throws Exception
	 */
	@PostMapping("/editarUsuario")
	public String editarUsuario(@ModelAttribute("formusuario") Usuario usuario, ModelMap model) throws Exception{
		//modifica el usuario
		usuarioService.modificar(usuario);
		//carga la lista actulizada de usuarios en "usuarios"
		model.addAttribute("usuarios", usuarioService.listar());
		//se actila la lista del la vista
		model.addAttribute("listTab", "active");
		//se pone en falso el modoEditar
		model.addAttribute("modoEditar", "false");
		return "gestor";
	}
	/**
	 * redireccion la pajina para canselar 
	 * @param model
	 * @return
	 */
	@GetMapping("/cancelar")
	public String cancelar(ModelMap model) {
		return "redirect:/gestor";
	}
	
	//**********SECCION DE GESTION DE BARRIO*************
	
	/**
	 * carga la pajina de gestorBarrio
	 * @param model para interactuar con la vista 
	 * @return la pajina "gestorBarrio"
	 */
	@GetMapping("gestorBarrio")
	public String cargarGestorBarrio(Model model) {
		//se crea un nuevo objeto Barrio y se lo carga en "formBarrio" en el formulario
		model.addAttribute("formBarrio", new Barrio());
		//se carga la lista de barrios en "barrios"
		model.addAttribute("barrios", barrioService.obtenerBarrios());
		//se activa el formulario en la vista
		model.addAttribute("formTab2", "active");
		return "gestorBarrio";
	}
	/**
	 * crea un barrio cargado en la vista
	 * @param barrio guarda los datos del formulario mediante "formBarrio"
	 * @param model para interactuar con la vista 
	 * @return retorna la pajina gestorBarrio.html
	 */
	@PostMapping("/gestorBarrio")
	public String crearBarrio(@ModelAttribute("formBarrio") Barrio barrio, ModelMap model) {
		//se crea el barrio con los datos enviandos
		barrioService.crearBarrio(barrio);
		//se crea un nuevo barrio para que el formulario vuelva a estar en blanco sus campos
		model.addAttribute("formBarrio", new Barrio());
		//se carga los barrios para actulisar la lista 
		model.addAttribute("barrios", barrioService.obtenerBarrios());
		//se activa la lista en la vista
		model.addAttribute("listBarrio", "active");
		return "gestorBarrio";
	}
	/**
	 * elimina un barrio de la BD
	 * @param model para interactuar con la vista 
	 * @param id toma el id del barrio que se va a eliminar
	 * @return devuelve la pagina de gestor mediante el metodo 
	 */
	@GetMapping("/eliminarBarrio/{id}")
	public String eliminarBarrio(Model model, @PathVariable(name="id") Long id) {
		try {
			barrioService.borrarBarrio(id); //si no tiene error elimina el barrio
		}
		catch(Exception e){
			model.addAttribute("listErrorMessage",e.getMessage()); //si ocurre un error se muestra mensaje
		}			
		return cargarGestorBarrio(model);
	}
	/**
	 * carga el formulario pero en modo editar
	 * @param model para interactuar con la vista 
	 * @param id toma el valor del id del barrio a editar
	 * @return devuelve la pajina de gestorBarrio.html
	 * @throws Exception
	 */
	@GetMapping("/editarBarrio/{id}")
	public String CargarFormularioEditarBarrio(Model model, @PathVariable(name="id") Long id) throws Exception{
		//busca el barrio mediante el id mandado, y lo carga en barrioParaEditar
		Barrio barrioParaEditar = barrioService.buscarBarrio(id);
		//se carga el nombre del barrio en el formulario
		model.addAttribute("formBarrio", barrioParaEditar);
		//se activa el formulario en la vista
		model.addAttribute("formTab2", "active");
		//se pone en verdadero el modoEditar
		model.addAttribute("modoEditar", "true");
		return "gestorBarrio";
	}
	/**
	 * se edita el barrio 
	 * @param barrio se carga los nuevos datos ingresados en la vista
	 * @param model para interactuar con la vista 
	 * @return devuelve la pajina gestorBarrio.html
	 * @throws Exception
	 */
	@PostMapping("/editarBarrio")
	public String editarBarrio(@ModelAttribute("formBarrio") Barrio barrio, ModelMap model) throws Exception{
		//modifica el barrio con los nuevos datos
		barrioService.modificar(barrio);
		//se actuliza la lista de barrios
		model.addAttribute("barrios", barrioService.obtenerBarrios());
		//se activa la lista en la vista
		model.addAttribute("listBarrio", "active");
		//se pone en falso el modoEditar
		model.addAttribute("modoEditar", "false");
		return "gestorBarrio";
	}
	
}
