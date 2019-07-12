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

    public int getNum_planilla() {
        return num_planilla;
    }

    public void setNum_planilla(int num_planilla) {
        this.num_planilla = num_planilla;
    }

    public String getNum_usuario() {
        return num_usuario;
    }

    public void setNum_usuario(String num_usuario) {
        this.num_usuario = num_usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public List<Persona> getAdministrativo() {
        return administrativo;
    }

    public void setAdministrativo(List<Persona> administrativo) {
        this.administrativo = administrativo;
    }
    
    
    
    

}
