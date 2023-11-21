public class Pedido extends  Cliente {
    public String productoSolicitado;
    public int cantidadProductoSolicitado;

    public Pedido(String nombre, String direccion, String listaPedidos, String productoSolicitado, int cantidadProductoSolicitado) {
        super(nombre, direccion, listaPedidos);
        this.productoSolicitado = productoSolicitado;
        this.cantidadProductoSolicitado = cantidadProductoSolicitado;
    }

    public String getProductoSolicitado() {
        return productoSolicitado;
    }

    public void setProductoSolicitado(String productoSolicitado) {
        this.productoSolicitado = productoSolicitado;
    }

    public int getCantidadProductoSolicitado() {
        return cantidadProductoSolicitado;
    }

    public void setCantidadProductoSolicitado(int cantidadProductoSolicitado) {
        this.cantidadProductoSolicitado = cantidadProductoSolicitado;
    }
}
