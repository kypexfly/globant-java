/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ej04;

import java.time.LocalDate;
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
public class TaskTest {

    public TaskTest() {
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
    public void testGetId() {
        int taskId = 1;

        Task task = new Task(
                taskId,
                "Hacer la compra",
                LocalDate.parse("2023-07-17")
        );

        assertEquals(taskId, task.getId());
    }

    @Test
    public void testGetDescription() {
        String taskDescription = "Hacer la compra";

        Task task = new Task(
                1,
                taskDescription,
                LocalDate.parse("2023-07-17")
        );

        assertEquals(taskDescription, task.getDescription());
    }

    @Test
    public void testGetCreatedDate() {
        LocalDate createdAt = LocalDate.parse("2023-07-17");

        Task task = new Task(
                1,
                "Hacer la compra",
                LocalDate.parse("2023-07-17")
        );

        assertEquals(createdAt, task.getCreatedAt());
    }

}
