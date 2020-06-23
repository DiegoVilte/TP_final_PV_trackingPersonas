/**
 * 
 */
package ar.edu.unju.fi.model;

import java.util.List;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Diego
 *
 */
// declaracion de la claseRegistroTracking
public class RegistroTracking {
	private LocalDateTime fechaHora; // fecha de registro tracking
	@Autowired
	private Barrio localidad; // localidad de registro tracking
	private List<Persona> personas; // lista de personas de registro tracking
	private String detalleLugarRegistro;// detalle de registro tracking

//---------CONSTRUCTORES----------------------------
	/**
	 * 
	 */
	public RegistroTracking() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param fechaHora
	 * @param localidad
	 * @param personas
	 * @param detalleLugarRegistro
	 */
	public RegistroTracking(LocalDateTime fechaHora, Barrio localidad, List<Persona> personas,
			String detalleLugarRegistro) {
		super();
		this.fechaHora = fechaHora;
		this.localidad = localidad;
		this.personas = personas;
		this.detalleLugarRegistro = detalleLugarRegistro;
	}

	// -------------METODOS ACCESORES---------------------------
	/**
	 * @return the fechaHora
	 */
	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	/**
	 * @param fechaHora the fechaHora to set
	 */
	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}

	/**
	 * @return the localidad
	 */
	public Barrio getLocalidad() {
		return localidad;
	}

	/**
	 * @param localidad the localidad to set
	 */
	public void setLocalidad(Barrio localidad) {
		this.localidad = localidad;
	}

	/**
	 * @return the personas
	 */
	public List<Persona> getPersonas() {
		return personas;
	}

	/**
	 * @param personas the personas to set
	 */
	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}

	/**
	 * @return the detalleLugarRegistro
	 */
	public String getDetalleLugarRegistro() {
		return detalleLugarRegistro;
	}

	/**
	 * @param detalleLugarRegistro the detalleLugarRegistro to set
	 */
	public void setDetalleLugarRegistro(String detalleLugarRegistro) {
		this.detalleLugarRegistro = detalleLugarRegistro;
	}

}
