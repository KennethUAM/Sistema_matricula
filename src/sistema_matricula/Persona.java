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
public class Persona {

    private String nombre;
    private String primero_apellido;
    private String segundo_apellido;
    private int cedula;
    private int edad;
    private boolean sexo;
    //private List<Estudiante> estudiantes = new ArrayList<Estudiante>();

    public Persona() {
    }

    public Persona(String nombre, String primero_apellido, String segundo_apellido, int cedula, int edad, boolean sexo) {
        this.nombre = nombre;
        this.primero_apellido = primero_apellido;
        this.segundo_apellido = segundo_apellido;
        this.cedula = cedula;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimero_apellido() {
        return primero_apellido;
    }

    public void setPrimero_apellido(String primero_apellido) {
        this.primero_apellido = primero_apellido;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

}
