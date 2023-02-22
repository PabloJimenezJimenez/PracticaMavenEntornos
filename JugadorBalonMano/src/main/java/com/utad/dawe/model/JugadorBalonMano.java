package com.utad.dawe.model;

public class JugadorBalonMano {
	private String nombre;
	private int dorsal;
	private int anotacion;
	private int bloqueo;
	private int tiempoJugado;
	
	public JugadorBalonMano(String nombre, int dorsal) {
		
		this.nombre = nombre;
		this.dorsal = dorsal;
	}
	public void setAnotacion(int anotacion) {
		this.anotacion += anotacion;
	}
	public void setBloqueo(int bloqueo) {
		this.bloqueo += bloqueo;
	}
	public void setTiempoJugado(int tiempoJugado) {
		this.tiempoJugado += tiempoJugado;
	}
	
	//Creo un metodo que me muestre las estadisticas de cada jugador
	public  void estadisticas(int jornadas) {
		System.out.println("\nAnotacion media: "+anotacion/jornadas);
		System.out.println("Bloqueos medios: "+bloqueo/jornadas);
		System.out.println("Tiempo de juego medio: "+tiempoJugado/jornadas);
		}
	@Override
	public String toString() {
		return "JugadorBalonMano [nombre=" + nombre + ", dorsal=" + dorsal + ", anotacion=" + anotacion + ", bloqueo="
				+ bloqueo + ", tiempoJugado=" + tiempoJugado + "]";
	}
	
	
	
}
