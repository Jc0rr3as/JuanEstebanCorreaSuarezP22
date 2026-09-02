import java.util.Scanner;
public class metodos {
    Scanner sc = new Scanner(System.in);
    public cine[] registrarDatos() {
        System.out.println("Ingrese cuantas ventas va a registrar: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        cine[] ventas = new cine[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el nombre de la película: ");
            String nombre = sc.nextLine();
            System.out.println("Ingrese cuantas boletas vendió: ");
            int boletasVendidas = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el total pagado: ");
            double precio = sc.nextDouble();
            sc.nextLine();
            ventas[i] = new cine(nombre, boletasVendidas, precio);
        }
        return ventas;
    }
    public void ventasPorPelicula(cine[] ventas) {
        if (ventas != null) {
            System.out.println("Ingrese el nombre de la película de la cual desea conocer las ventas: ");
        String nombrePelicula = sc.nextLine();
        Double totalVentas = 0.0;
        int totalBoletas = 0;
        for (int i = 0; i < ventas.length; i++) {
            if (ventas[i].getNombre().equalsIgnoreCase(nombrePelicula)) {
                totalVentas = ventas[i].getPrecio() + totalVentas;
                totalBoletas = ventas[i].getBoletasVendidas() + totalBoletas;
            }
        }
        System.out.println("El total de boletas vendidas de la película " + nombrePelicula + " es: " + totalBoletas);
        System.out.println("El total de ventas de la película " + nombrePelicula + " es: " + totalVentas);
        }
        else {
            System.out.println("No se han registrado ventas aún.");
        }
    }
}
