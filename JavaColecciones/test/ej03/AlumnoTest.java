/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ej03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rczgr
 */
public class AlumnoTest {

    public AlumnoTest() {
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

    @Test
    public void testConstructorWithoutArgs() {
        Alumno a = new Alumno();
        assertNotNull(a.getNotas());
        assertEquals(0, a.getNotas().size());
    }

    @Test
    public void testConstructorWithArgs() {
        String nombre = "Ricardo";
        List<Integer> notas = Arrays.asList(1, 2, 3, 4, 5, 6);

        Alumno a = new Alumno(nombre, notas);
        assertEquals(nombre, a.getNombre());
        assertEquals(notas, a.getNotas());
    }

}
