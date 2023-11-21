public class Laptop extends Producto {
    public String marca;
    public String procesador;
    public int capacidad;
    public boolean nuevo;
    public String color;
    public boolean tactil;

    public int tamano;

    public Laptop(String nombre, String descripcion, double precio, int cantidadInventario, String marca, String procesador, int capacidad, boolean nuevo, String color, boolean tactil, int tamano) {
        super(nombre, descripcion, precio, cantidadInventario);
        this.marca = marca;
        this.procesador = procesador;
        this.capacidad = capacidad;
        this.nuevo = nuevo;
        this.color = color;
        this.tactil = tactil;
        this.tamano = tamano;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        if (nuevo){
            System.out.println("Categoria: Nuevo");
        } else {
            System.out.println("Categoria: Usado");
        }

        if (tactil) {
            System.out.println("Tactil: SI");
        } else {
            System.out.println("Tactil: NO");
        }
    }
}
