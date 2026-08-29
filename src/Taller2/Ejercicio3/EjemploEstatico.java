package Taller2.Ejercicio3;

public class EjemploEstatico {

    private String mensaje = "Ejercicio de ejemplo";

    public static void mostrarMensaje() {
        System.out.println(this.mensaje);
    }
}
