import java.util.Arrays;

public class Factura {
    private int numero;
    private Producto productos[];


    public Factura(int cantProductos) {
        productos = new Producto[cantProductos];
        this.numero = numero;
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

    public void modificar(Producto p, Producto p1) {
        for (int i = 1; i < productos.length; i++) {
            if (productos[i] == null) {
                productos[i] = new Producto();
                productos[1].setCodigo(p.getCodigo());
                productos[1].setPrecio(p.getPrecio());
                break;
            }
        }
        String num1 = p1.getCodigo();
        int num2 = p1.getPrecio();
        boolean modificado = false;
        for (int i = 1; i < productos.length; i++) {
            productos[1].setCodigo(p.getCodigo());
            productos[1].setPrecio(p.getPrecio());
            if (productos[i].getCodigo() != num1 && productos[1].getPrecio() != num2) {
                productos[1].setCodigo((num1));
                productos[1].setPrecio((num2));
                modificado = true;
                break;
            }
        }
    }

    public String toString() {
        return "Factura" +
                " numero=" + this.numero +
                "\nproductos" + "\n"+ Arrays.toString(productos);
    }
}
