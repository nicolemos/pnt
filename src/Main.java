import model.*;

public class Main {
    public static void main(String[] args) {


        Almacen almacen = new Almacen();

        almacen.cargarProductos();

        almacen.mostrarProductos();

        almacen.mostrarProdMinYMax();

    }
}