package model;

public class Bebida extends Producto{

    private  double litros;

    public Bebida(String nombre, int precio, double litros) {
        super(nombre, precio);
        this.litros = litros;
    }

    public double getLitros() {
        return litros;
    }

    @Override
    public String toString() {
        String div = " /// ";
        return "Nombre: " + super.getNombre() + div +
                "Litros: " + getLitros() + div +
                "Precio: $" + super.getPrecio();
    }
}
