package main.java.ar.edu.utn.frba.ia.ag.TP1C;

import main.java.ar.edu.utn.frba.ia.ag.Individuo;
import main.java.ar.edu.utn.frba.ia.ag.UTgeNesUtils;

import java.util.Arrays;
import java.util.List;

public class Vecino {
    private String ubicacionCasa;
    private String colorCasa;
    private String marcaCigarrillos;
    private String bebida;
    private String mascota;
    private String nacionalidad;


    private static List<String> ubicacionesCasa = Arrays.asList("primera", "segunda", "tercera", "cuarta", "quinta");
    private static List<String> coloresCasa = Arrays.asList("azul", "amarilla", "verde", "marfil", "roja");
    private static List<String> marcasCigarrillo = Arrays.asList("parliaments" , "chesterfields", "kools","lucky strike",  "the old gold");
    private static List<String> bebidas = Arrays.asList("agua", "jugo de naranja", "leche", "te", "cafe");
    private static List<String> mascotas = Arrays.asList("perro", "caracoles", "zorro", "caballo", "cebra");
    private static List<String> nacionalidades = Arrays.asList("japones", "ingles", "español", "ucraniano", "noruego");


    public Vecino () {
        String ubicacionCasaIndividuo = UTgeNesUtils.alguno(ubicacionesCasa.toArray()).toString();
        String colorCasaIndividuo =UTgeNesUtils.alguno(coloresCasa.toArray()).toString();
        String marcaCigarrilloIndividuo = UTgeNesUtils.alguno(marcasCigarrillo.toArray()).toString();
        String bebidaIndividuo = UTgeNesUtils.alguno(bebidas.toArray()).toString();
        String mascotaIndividuo = UTgeNesUtils.alguno(mascotas.toArray()).toString();
        String nacionalidadIndividuo =UTgeNesUtils.alguno(nacionalidades.toArray()).toString();

        this.setBebida(bebidaIndividuo);
        this.setColorCasa(colorCasaIndividuo);
        this.setMarcaCigarrillos(marcaCigarrilloIndividuo);
        this.setMascota(mascotaIndividuo);
        this.setUbicacionCasa(ubicacionCasaIndividuo);
        this.setNacionalidad(nacionalidadIndividuo);
    }

    public String toString(){
        return "Vecino ["+this.getNacionalidad()+"," +
                " "+this.getColorCasa()+"," +
                " "+this.getMascota()+"," +
                " "+this.getMarcaCigarrillos()+"," +
                " "+this.getUbicacionCasa()+" ," +
                " "+this.getBebida()+"]";
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
