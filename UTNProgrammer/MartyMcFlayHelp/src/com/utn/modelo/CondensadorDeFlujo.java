package com.utn.modelo;

public class CondensadorDeFlujo {

	private String anioInicio;
	private String anioLlegada;
	private String anioDondeEstuvo;
	private Plutonio plutonio;
	
	
	public String getAnioInicio() {
		return anioInicio;
	}
	public void setAnioInicio(String anioInicio) {
		this.anioInicio = anioInicio;
	}
	public String getAnioLlegada() {
		return anioLlegada;
	}
	public void setAnioLlegada(String anioLlegada) {
		this.anioLlegada = anioLlegada;
	}
	public String getAnioDondeEstuvo() {
		return anioDondeEstuvo;
	}
	public void setAnioDondeEstuvo(String anioDondeEstuvo) {
		this.anioDondeEstuvo = anioDondeEstuvo;
	}
	
	
	public void encenderCondensador(int millasPorHora){
		
		if(millasPorHora>=88){
			viajeEnElTiempo();
			System.out.println("Viajando en el tiempo");
		}
	}
	private void viajeEnElTiempo(){
		System.out.println("Se genero los 1.2 GW");
	}
	

	
	//================ Clase anidad Plutonio ==================//
	private class Plutonio{
		private final double densidad=19816.0; // 19816 kg/m3
		private double cantidad; //en kilogramos
		private final int numeroAtomico=94;
		
		
		public Plutonio(double cantidad) {
			this.cantidad = cantidad;
		}
		public double getCantidad() {
			return cantidad;
		}
		public void setCantidad(double cantidad) {
			this.cantidad = cantidad;
		}
		public double getDensidad() {
			return densidad;
		}
		public int getNumeroAtomico() {
			return numeroAtomico;
		}
		
		public void combustion(){
			// c=C/m   c: especifico, C: cantidad de calor a suministrar y m: la masa.
			//c=35.5J(K/kg)
			puntoDeFusion();
			//
			System.out.println("La combustion lograda es de: "+((cantidad*35.5)+639));
		}
		private void puntoDeFusion(){
			//punto de fusion 912.5K (639 °C)
			System.out.println("Calentando plutonion hasta llegar a los 912.5K (639 °C)");
		}
		
	}
}
