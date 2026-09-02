public class cine {
    private String nombre;
    private int boletasVendidas;
    private double precio;

    public cine(String nombre, int boletasVendidas, double precio) {
        this.nombre = nombre;
        this.boletasVendidas = boletasVendidas;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getBoletasVendidas() {
        return boletasVendidas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setBoletasVendidas(int boletasVendidas) {
        this.boletasVendidas = boletasVendidas;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}