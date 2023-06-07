/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej01;

import ej01.Book;
import java.util.Scanner;

/**
 *
 * @author rczgr
 */
public class BookService {

    private Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    private Book book;

    public BookService() {
    }

    public Book createBook() {
        Book book = new Book();

        System.out.println("Enter book ISBN: ");
        book.setIsbn(scanner.next());
        System.out.println("Enter book title: ");
        book.setTitle(scanner.next());
        System.out.println("Enter book author: ");
        book.setAuthor(scanner.next());
        System.out.println("Enter book pages: ");
        book.setPages(scanner.nextInt());

        return book;
    }

    public void showBook(Book book) {
        System.out.println(book.toString());
    }

}
