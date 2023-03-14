package com.cursoceat.main;

public class HoraExacta extends Hora{

	protected int segundos;

	public HoraExacta(int hora, int minutos, int segundos) {
		super(hora, minutos);
		if (setSegundos(segundos)== false) {
			System.out.println("Segundos incorrectos ");
		}
	}

	public int getSegundos() {
		return segundos;
	}

	public boolean setSegundos(int segundos) {
		boolean correcto= false;
		
		if (segundos >=0 && segundos <60) {
			this.segundos = segundos;
			correcto=true;
		}
	return correcto;
	}

	@Override
	public void incremento() {
		segundos++;
		if (segundos>59) {
			segundos=0;
			super.incremento();
	}	
	}

	@Override
	public String toString() {
	String resultado= super.toString();
	resultado +=  ":" + segundos ;
		return resultado;
	}
	
	@Override
	public boolean equals(Object o) {
	HoraExacta otroReloj=(HoraExacta)o;
	boolean iguales;
	
	if (this.hora == otroReloj.hora && this.minutos == otroReloj.minutos && this.segundos== otroReloj.segundos) {
	iguales=true;
    
	}else {
		iguales=false;
	}
	return iguales;
	
	
	}
	}

