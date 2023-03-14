package com.cursoceat.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner entrada = new Scanner(System.in);
		/*Hora r = new Hora(11, 30);
		System.out.println(r);
	
		for ( int i =1; i<=61; i++) {
			r.incremento();
		}
		System.out.println(r);
		System.out.println("Escriba una hora ");
		int hora = entrada.nextInt();
		
		boolean cambio = r.setHora(hora);
		if (cambio) {
			System.out.println(r);
		}else {
			System.out.println("La hora no se ha podido cambiar");
		}*/
	/*HoraExacta r= new HoraExacta(11, 13, 23);
    System.out.println(r);

	for ( int i=1; i<=61; i++) {
		r.incremento();
	}
	System.out.println(r);
	System.out.println("Escriba los segundos");
    int segundos = entrada.nextInt();
    if ( r.setSegundos(segundos)) {
    	System.out.println(r);
    }else {
    	System.out.println("No se pueden cambiar los segundos ");
    }*/
	
	HoraExacta a= new HoraExacta(1, 2, 3);
	HoraExacta b= new HoraExacta(1, 2, 3);
	HoraExacta c= new HoraExacta(10, 20, 30);
	System.out.println(a.equals(b));
	System.out.println(a.equals(c));
	
	
	}

}
