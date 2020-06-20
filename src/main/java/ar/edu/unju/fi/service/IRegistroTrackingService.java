/**
 * 
 */
package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.RegistroTracking;

/**
 * @author daniel-gnu
 *
 */
public interface IRegistroTrackingService {
	public void guardar();

	public RegistroTracking modificar();

	public void eliminar();

	public RegistroTracking mostrar();
}
