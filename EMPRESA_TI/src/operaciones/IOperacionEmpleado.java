package operaciones;

import java.util.List;
import modelos.Empresa;

public interface IOperacionEmpleado {
    void mostrarEmpleados(List<Empresa> empresas);
    void buscarEmpleadoPorDocumento(List<Empresa> empresas, String documento);
}
