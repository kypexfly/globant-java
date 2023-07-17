/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ej04;

import java.time.LocalDate;
import java.util.ArrayList;
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
public class TaskManagerTest {

    private TaskManager tm;

    public TaskManagerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        tm = new TaskManager();
    }

    @After
    public void tearDown() {
        tm = null;
    }

    @Test
    public void testAdd() {

        Task task = new Task(
                1,
                "Hacer la compra",
                LocalDate.parse("2023-07-17")
        );

        tm.add(task);
        ArrayList<Task> tasks = tm.getAllTasks();

        assertTrue(tasks.contains(task));
    }

    @Test
    public void testRemove() {

        Task task = new Task(
                1,
                "Hacer la compra",
                LocalDate.parse("2023-07-17")
        );

        tm.remove(task);

        ArrayList<Task> tasks = tm.getAllTasks();

        assertFalse(tasks.contains(task));
    }

    @Test
    public void testGetAll() {
        TaskManager tm = new TaskManager();
        Task task1 = new Task(
                1,
                "Hacer la compra",
                LocalDate.parse("2023-07-17")
        );

        Task task2 = new Task(
                2,
                "Pagar facturas",
                LocalDate.parse("2023-07-18"));

        tm.add(task1);
        tm.add(task2);
        ArrayList<Task> tasks = tm.getAllTasks();

        assertEquals(2, tasks.size());
        assertTrue(tasks.contains(task1));
        assertTrue(tasks.contains(task2));
    }

}
