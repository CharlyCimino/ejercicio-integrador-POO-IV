package empleados;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class EmpleadoAComision extends Empleado {

    private double salarioMinimo;
    private int cantClientesCaptados;
    private double montoPorCliente;

    public EmpleadoAComision(String DNI, String nombre, String apellido, int anioIngreso, double sm, int ccc, double mpc) {
        super(DNI, nombre, apellido, anioIngreso);
        this.salarioMinimo = sm;
        this.cantClientesCaptados = ccc;
        this.montoPorCliente = mpc;
    }

    public int getCantClientesCaptados() {
        return cantClientesCaptados;
    }

    @Override
    public double getSalario() {
        double sal = montoPorCliente * cantClientesCaptados;
        if (sal < salarioMinimo) {
            sal = salarioMinimo;
        }
        return sal;
    }

}
