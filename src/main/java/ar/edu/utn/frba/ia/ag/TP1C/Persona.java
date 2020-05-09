package main.java.ar.edu.utn.frba.ia.ag.TP1C;

import main.java.ar.edu.utn.frba.ia.ag.Individuo;
import main.java.ar.edu.utn.frba.ia.ag.UTgeNesUtils;

import java.util.Arrays;
import java.util.List;

public class Persona extends Individuo {
	private String ubicacionCasa;
	private String colorCasa;
	private String marcaCigarrillos;
	private String bebida;
	private String mascota;
	private String nacionalidad;
	private Persona vecinoIzquierda;
	private Persona vecinoDerecha;


	private static List<String> ubicacionesCasa = Arrays.asList("primera", "segunda", "tercera", "cuarta", "quinta");
	private static List<String> coloresCasa = Arrays.asList("azul", "amarilla", "verde", "marfil", "roja");
	private static List<String> marcasCigarrillo = Arrays.asList("parliaments" , "chesterfields", "kools","lucky strike",  "the old gold");
	private static List<String> bebidas = Arrays.asList("agua", "jugo de naranja", "leche", "te", "cafe");
	private static List<String> mascotas = Arrays.asList("perro", "caracoles", "zorro", "caballo", "cebra");
	private static List<String> nacionalidades = Arrays.asList("japones", "ingles", "español", "ucraniano", "noruego");

	@Override
	public Individuo generarRandom() {
		Persona persona = new Persona();
		String ubicacionCasaIndividuo = UTgeNesUtils.alguno(ubicacionesCasa.toArray()).toString();
		String colorCasaIndividuo =UTgeNesUtils.alguno(coloresCasa.toArray()).toString();
		String marcaCigarrilloIndividuo = UTgeNesUtils.alguno(marcasCigarrillo.toArray()).toString();
		String bebidaIndividuo = UTgeNesUtils.alguno(bebidas.toArray()).toString();
		String mascotaIndividuo = UTgeNesUtils.alguno(mascotas.toArray()).toString();
		String nacionalidadIndividuo =UTgeNesUtils.alguno(nacionalidades.toArray()).toString();

		persona.setBebida(bebidaIndividuo);
		persona.setColorCasa(colorCasaIndividuo);
		persona.setMarcaCigarrillos(marcaCigarrilloIndividuo);
		persona.setMascota(mascotaIndividuo);
		persona.setUbicacionCasa(ubicacionCasaIndividuo);
		persona.setNacionalidad(nacionalidadIndividuo);
		return persona;
	}

	//devuelve un valor
	@Override
	public double aptitud() {
		
		if (this.x < 0 || this.x > 15) {
			return 0;
		}
		return Math.abs((this.x - 5) / (2 + Math.sin(this.x)));
	}

	//REGLAS----------
	private boolean cumpleRegla2(){
		return this.nacionalidad.equals("ingles") && this.colorCasa.equals("roja");
	}
	private boolean cumpleRegla3(){
		return this.nacionalidad.equals("español") && this.mascota.equals("perro");
	}

	private boolean cumpleRegla4(){
		return this.colorCasa.equals("verde") && this.bebida.equals("cafe");
	}

	private boolean cumpleRegla5(){
		return this.nacionalidad.equals("ucraniano") && this.bebida.equals("te");
	}

	private boolean cumpleRegla6(){
		return true; //La casa verde está justo al lado derecho de la casa color marfil.
	}

	private boolean cumpleRegla7(){
		return this.marcaCigarrillos.equals("the old gold") && this.mascota.equals("caracoles");
	}

	private boolean cumpleRegla8(){
		return this.marcaCigarrillos.equals("kools") && this.colorCasa.equals("amarillo");
	}

	private boolean cumpleRegla9(){
		return this.ubicacionCasa.equals("tercera") && this.bebida.equals("leche");
	}

	private boolean cumpleRegla10(){
		return this.nacionalidad.equals("noruego") && this.ubicacionCasa.equals("primera");
	}

	private boolean cumpleRegla11(){
		return this.marcaCigarrillos.equals("chesterfields"); //vive al lado del vecino que tiene un zorro.
	}

	private boolean cumpleRegla12(){
		return this.marcaCigarrillos.equals("kools"); //&& this.vecinoIzquierda
	}

	@Override
	public String toString() {
		return "x = " + x + " / f(x) = " + this.aptitud();
	}

	public String getUbicacionCasa() {
		return ubicacionCasa;
	}

	public void setUbicacionCasa(String ubicacionCasa) {
		this.ubicacionCasa = ubicacionCasa;
	}

	public String getColorCasa() {
		return colorCasa;
	}

	public void setColorCasa(String colorCasa) {
		this.colorCasa = colorCasa;
	}

	public String getMarcaCigarrillos() {
		return marcaCigarrillos;
	}

	public void setMarcaCigarrillos(String marcaCigarrillos) {
		this.marcaCigarrillos = marcaCigarrillos;
	}

	public String getBebida() {
		return bebida;
	}

	public void setBebida(String bebida) {
		this.bebida = bebida;
	}

	public String getMascota() {
		return mascota;
	}
	public void setMascota(String mascota) {
		this.mascota = mascota;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}


}
