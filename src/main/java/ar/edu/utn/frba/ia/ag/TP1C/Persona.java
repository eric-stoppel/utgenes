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
	private Vecino vecinoIzquierda;
	private Vecino vecinoDerecha;

	public Persona(){};

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
		persona.setVecinoIzquierda(new Vecino());
		persona.setVecinoDerecha(new Vecino());
		return persona;
	}

	//devuelve un valor
	@Override
	public double aptitud() {
		int valor = 0;
		Pista pista = new Pista(this);
		for(int i = 2 ; i<16; i++){
			if (pista.seCumpleLaPista(i)) valor++;
		}
		return valor;
	}

	@Override
	public String toString() {

		return "Individuo ["+this.getNacionalidad()+"," +
				" "+this.getColorCasa()+"," +
				" "+this.getMascota()+"," +
				" "+this.getMarcaCigarrillos()+"," +
				" "+this.getUbicacionCasa()+" ," +
				" "+this.getBebida()+"] ," +
				" "+this.getVecinoIzquierda().toString()+"," +
				" "+this.getVecinoDerecha().toString()+"" + " / f(x) = " + this.aptitud();
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
	public Vecino getVecinoIzquierda() {
		return vecinoIzquierda;
	}

	public void setVecinoIzquierda(Vecino vecinoIzquierda) {
		this.vecinoIzquierda = vecinoIzquierda;
	}

	public Vecino getVecinoDerecha() {
		return vecinoDerecha;
	}

	public void setVecinoDerecha(Vecino vecinoDerecha) {
		this.vecinoDerecha = vecinoDerecha;
	}


}
