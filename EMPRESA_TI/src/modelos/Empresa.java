package modelos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Empresa {
    private String nit;
    private String nombre;
    private String direccion;
    private String ciudad;
    private List<Empleado> Listempleados; 

    public Empresa() {
        this.Listempleados = new ArrayList<>();
    }

    public Empresa(String nit, String nombre, String direccion, String ciudad) {
        this.nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.Listempleados = new ArrayList<>();
    }


    // getters y setters

    
    public String getNit() {
        return nit;
    }
    public void setNit(String nit) {
        this.nit = nit;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public List<Empleado> getListempleados() {
        return Listempleados;
    }
    public List<Empleado> getEmpleados() {
        return Listempleados;
    }
    public void setListempleados(List<Empleado> Listempleados) {
        this.Listempleados = Listempleados;
    }

    // constructor
    /*public Empresa(String nit, String nombre, String direccion, String ciudad) {
        this.nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;*/

    //metodo ingresar empresa
    // Método para ingresar datos por consola
    public void ingresarEmpresa(Scanner sc) {// se utiliza el metodo scanner dentro de la funcion
        System.out.print("Ingrese NIT: ");
        this.nit = sc.nextLine();

        System.out.print("Ingrese Nombre: ");
        this.nombre = sc.nextLine();

        System.out.print("Ingrese Dirección: ");
        this.direccion = sc.nextLine();

        System.out.print("Ingrese Ciudad: ");
        this.ciudad = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Empresa [NIT=" + nit + ", Nombre=" + nombre +
               ", Dirección=" + direccion + ", Ciudad=" + ciudad + "]";
    }
    // metodo mostrar empresa en formato de fila de tabla
    public void mostrarEmpresa() {
        System.out.println(String.format("%-10s | %-15s | %-15s | %-10s", nit, nombre, direccion, ciudad));
    }
    //metodo para agregar empleados a la empresa
    public void agregarEmpleado(Empleado empleado) {
        if (empleado.getEmpresa() != null) {
            System.out.println("⚠️ Este empleado ya está asignado a otra empresa.");
            return;
        }
        empleado.setEmpresa(this);
        this.Listempleados.add(empleado);
    }
    
    //metodo para mostrar empleados de la empresa
    public void mostrarEmpleados() {
        if (Listempleados == null || Listempleados.isEmpty()) {
            System.out.println("No hay empleados registrados en esta empresa.");
        } else {
            System.out.println("\n--- Empleados de " + nombre + " ---");
            System.out.println("-----------+-----------+-----------");
            System.out.println(" Documento | Nombre    | Sueldo/hora");
            System.out.println("-----------+-----------+-----------");
            for (Empleado emp : Listempleados) {
                System.out.printf(" %-9s | %-9s | %.2f%n", 
                    emp.getDocumento() != null ? emp.getDocumento() : "",
                    emp.getNombre() != null ? emp.getNombre() : "",
                    emp.getSueldoHora());
            }
            System.out.println("-----------+-----------+-----------");
        }
    }
}

    

