/**
 * 
 */
package ar.edu.unju.fi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.edu.unju.fi.model.Barrio;


/**
 * @author Diego
 *
 */
public interface IBarrioDAO extends JpaRepository<Barrio, Long> {

}
