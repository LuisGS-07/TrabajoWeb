package pe.edu.upc.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Carrera")
public class Carrera {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idCarrera;

	@Column(name = "nombre", nullable = false, length = 35)
	private String nombre;

	
	public Carrera() {
		super();
	}


	public Carrera(int idCarrera, String nombre) {
		super();
		this.idCarrera = idCarrera;
		this.nombre = nombre;
	}


	public int getIdCarrera() {
		return idCarrera;
	}


	public void setIdCarrera(int idCarrera) {
		this.idCarrera = idCarrera;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
}
