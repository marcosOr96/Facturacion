public class Main {
    public static void main(String[] args) {
        Consola sc = new Consola();

        Factura f1 = new Factura(sc.leerEntero("ingrese numero de productos:"));
        f1.setNumero(sc.leerEntero("Numero:"));
        Producto p = new Producto();
        Producto p1 = new Producto();

        for (int i = 0; i < f1.getProductos().length; i++) {
            p.setCodigo(sc.leerCadena("Codigo:"));
            p.setPrecio(sc.leerEntero("Precio"));
            f1.ingresarDatos(p);
        }

        System.out.println(f1.toString());

        for (int i = 1; i < f1.getProductos().length; i++) {
            p1.setCodigo(sc.leerCadena("Codigo:"));
            p1.setPrecio(sc.leerEntero("Precio"));
            f1.modificar(p,p1);
            break;
        }
        System.out.println(f1.toString());
    }
}
