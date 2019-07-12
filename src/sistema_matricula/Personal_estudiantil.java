/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_matricula;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kenneth
 */
public class Personal_estudiantil extends Persona {

    private List<Persona> estudiantes = new ArrayList<Persona>();
    private double promedio;
    private int nota1, nota2, nota3;

    public Personal_estudiantil() {
    }

    public Personal_estudiantil(double promedio, int nota1, int nota2, int nota3, String nombre, String primero_apellido, String segundo_apellido, int cedula, int edad, boolean sexo) {
        super(nombre, primero_apellido, segundo_apellido, cedula, edad, sexo);
        this.promedio = promedio;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

}
