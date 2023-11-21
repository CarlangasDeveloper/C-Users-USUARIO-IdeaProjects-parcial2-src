public class Cliente {
    public String nombre;
    private String direccion;
    public String listaPedidos;

    public Cliente(String nombre, String direccion, String listaPedidos) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.listaPedidos = listaPedidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(String listaPedidos) {
        this.listaPedidos = listaPedidos;
    }
}
