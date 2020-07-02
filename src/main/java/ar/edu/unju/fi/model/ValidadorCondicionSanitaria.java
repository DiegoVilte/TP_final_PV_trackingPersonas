/**
 * 
 */
package ar.edu.unju.fi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



/**
 * @author Diego
 *
 */
@Component
@Entity
@Table (name = "validadorCS")
public class ValidadorCondicionSanitaria {
	
	//Se asocia a la ID como clave primaria
	@Id
	@GeneratedValue ( strategy = GenerationType.IDENTITY)
	@Column (name="ID_VCS")
	private long id;
	//@Autowired
	//private Persona persona;
	@Column (name="TAPA_BOCA")
	private boolean usaTapabocas;
	@Column(name="CUMPLE_TERM_DNI")
	private boolean cumpleTerminacionDNI;
	@Column(name="ESTA_ACOMPAÑADO")
	private boolean estaAcompañado;
	
	@Autowired
	@ManyToOne(fetch =FetchType.LAZY)
	@JoinColumn(name = "ID_REGISTROTRACKING")
	private RegistroTracking registroTracking;
	
//-------------CONSTRUCTORES---------------------
	/**
	 * 
	 */
	public ValidadorCondicionSanitaria() {
		// TODO Auto-generated constructor stub
	}
//-------------METODOS ACCESORES-----------------
	/**
	 * @return the persona
	 */
	//public Persona getPersona() {
	//	return persona;
	//}
	/**
	 * @param persona the persona to set
	 */
	//public void setPersona(Persona persona) {
	//	this.persona = persona;
	//}
	/**
	 * @return the usaTapabocas
	 */
	public boolean isUsaTapabocas() {
		return usaTapabocas;
	}
	/**
	 * @param usaTapabocas the usaTapabocas to set
	 */
	public void setUsaTapabocas(boolean usaTapabocas) {
		this.usaTapabocas = usaTapabocas;
	}
	/**
	 * @return the cumpleTerminacionDNI
	 */
	public boolean isCumpleTerminacionDNI() {
		return cumpleTerminacionDNI;
	}
	/**
	 * @param cumpleTerminacionDNI the cumpleTerminacionDNI to set
	 */
	public void setCumpleTerminacionDNI(boolean cumpleTerminacionDNI) {
		this.cumpleTerminacionDNI = cumpleTerminacionDNI;
	}
	/**
	 * @return the estaAcompañado
	 */
	public boolean isEstaAcompañado() {
		return estaAcompañado;
	}
	/**
	 * @param estaAcompañado the estaAcompañado to set
	 */
	public void setEstaAcompañado(boolean estaAcompañado) {
		this.estaAcompañado = estaAcompañado;
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
