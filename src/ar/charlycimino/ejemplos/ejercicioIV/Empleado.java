package ar.charlycimino.ejemplos.ejercicioIV;

import java.time.LocalDate;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public abstract class Empleado {

    private String DNI;
    private String nombre;
    private String apellido;
    private int anioIngreso;

    public Empleado(String DNI, String nombre, String apellido, int anioIngreso) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioIngreso = anioIngreso;
    }

    public int antiguedadEnAnios() {
        int anioActual = LocalDate.now().getYear();
        return anioActual - anioIngreso;
    }

    public String nombreCompleto() {
        return nombre + " " + apellido;
    }

    public abstract double getSalario();

}
