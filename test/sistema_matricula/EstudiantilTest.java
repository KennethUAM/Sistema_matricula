/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_matricula;

import Mensajeria.Mensajes;
import Roles_usuario.Rol;
import Roles_usuario.Usuario;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kenneth
 */
public class EstudiantilTest {
    
    public EstudiantilTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getEstudiantes method, of class Estudiantil.
     */
    //@Test
    public void testGetEstudiantes() {
        System.out.println("getEstudiantes");
        Estudiantil instance = new Estudiantil();
        List<Persona> expResult = null;
        List<Persona> result = instance.getEstudiantes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstudiantes method, of class Estudiantil.
     */
    //@Test
    public void testSetEstudiantes() {
        System.out.println("setEstudiantes");
        List<Persona> estudiantes = null;
        Estudiantil instance = new Estudiantil();
        instance.setEstudiantes(estudiantes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPromedio method, of class Estudiantil.
     */
    ///@Test
    public void testGetPromedio() {
        System.out.println("getPromedio");
        Estudiantil instance = new Estudiantil();
        double expResult = 0.0;
        double result = instance.getPromedio();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPromedio method, of class Estudiantil.
     */
    //@Test
    public void testSetPromedio() {
        System.out.println("setPromedio");
        double promedio = 0.0;
        Estudiantil instance = new Estudiantil();
        instance.setPromedio(promedio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNota1 method, of class Estudiantil.
     */
    //@Test
    public void testGetNota1() {
        System.out.println("getNota1");
        Estudiantil instance = new Estudiantil();
        int expResult = 0;
        int result = instance.getNota1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNota1 method, of class Estudiantil.
     */
    //@Test
    public void testSetNota1() {
        System.out.println("setNota1");
        int nota1 = 0;
        Estudiantil instance = new Estudiantil();
        instance.setNota1(nota1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNota2 method, of class Estudiantil.
     */
    //@Test
    public void testGetNota2() {
        System.out.println("getNota2");
        Estudiantil instance = new Estudiantil();
        int expResult = 0;
        int result = instance.getNota2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNota2 method, of class Estudiantil.
     */
    //@Test
    public void testSetNota2() {
        System.out.println("setNota2");
        int nota2 = 0;
        Estudiantil instance = new Estudiantil();
        instance.setNota2(nota2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNota3 method, of class Estudiantil.
     */
    //@Test
    public void testGetNota3() {
        System.out.println("getNota3");
        Estudiantil instance = new Estudiantil();
        int expResult = 0;
        int result = instance.getNota3();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNota3 method, of class Estudiantil.
     */
    //@Test
    public void testSetNota3() {
        System.out.println("setNota3");
        int nota3 = 0;
        Estudiantil instance = new Estudiantil();
        instance.setNota3(nota3);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarEstudiante method, of class Estudiantil.
     */
    @Test
    public void testAgregarEstudiante() {
        System.out.println("agregarEstudiante");
        Persona alumno = new Persona("kenneth","Hidalgo","Loaiza",12,12,true);
        Administrativo admisiones = new Administrativo(123,"56985","Alejandra","Beltran","","",20,12,false);
        String expResult = Mensajes.matricular_estudiante;
        String result = "El estudiante fue matriculado de forma exitosa!";
        assertEquals(expResult, result);
        


    }

    /**
     * Test of rolEsperado method, of class Estudiantil.
     */
    //@Test
    public void testRolEsperado() {
        System.out.println("rolEsperado");
        String rolEsperado = "";
        Usuario usuario = null;
        Estudiantil instance = new Estudiantil();
        boolean expResult = false;
        boolean result = instance.rolEsperado(rolEsperado, usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
