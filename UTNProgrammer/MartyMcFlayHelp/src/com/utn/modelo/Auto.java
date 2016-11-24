package com.utn.modelo;

public class Auto {

	private String marca;
	private String modelo;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void encender(){
		System.out.println("Encendiendo el auto.........");
		System.out.println("Encendido");
	}
	public void apagar(){
		System.out.println("Apagando el auto.........");
		System.out.println("Apagado");
	}
	
}
