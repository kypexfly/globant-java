/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej06;

/**
 *
 * @author rczgr
 */
public class CoffeMaker {

    private int maxCapacity;
    private int currentCapacity;

    public CoffeMaker() {
    }

    public CoffeMaker(int maxCapacity, int currentCapacity) {
        this.maxCapacity = maxCapacity;
        this.currentCapacity = currentCapacity;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }

    public void setCurrentCapacity(int currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    @Override
    public String toString() {
        return "CoffeMaker{" + "maxCapacity=" + maxCapacity + ", currentCapacity=" + currentCapacity + '}';
    }

    public void fill() {
        currentCapacity = maxCapacity;
    }

    public void empty() {
        currentCapacity = 0;
    }

    /**
     * Método servirTaza(int): se pide el tamaño de una taza vacia, el método
     * recibe el tamaño de la taza y simula la acción de servir la taza con la
     * capacidad indicada. Si la cantidad actual de café "no alcanza" para
     * llenar la taza, se sirve Io que quede. El método le informará al usuario
     * si se Ilena o no la taza, y de no haberse Ilenado en cuanto quedé la
     * taza.
     *
     * @param amount
     */
    public void serve(int amount) {
        if (currentCapacity - amount < 0) {
            System.out.println("Can't fill the cup.");
            System.out.println("Amount served is: " + currentCapacity);
            currentCapacity = 0;
            return;
        }

        System.out.println("Cup is fully served. Enjoy!");
        currentCapacity -= amount;
    }

    public void add(int amount) {
        if (currentCapacity + amount > maxCapacity) {
            currentCapacity = maxCapacity;
        }
        currentCapacity += amount;
    }

}
