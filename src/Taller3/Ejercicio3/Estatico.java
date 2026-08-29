package Taller3.Ejercicio3;

public class Estatico {

    /*
    private int contador = 0;

    public static void incrementar(){
        contador = contador + 1;
    }
    */

    private static int contador = 0;

    public static void incrementar(){
        contador = contador + 1;
    }

    public static void main(String[] args){
        Estatico.incrementar();
        System.out.println("Contador: " + Estatico.contador);
    }

}
