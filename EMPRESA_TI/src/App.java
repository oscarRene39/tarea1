import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelos.Empleado;
import modelos.Empresa;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Empresa> listaEmp = new ArrayList<>(); // Lista para almacenar las empresas registradas
        int opcion;

        do {
            System.out.println("\n--- MENÚ DE EMPRESAS ---");
            System.out.println("1. Ingresar empresa");
            System.out.println("2. Mostrar empresas registradas");
            System.out.println("3. Ingresar empleado");
            System.out.println("4. Ver empleados");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    //instancia la clase en un objeto para poder usar sus metodos y atributos
                    Empresa empresa1 = new Empresa();
                    empresa1.ingresarEmpresa(sc); // Pasar el Scanner al método
                    listaEmp.add(empresa1);
                    System.out.println("*---- Empresa registrada correctamente.---*");
                    break;

                case 2:
                    // Mostrar todas las empresas registradas
                    operaciones.OperacionEmpresa operacion = new operaciones.OperacionEmpresa();
                    operacion.mostrarEmpresas(listaEmp);  // Pasar la lista de empresas al método   
                    /*System.out.println("\n📋 Empresas registradas:");
                    if (listaEmp.isEmpty()) {
                        System.out.println("No hay empresas registradas.");
                    } else {
                        System.out.println("-----------+---------------+---------------+----------");
                        System.out.println(" NIT       | Nombre        | Dirección     | Ciudad");
                        System.out.println("-----------+---------------+---------------+----------");
                        for (int i = 0; i < listaEmp.size(); i++) {
                            Empresa e = listaEmp.get(i);
                            System.out.println("Empresa " + (i + 1) + ":");
                            e.mostrarEmpresa();
                        }
                        System.out.println("-----------+----------+----------+----------");
                        System.out.println("Total empresas registradas: " + listaEmp.size());
                     */
                        
                    break;

                case 3:
                    if (listaEmp.isEmpty()) {
                        System.out.println("⚠️ Primero debe registrar una empresa.");
                        break;
                    }
                    Empleado emplea1 = new Empleado();
                    emplea1.ingresarEmpleado(sc);
                    
                    // Verificar si el empleado ya está registrado en alguna empresa
                    boolean empleadoExiste = false;
                    for (Empresa emp : listaEmp) {
                        for (Empleado empl : emp.getEmpleados()) {
                            if (empl.getDocumento().equals(emplea1.getDocumento())) {
                                empleadoExiste = true;
                                System.out.println("⚠️ Este empleado ya está registrado en " + emp.getNombre());
                                break;
                            }
                        }
                        if (empleadoExiste) break;
                    }
                    
                    if (!empleadoExiste) {
                        System.out.println("\n--- Seleccione la empresa para el empleado ---");
                        for (int i = 0; i < listaEmp.size(); i++) {
                            System.out.println((i + 1) + ". " + listaEmp.get(i).getNombre() + " (NIT: " + listaEmp.get(i).getNit() + ")");
                        }
                        System.out.print("Seleccione el número de la empresa: ");
                        int numEmpresa = sc.nextInt();
                        sc.nextLine(); // limpiar buffer
                        
                        if (numEmpresa > 0 && numEmpresa <= listaEmp.size()) {
                            Empresa empresaSeleccionada = listaEmp.get(numEmpresa - 1);
                            empresaSeleccionada.agregarEmpleado(emplea1);
                            System.out.println("*---- Empleado registrado correctamente en " + empresaSeleccionada.getNombre() + ".---*");
                        } else {
                            System.out.println("⚠️ Opción de empresa inválida.");
                        }
                    }
                    break;

                case 4:
                    if (listaEmp.isEmpty()) {
                        System.out.println("⚠️ No hay empresas registradas.");
                        break;
                    }
                    operaciones.OperacionEmpleado operacionEmpleado = new operaciones.OperacionEmpleado();
                    operacionEmpleado.mostrarEmpleados(listaEmp);
                    break;

                case 5:
                    System.out.println("👋 Saliendo del programa...");
                    break;

                default:
                    System.out.println("⚠️ Opción inválida, intente nuevamente.");
            }
        } while (opcion != 5);  
    }



    
}
