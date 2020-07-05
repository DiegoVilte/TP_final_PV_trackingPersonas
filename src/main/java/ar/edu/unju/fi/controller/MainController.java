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
	
}
