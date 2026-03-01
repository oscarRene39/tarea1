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

	@Override
	public void mostrarEmpresas() {
		if (empresas.isEmpty()) {
			System.out.println("No hay empresas registradas.");
		} else {
			System.out.println("\n📋 LISTADO DE TODAS LAS EMPRESAS");
			System.out.println("-----------+---------------+---------------+----------");
			System.out.println(" NIT       | Nombre        | Dirección     | Ciudad");
			System.out.println("-----------+---------------+---------------+----------");
			for (Empresa e : empresas) {
				System.out.printf(" %-9s | %-13s | %-13s | %-8s%n",
					e.getNit() != null ? e.getNit() : "",
					e.getNombre() != null ? e.getNombre() : "",
					e.getDireccion() != null ? e.getDireccion() : "",
					e.getCiudad() != null ? e.getCiudad() : "");
			}
			System.out.println("-----------+---------------+---------------+----------");
			System.out.println("Total de empresas: " + empresas.size());
		}
	}

	@Override
	public void mostrarEmpresas(List<Empresa> empresas) {
		if (empresas.isEmpty()) {
			System.out.println("No hay empresas registradas.");
		} else {
			System.out.println("\n📋 LISTADO DE TODAS LAS EMPRESAS");
			System.out.println("-----------+---------------+---------------+----------");
			System.out.println(" NIT       | Nombre        | Dirección     | Ciudad");
			System.out.println("-----------+---------------+---------------+----------");
			for (Empresa e : empresas) {
				System.out.printf(" %-9s | %-13s | %-13s | %-8s%n",
					e.getNit() != null ? e.getNit() : "",
					e.getNombre() != null ? e.getNombre() : "",
					e.getDireccion() != null ? e.getDireccion() : "",
					e.getCiudad() != null ? e.getCiudad() : "");
			}
			System.out.println("-----------+---------------+---------------+----------");
			System.out.println("Total de empresas: " + empresas.size());
		}
	}
}
