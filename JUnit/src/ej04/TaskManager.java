/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej04;

import java.util.ArrayList;

/**
 *
 * @author rczgr
 */
public class TaskManager {

    private ArrayList<Task> tasks = new ArrayList<Task>();

    public TaskManager() {
    }

    public TaskManager(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    public void add(Task task) {
        tasks.add(task);
    }

    public void remove(Task task) {
        tasks.remove(task);
    }

    public ArrayList<Task> getAllTasks() {
        return tasks;
    }

}
