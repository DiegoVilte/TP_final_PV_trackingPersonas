/**
 * 
 */
package ar.edu.unju.fi.service;


import java.util.List;

import ar.edu.unju.fi.model.Barrio;

/**
 * @author Diego
 *
 */

public interface IBarrioService {
	public void crearBarrio(Barrio barrio);
	public void borrarBarrio(long id);
	public List<Barrio> obtenerBarrios();
}
