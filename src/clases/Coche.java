package clases;

public class Coche {

    private int puertas;

    public Coche(int numPuertas){
        this.setPuertas(numPuertas);
    }

    public void addPuertas(){
        this.puertas++;
    }

    public int getPuertas() {
        return this.puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
}
