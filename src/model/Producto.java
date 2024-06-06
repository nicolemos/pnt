package model;

public abstract class  Producto implements Comparable<Producto> {

    private final String nombre;
    private final int precio;

    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    @Override
    public int compareTo(Producto prod) {
        return Double.compare(this.precio, prod.precio);
    }

    @Override
    public abstract String toString();
}
