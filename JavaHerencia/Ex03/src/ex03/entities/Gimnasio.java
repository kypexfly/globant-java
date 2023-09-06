/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex03.entities;

import ex03.entities.TipoGimnasio;

/**
 *
 * @author rczgr
 */
public class Gimnasio {

    private TipoGimnasio tipo;

    public Gimnasio() {
    }

    public Gimnasio(TipoGimnasio tipo) {
        this.tipo = tipo;
    }

    public TipoGimnasio getTipo() {
        return tipo;
    }

}
