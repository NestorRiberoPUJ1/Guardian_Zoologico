package com.codingdojo.nestor;

public class Gorilla extends Mamifero {

	public Gorilla() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void lanzarAlgo() {
		System.out.println("Tira piedra");
		setNivelDeEnergia(getNivelDeEnergia() - 5);
	}

	public void comerBananas() {
		System.out.println("Rica banana");
		setNivelDeEnergia(getNivelDeEnergia() + 10);
	}
	public void escalar() {
		System.out.println("Arbol trepado");
		setNivelDeEnergia(getNivelDeEnergia() - 10);
	}
}
