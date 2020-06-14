/**
 * 
 */
package ar.edu.unju.fi.trackpersonas.model;

/**
 * @author Diego
 *
 */
public class Persona {
	
	private String documento;
	private String apellido;
	private String nombres;
	private String nacionalidad;
	
//---------------CONSTRUCTORES----------------------
	
	/**
	 * 
	 */
	public Persona() {
		// TODO Auto-generated constructor stub
	}
	
//-----------METODOS ACCESORES----------------------
	
	/**
	 * @return the documento
	 */
	public String getDocumento() {
		return documento;
	}
	/**
	 * @param documento the documento to set
	 */
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
	 * @return the nombres
	 */
	public String getNombres() {
		return nombres;
	}
	/**
	 * @param nombres the nombres to set
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	/**
	 * @return the nacionalidad
	 */
	public String getNacionalidad() {
		return nacionalidad;
	}
	/**
	 * @param nacionalidad the nacionalidad to set
	 */
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
}

