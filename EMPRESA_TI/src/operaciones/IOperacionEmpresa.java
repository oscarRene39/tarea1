package operaciones;

import java.util.List;
import modelos.Empresa;

public interface IOperacionEmpresa {
    Empresa registrarEmpresa(String nit, String nombre, String direccion, String ciudad);
    List<Empresa> listarEmpresas();
    void mostrarEmpresas();
    void mostrarEmpresas(List<Empresa> empresas);
}
