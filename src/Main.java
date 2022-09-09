import clases.Coche;

import static java.lang.System.out;

public class Main {

    public static void main(String args[]){
        //Ejercicio Tema 3
        /*System.out.println("***Primera Parte***");
        int suma = sumar(1,2,3);
        System.out.println("La suma de los 3 numeros es: "+suma);
        System.out.println("***Segunda Parte***");
        Coche coche = new Coche(2);
        coche.addPuertas();
        System.out.println("El coche actualmente tiene "+coche.getPuertas()+" puertas");*/

        //Ejercicio Tema 4
        tema4();


    }

    private static int sumar(int a, int b, int c){
        return a+b+c;
    }

    private static void tema4(){
        System.out.println("Sentencias IF-ELSE IF-ELSE");
        int numeroIf = 0;
        if(numeroIf > 0){
            System.out.println("La variable numeroIf:"+numeroIf+" es positiva");
        } else if (numeroIf < 0) {
            System.out.println("La variable numeroIf:"+numeroIf+" es negativa");
        }else{
            System.out.println("La variable numeroIf:"+numeroIf+" es cero");
        }

        System.out.println("Sentencias WHILE");
        int numeroWhile = 1;
        while(numeroWhile < 3){
            numeroWhile++;
            System.out.println("El valor de la variable numeroWhile es : "+numeroWhile);
        }

        System.out.println("Sentencias DOWHILE");
        int numeroDoWhile = 2;
        do{
            numeroDoWhile++;
            System.out.println("La variable numeroDoWhile es: " + numeroDoWhile);
        }while(numeroDoWhile < 2);

        System.out.println("Sentencias FOR");
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("La variable numeroFor es : " + numeroFor);
        }

        System.out.println("Sentencias SWITCH");
        String estacion = "verano";
        switch(estacion) {
            case "verano":
                System.out.println("Estamos en verano");
                break;
            case "invierno":
                System.out.println("Estamos en invierno");
                break;
            case "primavera":
                System.out.println("Estamos en primavera");
                break;
            case "otoño":
                System.out.println("Estamos en otoño");
                break;
            default:
                System.out.println("Nombre de estacion no valida");
        }

    }
}
