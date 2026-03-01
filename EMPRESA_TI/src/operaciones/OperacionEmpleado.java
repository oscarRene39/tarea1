package operaciones;

import java.util.List;
import modelos.Empleado;
import modelos.Empresa;

public class OperacionEmpleado implements IOperacionEmpleado {

    @Override
    public void mostrarEmpleados(List<Empresa> empresas) {
        boolean tieneEmpleados = false;
        
        for (Empresa empresa : empresas) {
            if (empresa.getEmpleados() != null && !empresa.getEmpleados().isEmpty()) {
                tieneEmpleados = true;
                break;
            }
        }
        
        if (!tieneEmpleados) {
            System.out.println("No hay empleados registrados.");
            return;
        }
        
        System.out.println("\n👷 LISTADO DE TODOS LOS EMPLEADOS");
        for (Empresa empresa : empresas) {
            if (empresa.getEmpleados() != null && !empresa.getEmpleados().isEmpty()) {
                System.out.println("\n--- Empleados de " + empresa.getNombre() + " ---");
                System.out.println("-----------+-----------+-----------");
                System.out.println(" Documento | Nombre    | Sueldo/hora");
                System.out.println("-----------+-----------+-----------");
                for (Empleado emp : empresa.getEmpleados()) {
                    System.out.printf(" %-9s | %-9s | %.2f%n", 
                        emp.getDocumento() != null ? emp.getDocumento() : "",
                        emp.getNombre() != null ? emp.getNombre() : "",
                        emp.getSueldoHora());
                }
                System.out.println("-----------+-----------+-----------");
            }
        }
    }
    @Override
    public void buscarEmpleadoPorDocumento(List<Empresa> empresas, String documento) {
        boolean encontrado = false;
        
        for (Empresa empresa : empresas) {
            if (empresa.getEmpleados() != null) {
                for (Empleado emp : empresa.getEmpleados()) {
                    if (emp.getDocumento() != null && emp.getDocumento().equals(documento)) {
                        System.out.println("\n👷 Empleado encontrado:");
                        System.out.println("Documento: " + emp.getDocumento());
                        System.out.println("Nombre: " + emp.getNombre());
                        System.out.println("Sueldo por hora: " + emp.getSueldoHora());
                        System.out.println("Empresa: " + empresa.getNombre());
                        encontrado = true;
                        break;
                    }
                }
            }
            if (encontrado) break;
        }
        
        if (!encontrado) {
            System.out.println("⚠️ No se encontró ningún empleado con el documento: " + documento);
        }
    }
}