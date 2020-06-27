/**
 * 
 */
package ar.edu.unju.fi.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Diego
 *
 */
public class Barrio {
	
	//Se asocia a la ID como clave primaria
	@Id
	@GeneratedValue ( strategy = GenerationType.IDENTITY)
	@Column (name="ID")
	private long id;
	private String nombre;
//-------CONSTRUCTORES---------------

	/**
	 * 
	 */
	public Barrio() {
		// TODO Auto-generated constructor stub
	}
	
//---------METODOS ACCESORES--------------	

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
