package com.utad.dawe.app;

import com.utad.dawe.model.JugadorBalonMano;

public class Equipo {

	public static void main(String[] args) {
		//Creo dos objetos de la clase JugadorBalonMano
		JugadorBalonMano a = new JugadorBalonMano("Pepe", 1);
		JugadorBalonMano b = new JugadorBalonMano("Jose", 2);
		//Creo 6 arrays 3 para cada objeto uno para anotacion, 
		//otro paa bloqueos y otro para el tiempo dde juego.
		int [] anotacion1= new int[10];
		int [] anotacion2= new int [10];
		int [] bloqueos1= new int [10];
		int [] bloqueos2= new int [10];
		int [] tiempoJuego1= new int [10];
		int [] tiempoJuego2= new int [10];
		
		//Le doy un valor Random a las estadisticas de cada jugador
		for(int i=0;i<10;i++) {
			anotacion1[i]=(int)(Math.random()*10);
			anotacion2[i]=(int)(Math.random()*10);
			bloqueos1[i]=(int)(Math.random()*10);
			bloqueos2[i]=(int)(Math.random()*10);
			tiempoJuego1[i]=(int)(Math.random()*3600);
			tiempoJuego2[i]=(int)(Math.random()*3600);
		}
		//Muestro las estadisticas por jornada
		
		System.out.println("JORNADAS");
		System.out.println("----------------------------------------");
		for(int i=0;i<10;i++) {
			System.out.println("Jornada "+(i+1));
			System.out.println("Jugador A "+ anotacion1[i]+" puntos "+bloqueos1[i]+ " bloqueos "+tiempoJuego1[i]+ " segundos");
			System.out.println("Jugador B "+ anotacion2[i]+" puntos "+bloqueos2[i]+ " bloqueos "+tiempoJuego2[i]+ " segundos");
			System.out.println("----------------------------------------");
		}
		//Voy sumando las estadisticas de las 5 primeras jornadas y las muestro
		for(int i=0;i<5;i++) {
			a.setAnotacion(anotacion1[i]); 
			b.setAnotacion(anotacion2[i]);
			a.setBloqueo(bloqueos1[i]);
			b.setBloqueo(bloqueos2[i]);  
			a.setTiempoJugado(tiempoJuego1[i]); 
			b.setTiempoJugado(tiempoJuego2[i]); 
		}
		System.out.println();
		System.out.println("ESTADISTICAS");
		System.out.println("-------------------------------------");
		System.out.print("Jugador 1 a las 5 jornadas"); 
		a.estadisticas(5);
		System.out.println("-------------------------------------");
		System.out.print("Jugador 2 a las 5 jornadas"); 
		b.estadisticas(5);
		System.out.println("-------------------------------------");
		
		//Hago lo mismo hasta la jornada 10
		for(int i=5;i<10;i++) {
			a.setAnotacion(anotacion1[i]); 
			b.setAnotacion(anotacion2[i]);
			a.setBloqueo(bloqueos1[i]);
			b.setBloqueo(bloqueos2[i]);  
			a.setTiempoJugado(tiempoJuego1[i]); 
			b.setTiempoJugado(tiempoJuego2[i]); 
		}
		System.out.print("Jugador 1 a las 10 jornadas"); 
		a.estadisticas(10);
		System.out.println("-------------------------------------");
		System.out.print("Jugador 2 a las 10 jornadas"); 
		b.estadisticas(10);
		System.out.println("-------------------------------------");
	}
	
	
	
	
	
}
