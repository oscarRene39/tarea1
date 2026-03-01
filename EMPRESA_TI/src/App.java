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
            System.out.println("4. Salir");
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
                    System.out.println("\n📋 Empresas registradas:");
                    if (listaEmp.isEmpty()) {
                        System.out.println("No hay empresas registradas.");
                    } else {
                        System.out.println("-----------+---------------+---------------+----------");
                        System.out.println(" NIT       | Nombre        | Dirección     | Ciudad");
                        System.out.println("-----------+---------------+---------------+----------");
                        for (Empresa e : listaEmp) {
                            e.mostrarEmpresa();
                        }
                        System.out.println("-----------+----------+----------+----------");
                        System.out.println("Total empresas registradas: " + listaEmp.size());
                    }
                    break;

                case 3:
                    if (listaEmp.isEmpty()) {
                        System.out.println("⚠️ Primero debe registrar una empresa.");
                        break;
                    }
                    Empleado emplea1 = new Empleado();
                    emplea1.ingresarEmpleado(sc);
                    Empresa ultimaEmpresa = new Empresa();
                    ultimaEmpresa.agregarEmpleado(emplea1); // Agregar el empleado a la empresa
                    System.out.println("*---- Empleado registrado correctamente.---*");
                    break;

                case 4:
                    System.out.println("👋 Saliendo del programa...");
                    break;

                default:
                    System.out.println("⚠️ Opción inválida, intente nuevamente.");
            }
        } while (opcion != 4);  
    }



    
}
