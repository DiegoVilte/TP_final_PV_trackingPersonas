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
@Entity
@Table (name = "persona")
public class Persona {

	@Id
	@GeneratedValue ( strategy = GenerationType.IDENTITY)
	@Column (name="ID")
	private long id;
	
	@Column (name = "DOCUMENTO", length = 10, nullable = true)
	private String documento;
	
	@Column (name = "APELLIDO", length = 150, nullable = true)
	private String apellido;
	
	@Column (name = "NOMBRE", length = 10, nullable = true)
	private String nombres;
	
	@Column (name = "NACIONALIDAD", length = 10, nullable = true)
	private String nacionalidad;

//---------------CONSTRUCTORES----------------------

	/**
	 * 
	 */
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param documento
	 * @param apellido
	 * @param nombres
	 * @param nacionalidad
	 */
	public Persona(String documento, String apellido, String nombres, String nacionalidad) {
		super();
		this.documento = documento;
		this.apellido = apellido;
		this.nombres = nombres;
		this.nacionalidad = nacionalidad;
	}

	// -----------METODOS ACCESORES----------------------

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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	
}
