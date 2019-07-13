/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Roles_usuario;

/**
 *
 * @author Kenneth
 */
public class Rol {
    
    private String nombre;

    public Rol() {
        
        this.nombre ="";
    }

    public Rol(String mombre) {
        this.nombre = mombre;
    }

    public Rol(String alejandra, String administrativo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String mombre) {
        this.nombre = mombre;
    }
    
      public static String getEstudiante(){
        return "Estudiante";
    }
    
    public static String getAdministrativo(){
        return "Administrativo";
    }
    
    public static String getDocenteInterino(){
        return "DocenteInterino";        
    }
    
    public static String getDocente(){
        return "Docente";
    }



    
    
    
    
}
