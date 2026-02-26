package operaciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import modelos.Empresa;

public class OperacionEmpresa implements IOperacionEmpresa {
	private final List<Empresa> empresas;

	public OperacionEmpresa() {
		this.empresas = new ArrayList<>();
	}

	@Override
	public Empresa registrarEmpresa(String nit, String nombre, String direccion, String ciudad) {
		Empresa empresa = new Empresa(nit, nombre, direccion, ciudad);
		empresas.add(empresa);
		return empresa;
	}

	@Override
	public List<Empresa> listarEmpresas() {
		return Collections.unmodifiableList(empresas);
	}

}
