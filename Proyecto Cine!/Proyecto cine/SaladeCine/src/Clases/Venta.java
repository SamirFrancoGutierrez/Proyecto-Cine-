
package Clases;

public class Venta {
    private int id;
    private int dni;
    private String apellido;
    private String cliente;
    private String categoriapeli;
    private String nompeli;
    private double tpago;
    private String fecha;
 public Venta() {
    }
    public Venta(int id, int dni, String apellido, String cliente, String categoriapeli, String nompeli, double tpago, String fecha) {
        this.id = id;
        this.dni = dni;
        this.apellido = apellido;
        this.cliente = cliente;
        this.categoriapeli = categoriapeli;
        this.nompeli = nompeli;
        this.tpago = tpago;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCategoriapeli() {
        return categoriapeli;
    }

    public void setCategoriapeli(String categoriapeli) {
        this.categoriapeli = categoriapeli;
    }

    public String getNompeli() {
        return nompeli;
    }

    public void setNompeli(String nompeli) {
        this.nompeli = nompeli;
    }

    public double getTpago() {
        return tpago;
    }

    public void setTpago(double tpago) {
        this.tpago = tpago;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

   
    
}
