package modelos;

import java.util.Scanner;

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
    
    public Empleado() {
    }

    // constructor
    public Empleado(String nit, String nombreEmpresa, String direccion, String ciudad, String documento, String nombreEmpleado, double sueldoHora) {
        setNit(nit);
        setNombre(nombreEmpresa);
        setDireccion(direccion);
        setCiudad(ciudad);
        this.documento = documento;
        this.nombre = nombreEmpleado;
        this.sueldoHora = sueldoHora;
    }
    // metodo ingresar empleado
    public void ingresarEmpleado(Scanner sc) {
        System.out.print("Ingrese documento: ");
        this.documento = sc.nextLine();
        System.out.print("Ingrese nombre: ");
        this.nombre = sc.nextLine();
        System.out.print("Ingrese sueldo por hora: ");
        this.sueldoHora = sc.nextDouble();
    }



}
