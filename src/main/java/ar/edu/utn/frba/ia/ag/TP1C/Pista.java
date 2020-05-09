package main.java.ar.edu.utn.frba.ia.ag.TP1C;

public class Pista {
    private Persona persona;

    public Pista(Persona persona){
        this.persona = persona;
    }

    public boolean seCumpleLaPista(int numeroPista){
        switch (numeroPista){
            case 2:
                return this.persona.getNacionalidad().equals("ingles") && this.persona.getNacionalidad().equals("roja");
            case 3:
                return this.persona.getNacionalidad().equals("español") && this.persona.getMascota().equals("perro");
            case 4:
                return this.persona.getColorCasa().equals("verde") && this.persona.getBebida().equals("cafe");
            case 5:
                return this.persona.getNacionalidad().equals("ucraniano") && this.persona.getBebida().equals("te");
            case 6:
                return this.persona.getColorCasa().equals("verde")  && (this.persona.getVecinoDerecha().getColorCasa().equals("marfil") || this.persona.getVecinoIzquierda().getColorCasa().equals("marfil"));
            case 7:
                return this.persona.getMarcaCigarrillos().equals("the old gold") && this.persona.getMascota().equals("caracoles");
            case 8:
                return this.persona.getMarcaCigarrillos().equals("kools") && this.persona.getColorCasa().equals("amarillo");
            case 9:
                return this.persona.getUbicacionCasa().equals("tercera") && this.persona.getBebida().equals("leche");
            case 10:
                return this.persona.getNacionalidad().equals("noruego") && this.persona.getUbicacionCasa().equals("primera");
            case 11:
                return this.persona.getMarcaCigarrillos().equals("chesterfields") && (this.persona.getVecinoDerecha().getMascota().equals("caballo") || this.persona.getVecinoIzquierda().getMascota().equals("caballo")); //vive al lado del vecino que tiene un zorro.
            case 12:
                return this.persona.getMarcaCigarrillos().equals("kools"); //&& this.vecinoIzquierda
            case 13:
                return this.persona.getMarcaCigarrillos().equals("lucky strike") && this.persona.getBebida().equals("jugo de naranja");
            case 14:
                return this.persona.getMarcaCigarrillos().equals("parliments") && this.persona.getNacionalidad().equals("japones");
            case 15:
                return this.persona.getNacionalidad().equals("noruego") && (this.persona.getVecinoDerecha().getColorCasa().equals("azul") || this.persona.getVecinoIzquierda().getColorCasa().equals("azul"));
            default:
                return false;
        }

    }
}
