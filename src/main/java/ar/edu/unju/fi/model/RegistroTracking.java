/**
 * 
 */
package ar.edu.unju.fi.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Diego
 *
 */
@Component
// declaracion de la claseRegistroTracking
public class RegistroTracking {
	
	//Se asocia a la ID como clave primaria
	@Id
	@GeneratedValue ( strategy = GenerationType.IDENTITY)
	@Column (name="ID")
	private long id;
	private LocalDateTime fechaHora; // fecha de registro tracking
	@Autowired
	private Barrio localidad; // localidad de registro tracking
	@Autowired
	private List<ValidadorCondicionSanitaria> vcs; // lista de validaciones de condicion sanitaria
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
	 * @param vcs
	 * @param detalleLugarRegistro
	 */
	public RegistroTracking(LocalDateTime fechaHora, Barrio localidad, List<ValidadorCondicionSanitaria> vcs,
			String detalleLugarRegistro) {
		this.fechaHora = fechaHora;
		this.localidad = localidad;
		this.vcs = vcs;
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

	/**
	 * @return the vcs
	 */
	public List<ValidadorCondicionSanitaria> getVcs() {
		return vcs;
	}

	/**
	 * @param vcs the vcs to set
	 */
	public void setVcs(List<ValidadorCondicionSanitaria> vcs) {
		this.vcs = vcs;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	
	
	

}
