/**
 * 
 */
package ar.edu.unju.fi.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

/**
 * @author Diego
 *
 */
@Component
@Entity
@Table(name = "barrios")
public class Barrio {

	// Se asocia a la ID como clave primaria
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_BARRIO")
	private long id;
	@Column(name = "NOMBRE")
	private String nombre;
	@Column(name = "registros")
	@OneToMany(fetch = FetchType.EAGER)
	private List<RegistroTracking> registros;
//-------CONSTRUCTORES---------------

	/**
	 * 
	 */
	public Barrio() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param nombre
	 * @param registros
	 */
	public Barrio(long id, String nombre, List<RegistroTracking> registros) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.registros = registros;
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

	/**
	 * @return the registros
	 */
	public List<RegistroTracking> getRegistros() {
		return registros;
	}

	/**
	 * @param registros the registros to set
	 */
	public void setRegistros(List<RegistroTracking> registros) {
		this.registros = registros;
	}

	@Override
	public String toString() {
		return "Barrio [id=" + id + ", nombre=" + nombre + ", registros=" + registros + "]";
	}

}
