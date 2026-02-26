package modelos;

public class Empleado extends Empresa {
    private String documento;
    private String nombre;
    private double sueldoHora;


    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getSueldoHora() {
        return sueldoHora;
    }
    public void setSueldoHora(double sueldoHora) {
        this.sueldoHora = sueldoHora;
    }
    
    // constructor
    public Empleado(String nit, String nombreEmpresa, String direccion, String ciudad, String documento, String nombreEmpleado, double sueldoHora) {
        super(nit, nombreEmpresa, direccion, ciudad);
        this.documento = documento;
        this.nombre = nombreEmpleado;
        this.sueldoHora = sueldoHora;
    }




}
