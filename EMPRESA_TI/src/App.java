import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelos.Empresa;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Empresa> listaEmpresas = new ArrayList<>(); // Lista para almacenar las empresas registradas
        int opcion;

        do {
            System.out.println("\n--- MENÚ DE EMPRESAS ---");
            System.out.println("1. Ingresar empresa");
            System.out.println("2. Mostrar empresas registradas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    Empresa empresa = new Empresa();
                    empresa.ingresarEmpresa(); /// usando el metodo desde la clase empresa                    listaEmpresas.add(empresa);
                    System.out.println("✅ Empresa registrada correctamente.");
                    break;

                case 2:
                    System.out.println("\n📋 Empresas registradas:");
                    if (listaEmpresas.isEmpty()) {
                        System.out.println("No hay empresas registradas.");
                    } else {
                        for (Empresa e : listaEmpresas) {
                            System.out.println(e);
                        }
                    }
                    break;

                case 3:
                    System.out.println("👋 Saliendo del programa...");
                    break;

                default:
                    System.out.println("⚠️ Opción inválida, intente nuevamente.");
            }
        } while (opcion != 3);
    }



    
}
