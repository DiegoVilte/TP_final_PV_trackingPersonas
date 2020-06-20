/**
 * 
 */
package ar.edu.unju.fi.model;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Diego
 *
 */
public class ValidadorCondicionSanitaria {
	@Autowired
	private Persona persona;
	private boolean usaTapabocas;
	private boolean cumpleTerminacionDNI;
	private boolean estaAcompañado;
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
	public Persona getPersona() {
		return persona;
	}
	/**
	 * @param persona the persona to set
	 */
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
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
	

}
