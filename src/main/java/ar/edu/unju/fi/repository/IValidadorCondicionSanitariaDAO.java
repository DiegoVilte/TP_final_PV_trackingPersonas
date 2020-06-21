/**
 * 
 */
package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.ValidadorCondicionSanitaria;

/**
 * @author Diego
 *
 */
public interface IValidadorCondicionSanitariaDAO {
	public void guardar();
	
	public ValidadorCondicionSanitaria modificar();
	
	public void eliminar();
	
	public ValidadorCondicionSanitaria mostrar();
	

}