package com.utn.controlador;

import java.lang.reflect.Method;
import java.util.Scanner;

import com.utn.modelo.Auto;

public class BackToTheFuture {

	private Auto auto;
	Scanner s = new Scanner(System.in);
	
	
	public void subirseAlAuto(){
		new Auto("DeLorean","Emmet Brouwn");
		
	}
	
	public void viajarEnElTiempo(){
		//auto.encender();
		this.acelerar();
		try {
			Class condensadorClass = Class.forName("com.utn.modelo.CondensadorDeFlujo");
			Object newCondensador = condensadorClass.newInstance();
			
			Method[] allMethodCondensador = condensadorClass.getDeclaredMethods();
			
			for (Method method : allMethodCondensador) {
				System.out.println(method.getName());
			}
			
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			// TODO: handle exception
		}
	}

	private void acelerar(){
		System.out.println("Ingrese velocidad: ");
		auto.setVelocidad(s.nextInt());
		
	}
	public void arrancarAuto(){
		auto.encender();
	}
	
	public Auto getAuto() {
		return auto;
	}

	public void setAuto(Auto auto) {
		this.auto = auto;
	}

	
}
