package com.cursoceat.main;

public class Hora {

	protected int hora;
	protected int minutos;
	
	public Hora(int hora, int minutos) {
		this.hora = hora;
		this.minutos = minutos;
		if(setHora(hora)== false) {
			System.out.println("Hora no válida");
		}
		if(setMinutos(minutos)== false) {
			System.out.println("Minutos no válidos");
		}
		
	}

	public int getHora() {
		return hora;
	}
//comprobamos la hora que este entre 0 y 24
	public boolean setHora(int hora) {
		boolean correcto =false;
		if (hora >=0 && hora <24) {
			this.hora = hora;
			correcto = true;
		}
		return correcto ;
	}

	public int getMinutos() {
		return minutos;
	}

	public boolean setMinutos(int minutos) {
		boolean correcto= false;
		if (minutos >=0 && minutos <60) {
		this.minutos = minutos;
		correcto = true;
	}
		return correcto;
	
	}
	//incrementamos un minuto
public void incremento() {
	minutos++;
	if (minutos>59) {
		minutos=0;
		hora++;
    if (hora >23) {
    	hora=0;
    }
}
}
//metodo automatico 
@Override
public String toString() {
	return hora +":"+ minutos;
}
	



}
