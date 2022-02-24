package principal;

import clases.Bicicleta;
import java.util.Scanner;

/**
 * @author Lautaro Toloza
 */
public class Principal {

    public static void main(String[] args) {
        /* Crear una clase bicicleta que tenga el modelo, numero de rodado y el pecio.
           crear una lista de bicicletas y mostrar la lista con todos los elementos de la bicicleta.
         */

        int cantidad = cargarNumero("Ingrese la cantidad de bicis que tenga su lista: ");
        Bicicleta[] listaBici = new Bicicleta[cantidad];

//      Muestra..
        cargarLista(listaBici);
        System.out.println("\nMuestra de la lista cargada..");
        muestraLista(listaBici);

    }

    public static String cargarTexto(String texto) {
        Scanner leer = new Scanner(System.in);
        System.out.print(texto);
        String nombre = leer.nextLine();
        return nombre;
    }

    public static int cargarNumero(String texto) {
        Scanner leer = new Scanner(System.in);
        System.out.print(texto);
        int numero = leer.nextInt();
        return numero;
    }

    public static double cargarPrecio(String texto) {
        Scanner leer = new Scanner(System.in);
        System.out.print(texto);
        double precio = leer.nextDouble();
        return precio;
    }

    public static Bicicleta cargarBici() {
        String modelo = cargarTexto("Ingrese el modelo de la bicicleta: ");
        int rodado = cargarNumero("Ingrese el rodado de la bicicleta: ");
        double precio = cargarPrecio("Ingrese el precio de la bicicleta: ");
        Bicicleta b1 = new Bicicleta(modelo, rodado, precio);
        return b1;
    }

    public static void cargarLista(Bicicleta[] b1) {
        for (int i = 0; i < b1.length; i++) {
            b1[i] = cargarBici();
        }
    }

    public static void muestraLista(Bicicleta[] b1) {
        for (int i = 0; i < b1.length; i++) {
            System.out.println(b1[i].toString());
        }

    }
}
