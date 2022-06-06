package empleados;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class EmpleadoSalarioFijo extends Empleado {

    private static final double PORC1 = 0.05;
    private static final double PORC2 = 0.1;
    private static final int ANIO1 = 2;
    private static final int ANIO2 = 5;
    private double sueldoBasico;

    public EmpleadoSalarioFijo(String DNI, String nombre, String apellido, int anioIngreso, double sb) {
        super(DNI, nombre, apellido, anioIngreso);
        this.sueldoBasico = sb;
    }

    private double porcAdicional() {
        int ant = antiguedadEnAnios();
        double porc = 0;
        if (ant > ANIO2) {
            porc = PORC2;
        } else if (ant >= ANIO1) {
            porc = PORC1;
        }
        return porc;
    }

    @Override
    public double getSalario() {
        return sueldoBasico + sueldoBasico * porcAdicional();
    }
}
