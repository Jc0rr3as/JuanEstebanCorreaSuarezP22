import java.util.Scanner;
public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        metodos m = new metodos();
        boolean continuar = true;
        cine[] ventas = null;
        while(continuar) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Registrar ventas");
            System.out.println("2. Consultar ventas por película");
            System.out.println("3. Salir");
            int opcion = sc.nextInt();
            sc.nextLine(); 
            switch (opcion) {
                case 1:
                    ventas = m.registrarDatos();
                    break;
                case 2:
                    m.ventasPorPelicula(ventas);
                    break;
                case 3:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción inválida, intente de nuevo.");
            }
        }
        sc.close();
    }
    
}
