package com.sistemaMultas.sistemaMultas.Models;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "personal")
public class Persona {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String apellido;
	    private String nombre;
	    private String dni;
	    private String cuil;
	    private LocalDate fechaNacimiento;
	    private String genero;
	    private String nacionalidad;
	    private String estadoCivil;
	    private String ocupacion;
	    private String domicilio;
	    private String telefono;
	    private String email;

	    @Column(columnDefinition = "TEXT")
	    private String observaciones;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getDni() {
			return dni;
		}

		public void setDni(String dni) {
			this.dni = dni;
		}

		public String getCuil() {
			return cuil;
		}

		public void setCuil(String cuil) {
			this.cuil = cuil;
		}

		public LocalDate getFechaNacimiento() {
			return fechaNacimiento;
		}

		public void setFechaNacimiento(LocalDate fechaNacimiento) {
			this.fechaNacimiento = fechaNacimiento;
		}

		public String getGenero() {
			return genero;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}

		

		public String getEstadoCivil() {
			return estadoCivil;
		}

		public void setEstadoCivil(String estadoCivil) {
			this.estadoCivil = estadoCivil;
		}
		
		public String getNacionalidad() {
			return nacionalidad;
		}

		public void setNacionalidad(String nacionalidad) {
			this.nacionalidad = nacionalidad;
		}

		public String getOcupacion() {
			return ocupacion;
		}

		public void setOcupacion(String ocupacion) {
			this.ocupacion = ocupacion;
		}

		public String getDomicilio() {
			return domicilio;
		}

		public void setDomicilio(String domicilio) {
			this.domicilio = domicilio;
		}

		public String getTelefono() {
			return telefono;
		}

		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getObservaciones() {
			return observaciones;
		}

		public void setObservaciones(String observaciones) {
			this.observaciones = observaciones;
		}    
	    
}
