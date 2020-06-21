/**
 * 
 */
package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.ValidadorCondicionSanitaria;

/**
 * @author Diego
 *
 */
public interface IValidadorCondicionSanitariaService {
	
	public void guardar();
	
	public ValidadorCondicionSanitaria modificar();
	
	public void eliminar();
	
	public ValidadorCondicionSanitaria mostrar();

}
