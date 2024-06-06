package model;

public class Fruta extends Producto{

    private String unidad;

    public Fruta(String nombre,int precio, String unidad) {
        super(nombre, precio);
        this.unidad = unidad;
    }

    public String getUnidad() {
        return unidad;
    }

    @Override
    public String toString() {
        String div = " /// ";
        return "Nombre: " + super.getNombre() + div +
                "Precio: $" + super.getPrecio() + div +
                "Unidad de venta: " + getUnidad();
    }
}
