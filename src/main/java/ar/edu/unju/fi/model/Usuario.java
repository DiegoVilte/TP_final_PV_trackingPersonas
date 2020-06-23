/**
 * 
 */
package ar.edu.unju.fi.model;

import org.springframework.stereotype.Component;

/**
 * @author Diego
 *
 */
//Declaración de la clase Usuario
@Component
public class Usuario {
	private String nombreUsuario; // nombre de usuario
	private String password; // password de usuario
	private String nombreReal; // nombre real de usuario
	private String apellidoReal; // apellido real de uauario
	private String tipoUsuario; // tipo de usuario

//--------------CONSTRUCTORES-----------------//
	/**
	 * constructor vacio
	 */
	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * constructor parametrizado
	 * 
	 * @param nombreUsuario nombre del usuario
	 * @param password      password del usuario
	 * @param nombreReal    nombre real del usuario
	 * @param apellidoReal  apellido real del usuario
	 * @param tipoUsuario   tipo de usuario
	 */
	public Usuario(String nombreUsuario, String password, String nombreReal, String apellidoReal, String tipoUsuario) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.password = password;
		this.nombreReal = nombreReal;
		this.apellidoReal = apellidoReal;
		this.tipoUsuario = tipoUsuario;
	}

	// --------------METODOS ACCESORES--------------------------
	/**
	 * @return nombreUsuario ret
	 */
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	/**
	 * @param nombreUsuario nombre de usario a establecer
	 */
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	/**
	 * @return password devuelve password de usuario
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password el password de usario a establecer
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return nombreReal devuelve nombre real de usuario
	 */
	public String getNombreReal() {
		return nombreReal;
	}

	/**
	 * @param nombreReal nombre real de usuario real a establecer
	 */
	public void setNombreReal(String nombreReal) {
		this.nombreReal = nombreReal;
	}

	/**
	 * @return apellidoReal devuelve apellido real de usuario
	 */
	public String getApellidoReal() {
		return apellidoReal;
	}

	/**
	 * @param apellidoReal apellido real de usuario real a establecer
	 */
	public void setApellidoReal(String apellidoReal) {
		this.apellidoReal = apellidoReal;
	}

	/**
	 * @return tipoUsuario devuelve tipo de usuario
	 */
	public String getTipoUsuario() {
		return tipoUsuario;
	}

	/**
	 * @param tipoUsuario tipo de usuario a establecer
	 */
	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	/**
	 * toString metodo de la clase string que devuelve el estado de parametros
	 * String nombreUsuario; String password; String nombreReal; String
	 * apellidoReal; String tipoUsuario;
	 */
	@Override
	public String toString() {
		return "Usuario [nombreUsuario=" + nombreUsuario + ", password=" + password + ", nombreReal=" + nombreReal
				+ ", apellidoReal=" + apellidoReal + ", tipoUsuario=" + tipoUsuario + "]";
	}

}
