/**
 * 
 */
package ar.edu.unju.fi.repository;
import ar.edu.unju.fi.model.RegistroTracking;

/**
 * @author daniel-gnu
 *
 */
public interface IRegistroTrackingDAO {
	public void guardar();

	public RegistroTracking modificar();

	public void eliminar();

	public RegistroTracking mostrar();

}
