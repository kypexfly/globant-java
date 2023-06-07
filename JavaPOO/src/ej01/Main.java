/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej01;

import ej01.BookService;
import ej01.Book;

/**
 *
 * @author rczgr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
        // Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
        // constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
        // luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
        // numero de páginas.
        
        BookService bookService = new BookService();
        Book book = bookService.createBook();
        bookService.showBook(book);
        
    }
    
}
