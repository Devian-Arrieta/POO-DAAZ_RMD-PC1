package Taller3.Ejercicio1;

public class Coche {
    private String marca;
    private String modelo;
    static int contadorCoches = 0;


    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++;
    }

    public static void mostrarTotalCoches(){
        System.out.println("Coches: " + contadorCoches);
    }


}
