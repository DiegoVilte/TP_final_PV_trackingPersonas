/**
 * 
 */
package ar.edu.unju.fi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.edu.unju.fi.model.Persona;
/**
 * @author Diego
 *
 */
public interface IPersonaDAO extends JpaRepository<Persona, Long>{
	/*public void guardar();
	public Persona modificar();
	public void elimina();
	public Persona mostrar();
	*/
}
