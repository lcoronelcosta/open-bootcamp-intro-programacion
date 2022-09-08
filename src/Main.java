import clases.Coche;

import static java.lang.System.out;

public class Main {

    public static void main(String args[]){
        System.out.println("***Primera Parte***");
        int suma = sumar(1,2,3);
        System.out.println("La suma de los 3 numeros es: "+suma);
        System.out.println("***Segunda Parte***");
        Coche coche = new Coche(2);
        coche.addPuertas();
        System.out.println("El coche actualmente tiene "+coche.getPuertas()+" puertas");
    }

    private static int sumar(int a, int b, int c){
        return a+b+c;
    }
}
