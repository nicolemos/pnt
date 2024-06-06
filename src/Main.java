import model.*;

public class Main {
    public static void main(String[] args) {


        Almacen almacen = new Almacen();

        //Los productos se agregan en Almacén - Preferí encapsularlo para dejar el Main más limpio
        almacen.cargarProductos();

        almacen.mostrarProductos();

        almacen.mostrarProdMinYMax();

    }
}