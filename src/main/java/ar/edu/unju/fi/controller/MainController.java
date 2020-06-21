package ar.edu.unju.fi.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unju.fi.service.IUsuarioService;
/**
 * 
 * @author Castillo Rolando
 *
 */
@Controller //anotacion para avisar ala aplicacion q es el controlador
@RequestMapping("/") 
public class MainController {
	
	//@Autowired
	/**
	 * objeto para acceder alos datos del usuario
	 */
	//private IUsuarioService usuarioService;
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

}
