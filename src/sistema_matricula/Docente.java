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
public class Docente extends Persona {

    private String num_usuario_interino;
    private int num_usuario;
    private String contrasena;
    private List<Persona> docente = new ArrayList<Persona>();

    public Docente() {
    }

    public Docente(String num_usuario_interino, int num_usuario, String contrasena, String nombre, String primero_apellido, String segundo_apellido, int cedula, int edad, boolean sexo) {
        super(nombre, primero_apellido, segundo_apellido, cedula, edad, sexo);
        this.num_usuario_interino = num_usuario_interino;
        this.num_usuario = num_usuario;
        this.contrasena = contrasena;
    }

    public String getNum_usuario_interino() {
        return num_usuario_interino;
    }

    public void setNum_usuario_interino(String num_usuario_interino) {
        this.num_usuario_interino = num_usuario_interino;
    }

    public int getNum_usuario() {
        return num_usuario;
    }

    public void setNum_usuario(int num_usuario) {
        this.num_usuario = num_usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

}
