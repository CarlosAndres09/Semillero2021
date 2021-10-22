package com.hbt.semillero.enums;

/**
 * 
 * <b>Descripción:<b> Clase que determina la enumeracion para representar
 * si le comic tiene existencia
 * <b>Caso de Uso:<b> 
 * @author Carlos Andres Ordoñez 
 * @version
 */

public enum EstadoEnum {
	ACTIVO("enum.estado.activo"),  
	INACTIVO("enum.estado.inactivo");
	
	/**
	 * Atributo que contiene la clave del mensaje para determinar existencia
	 */
	
	private String codigoMensaje;
	
	/**
	 * 
	 * Constructor que recibe como parametro el codigo del mensaje
	 * @param codigoMensaje, clave del mensaje para determinar existencia
	 */
	EstadoEnum(String codigoMensaje) {
		this.codigoMensaje = codigoMensaje;
	}
	
	/**
	 * Metodo encargado de retornar el valor del atributo codigoMensaje
	 * @return El codigoMensaje asociado a la clase
	 */
	public String getCodigoMensaje() {
		return codigoMensaje;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo codigoMensaje
	 * @param codigoMensaje El nuevo codigoMensaje a modificar.
	 */
	public void setCodigoMensaje(String codigoMensaje) {
		this.codigoMensaje = codigoMensaje;
	}

	
}
