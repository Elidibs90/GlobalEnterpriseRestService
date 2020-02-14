package com.globalenterprise.apirestuser.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Usuario")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "apellido")
	private String apellido;

	@Column(name = "email")
	private String email;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "profesion")
	private String profesion;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	public User() {
	}

	public User(int id, String apellido, String email, String nombre, String profesion) {
		this.id = id;
		this.apellido = apellido;
		this.email = email;
		this.nombre = nombre;
		this.profesion = profesion;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", apellido=" + apellido + ", email=" + email + ", nombre=" + nombre + ", profesion="
				+ profesion + "]";
	}

}