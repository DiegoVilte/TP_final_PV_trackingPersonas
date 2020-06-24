/**
 * 
 */
package ar.edu.unju.fi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



/**
 * @author Diego
 *
 */
//Declaración de la clase Usuario

//
@Entity
@Table (name = "usuario")
public class Usuario {
	
	
	//Se asocia a la ID como clave primaria
	@Id
	@GeneratedValue ( strategy = GenerationType.IDENTITY)
	@Column (name="ID")
	private long id;
	
	@Column (name="NOMBREUSUARIO", length = 150, nullable = true)
	private String nombreUsuario; // nombre de usuario
	
	@Column (name="PASSWORD", length = 150, nullable = true)
	private String password; // password de usuario
	
	@Column (name="NOMBREREAL", length = 150, nullable = true)
	private String nombreReal; // nombre real de usuario
	
	@Column (name="APELLIDO", length = 150, nullable = true)
	private String apellidoReal; // apellido real de uauario
	
	@Column (name="TIPOUSUARIO", length = 150, nullable = true)
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
