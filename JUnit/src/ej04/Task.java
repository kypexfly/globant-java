/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej04;

import java.time.LocalDate;

/**
 *
 * @author rczgr
 */
public class Task {

    private int id;
    private String description;
    private LocalDate createdAt;

    public Task() {
    }

    public Task(int id, String description, LocalDate createdAt) {
        this.id = id;
        this.description = description;
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    

}
