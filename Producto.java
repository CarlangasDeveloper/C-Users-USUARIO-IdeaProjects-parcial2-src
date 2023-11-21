import java.text.NumberFormat;
import java.util.Locale;

public class Producto {
    public String nombre;
    public String descripcion;
    public double precio;
    public int cantidadInventario;

    public Producto(String nombre, String descripcion, double precio, int cantidadInventario) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidadInventario = cantidadInventario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecio() {
        NumberFormat formatoColombiano = NumberFormat.getCurrencyInstance(new Locale("es", "CO"));

        String precioFormateado = formatoColombiano.format(this.precio);
        return precioFormateado;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Precio: " + getPrecio());
        System.out.println("Disponibles: " + cantidadInventario);
    }

    public int getCantidadInventario() {
        return cantidadInventario;
    }

    public void setCantidadInventario(int cantidadInventario) {
        this.cantidadInventario = cantidadInventario;
    }
}
