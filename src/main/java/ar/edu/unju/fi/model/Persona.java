/**
 * 
 */
package ar.edu.unju.fi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

/**
 * @author Diego
 *
 */
@Component
@Entity
@Table (name = "persona")
public class Persona {

	@Id
	@GeneratedValue ( strategy = GenerationType.IDENTITY)
	@Column (name="ID_PERSONA")
	private long id;
	
	@Column (name = "DOCUMENTO", length = 10, nullable = true)
	private String documento;
	
	@Column (name = "APELLIDO", length = 150, nullable = true)
	private String apellido;
	
	@Column (name = "NOMBRE", length = 10, nullable = true)
	private String nombres;
	
	@Column (name = "NACIONALIDAD", length = 10, nullable = true)
	private String nacionalidad;
	@OneToMany
	@JoinColumn(name="ID_VCS")
	private long id_vcs;

//---------------CONSTRUCTORES----------------------

	/**
	 * 
	 */
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	

	/**
 * @param id
 * @param documento
 * @param apellido
 * @param nombres
 * @param nacionalidad
 * @param id_vcs
 */
public Persona(long id, String documento, String apellido, String nombres, String nacionalidad, long id_vcs) {
	this.id = id;
	this.documento = documento;
	this.apellido = apellido;
	this.nombres = nombres;
	this.nacionalidad = nacionalidad;
	this.id_vcs = id_vcs;
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



	/**
	 * @return the id_vcs
	 */
	public long getId_vcs() {
		return id_vcs;
	}



	/**
	 * @param id_vcs the id_vcs to set
	 */
	public void setId_vcs(long id_vcs) {
		this.id_vcs = id_vcs;
	}

	
}
