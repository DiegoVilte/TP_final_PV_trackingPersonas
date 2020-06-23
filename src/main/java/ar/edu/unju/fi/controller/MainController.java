package ar.edu.unju.fi.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unju.fi.model.Usuario;
import ar.edu.unju.fi.service.IUsuarioService;
/**
 * 
 * @author Castillo Rolando
 *
 */
@Controller //anotacion para avisar ala aplicacion q es el controlador
@RequestMapping("/") 
public class MainController {
	
	@Autowired
	private IUsuarioService usuarioService;
	/**
	 * anotacion getMapping para señalar que la pajina se la buscara por "index"
	 * @param model para visualisar objetos en la pajina html
	 * @return retorna el nombre de la pajina html
	 */
	@GetMapping("login")
	public String main(Model model) {
		/**
		 * se agrega la referencia en el html "usuario" y lo que se decea msotrar del objeto
		 */
		//model.addAttribute("usuario", usuarioService.mostrar().getApellido());
		return "login";
	}
	@GetMapping("registrador")
	public String registrador(Model model)
	{
		return "registrador";
	}
	@GetMapping("consultor")
	public String consultor(Model model)
	{
		return "consultor";
	}
	@GetMapping("gestor")
	public String gestor(Model model) {
		//model.addAttribute("usuario", usuarioService.mostrar().getApellido());
		/**
		 * se crea un nuevo usuario , se lo manda ala pajina como "formusuario"
		 */
		model.addAttribute("formusuario", new Usuario());
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
		return "gestor";
	}
}
