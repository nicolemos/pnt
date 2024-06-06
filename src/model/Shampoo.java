package model;

public class Shampoo extends Producto{

    private int contenido;

    public Shampoo(String nombre, int precio, int contenido) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    public int getContenido(){
        return contenido;
    }

    @Override
    public String toString() {
        String div = " /// ";
        return "Nombre: " + super.getNombre() + div +
                "Contenido: " + getContenido() + "ml" + div +
                "Precio: $" + super.getPrecio();
    }
}
