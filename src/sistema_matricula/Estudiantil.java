/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_matricula;

import java.util.ArrayList;
import java.util.List;
import Roles_usuario.Rol;
import Roles_usuario.Usuario;
import Mensajeria.Mensajes;

/**
 *
 * @author Kenneth
 */
public class Estudiantil extends Persona {

    private List<Persona> estudiantes = new ArrayList<Persona>();
    private double promedio;
    private int nota1, nota2, nota3;
    private String mensaje;

    public Estudiantil() {
    }

    public Estudiantil(double promedio, int nota1, int nota2, int nota3, String nombre, String primero_apellido, String segundo_apellido, int cedula, int edad, boolean sexo) {
        super(nombre, primero_apellido, segundo_apellido, cedula, edad, sexo);
        this.promedio = promedio;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public List<Persona> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Persona> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public void agregarEstudiante(Persona estudiante, Usuario usuario) {
        if (this.rolEsperado(Rol.getAdministrativo(), usuario)) {

            this.estudiantes.add(estudiante);
            this.mensaje = Mensajes.matricular_estudiante;

        } else {

            this.mensaje = Mensajes.matricular_estudiante_fallido;

        }

    }

    protected boolean rolEsperado(String rolEsperado, Usuario usuario) {
        Rol rolUsuario = usuario.getRol();
        String nombreRol = rolUsuario.getNombre();
        return nombreRol.equals(rolEsperado);
    }

}
