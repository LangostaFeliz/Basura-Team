package com.company.Posicion;



public class Posicion {

	private int posicionX;
	private int posicionY;

	Posicion(int x, int y){
		this.posicionX=x;
		this.posicionY=y;
	}

	public int getPosicionX() {
		return posicionX;
	}

	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}

	public int getPosicionY() {
		return posicionY;
	}

	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}

}