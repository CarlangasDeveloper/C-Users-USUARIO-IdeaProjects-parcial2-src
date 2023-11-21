public class Telefono extends Producto {
    public String marca;
    public int capacidad;
    public boolean nuevo;
    public String color;
    public double tamano;

    public Telefono(String nombre, String descripcion, double precio, int cantidadInventario, String marca, int capacidad, boolean nuevo, String color, double tamano) {
        super(nombre, descripcion, precio, cantidadInventario);
        this.marca = marca;
        this.capacidad = capacidad;
        this.nuevo = nuevo;
        this.color = color;
        this.tamano = tamano;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Marca: " + marca);
        System.out.println("Capacidad: " + capacidad + "GB");
        System.out.println("Categoria: " + nuevo);
        System.out.println("Color: " + color);
        System.out.println("Tamaño: " + tamano);
        if (nuevo){
            System.out.println("Categoria: Nuevo");
        } else {
            System.out.println("Categoria: Usado");
        }
    }
}
