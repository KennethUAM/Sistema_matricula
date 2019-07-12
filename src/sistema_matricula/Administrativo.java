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
public class Administrativo extends Persona {

    private int num_planilla;
    private String num_usuario;
    private String contrasena;
    private List<Persona> administrativo = new ArrayList<Persona>();

    public Administrativo() {
    }

    public Administrativo(int num_planilla, String num_usuario, String contrasena, String nombre, String primero_apellido, String segundo_apellido, int cedula, int edad, boolean sexo) {
        super(nombre, primero_apellido, segundo_apellido, cedula, edad, sexo);
        this.num_planilla = num_planilla;
        this.num_usuario = num_usuario;
        this.contrasena = contrasena;
    }

}
