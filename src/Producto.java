public class Producto {
    private String codigo;
    private int precio;

    public Producto() {
    }

    public Producto(String codigo, int precio) {
        this.codigo = codigo;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String toString() {
        return "codigo= " + codigo +
                ", precio= " + precio;
    }
}
