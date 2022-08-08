package ar.charlycimino.ejemplos.ejercicioIV;

import java.util.ArrayList;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Empresa {

    private ArrayList<Empleado> empleados;

    public Empresa() {
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado e) {
        this.empleados.add(e);
    }

    public void mostrarSalarios() {
        for (Empleado emp : empleados) {
            System.out.println(emp.nombreCompleto() + ": $" + emp.getSalario());
        }
    }

    public Empleado empleadoConMasClientes() {
        int max = -1;
        Empleado elMayor = null;
        for (Empleado e : empleados) {
            if (e instanceof EmpleadoAComision) {
                EmpleadoAComision eac = (EmpleadoAComision) e;
                int cant = eac.getCantClientesCaptados();
                if (cant > max) {
                    max = cant;
                    elMayor = eac;
                }
            }
        }
        return elMayor;
    }
}
