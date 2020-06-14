/**
 * 
 */
package ar.edu.unju.fi.trackpersonas.model;

/**
 * @author Diego
 *
 */
public class Usuario {
	private String nombreUsuario;
	private String password;
	private String nombreReal;
	private String apellidoReal;
	private String tipoUsuario;
//--------------CONSTRUCTORES------------------------------
	/**
	 * 
	 */
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
//--------------METODOS ACCESORES--------------------------
	/**
	 * @return the nombreUsuario
	 */
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	/**
	 * @param nombreUsuario the nombreUsuario to set
	 */
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the nombreReal
	 */
	public String getNombreReal() {
		return nombreReal;
	}
	/**
	 * @param nombreReal the nombreReal to set
	 */
	public void setNombreReal(String nombreReal) {
		this.nombreReal = nombreReal;
	}
	/**
	 * @return the apellidoReal
	 */
	public String getApellidoReal() {
		return apellidoReal;
	}
	/**
	 * @param apellidoReal the apellidoReal to set
	 */
	public void setApellidoReal(String apellidoReal) {
		this.apellidoReal = apellidoReal;
	}
	/**
	 * @return the tipoUsuario
	 */
	public String getTipoUsuario() {
		return tipoUsuario;
	}
	/**
	 * @param tipoUsuario the tipoUsuario to set
	 */
	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	

}
