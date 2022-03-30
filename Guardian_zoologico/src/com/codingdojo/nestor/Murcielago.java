package com.codingdojo.nestor;

public class Murcielago extends Mamifero {

	public Murcielago() {
		super();
		setNivelDeEnergia(300);
	}

	public void volar() {
		setNivelDeEnergia(getNivelDeEnergia() - 50);
		System.out.println("wing wing wing");
	}

	public void comerHumanos() {
		setNivelDeEnergia(getNivelDeEnergia() + 25);
	}

	public void atacarPueblo() {
		System.out.println("Ayyyy la llama");
		setNivelDeEnergia(getNivelDeEnergia() - 100);
	}

}
