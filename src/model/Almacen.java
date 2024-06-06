package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Almacen {

    private final List<Producto> listaProd;

    public Almacen() {
        this.listaProd = new ArrayList<>();
    }

    public void cargarProductos() {

        listaProd.add(new Bebida("Coca-Cola Zero", 20, 1.5));
        listaProd.add(new Bebida("Coca-Cola", 18, 1.5));
        listaProd.add(new Shampoo("Shampoo Sedal", 19, 500));
        listaProd.add(new Fruta("Frutillas", 64, "kilo"));

    }

    public void mostrarProductos() {
        for (Producto producto : listaProd) {
            System.out.println(producto);
        }
    }

    public void mostrarProdMinYMax() {
        System.out.println("=============================");
        Collections.sort(listaProd);
        Producto productoMasCaro = listaProd.get(listaProd.size() - 1);
        Producto productoMasBarato = listaProd.get(0);
        System.out.println("Producto más caro: " + productoMasCaro.getNombre());
        System.out.println("Producto más barato: " + productoMasBarato.getNombre());
    }


}
