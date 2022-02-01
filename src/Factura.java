import java.util.Arrays;

public class Factura {
    private int numero;
    private Producto productos[];


    public Factura(int cantProductos) {
        productos = new Producto[cantProductos];
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void ingresarDatos(Producto p) {
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] == null) {
                productos[i] = new Producto();
                productos[i].setCodigo(p.getCodigo());
                productos[i].setPrecio(p.getPrecio());
                break;
            }
        }
    }

    public void modificar(int posicion, Producto p1) {

            if (productos[posicion]!=null) {
                productos[posicion].setCodigo((p1.getCodigo()));
                productos[posicion].setPrecio((p1.getPrecio()));
            }
    }

    public String toString() {
        return "Factura" +
                " numero=" + this.numero +
                "\nproductos" + "\n"+ Arrays.toString(productos);
    }
}
