package Taller2.Ejercicio3;

public class EjemploEstatico {

    private String mensaje = "Ejercicio de ejemplo";

    public void mostrarMensaje() { // solo se elimino static para poder acceder al metodo
        System.out.println(this.mensaje);
    }
}
