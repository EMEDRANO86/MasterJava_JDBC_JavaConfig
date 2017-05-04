/**
 * 
 */
package com.grupoatrium.modelo;

/**
 * Clase de definici�n de Editorial
 * @author Elena
 *
 */
public class Editorial {

	// Definimos las propiedades de clase
	private String nombre;
	private String direccion;
	private String nif;

	// Constructor para definir propiedades de clase
	public Editorial(String nombre, String direccion, String nif) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.nif = nif;
	}

	//--------------M�todos de acceso y modificaci�n-------------

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	// M�todo de prueba de inyecciones
	@Override
	public String toString() {
		return "Nombre: " + nombre + "; Direcci�n: " + direccion + "; Nif: " + nif
				+ "\n --------------------------";
	}

}
