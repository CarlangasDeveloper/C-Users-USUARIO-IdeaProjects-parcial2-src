public class Accesorio extends Producto {
    public String marca;
    public int tipo /*Audifonos / mouse / mousepad / teclado / cargador / altavoz / luces led / USB / Discos duros */;
    public String categoria /*pc / celular / tablet*/;
    public String color;
    public boolean nuevo;

    public Accesorio(String nombre, String descripcion, double precio, int cantidadInventario, String marca, int tipo, String categoria, String color, boolean nuevo) {
        super(nombre, descripcion, precio, cantidadInventario);
        this.marca = marca;
        this.tipo = tipo;
        this.categoria = categoria;
        this.color = color;
        this.nuevo = nuevo;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Marca: " + marca);
        System.out.println("Color: " + color);
        System.out.println("Tipo: " + tipo);
        if (nuevo){
            System.out.println("Categoria: Nuevo");
        } else {
            System.out.println("Categoria: Usado");
        }
        System.out.println("Para: " + categoria);
    }
}
