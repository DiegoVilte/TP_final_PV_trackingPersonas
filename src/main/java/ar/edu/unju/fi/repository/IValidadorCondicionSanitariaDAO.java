/**
 * 
 */
package ar.edu.unju.fi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.edu.unju.fi.model.ValidadorCondicionSanitaria;

/**
 * @author Diego
 *
 */
public interface IValidadorCondicionSanitariaDAO extends JpaRepository<ValidadorCondicionSanitaria, Long>{
	/*public void guardar();
	
	public ValidadorCondicionSanitaria modificar();
	
	public void eliminar();
	
	public ValidadorCondicionSanitaria mostrar();
	*/

}