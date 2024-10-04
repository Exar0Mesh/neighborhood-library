package com.pluralsight;

import java.util.Scanner;

public class Book {
    private int id;                 //id in library, so small numbers for this case. Needs index value
    private String isbn;            //big number book code
    private String title;           //book title
    private boolean isCheckedOut;   //true or false. Does not need array
    private String checkedOutTo;    //name through scanner. Does not need array

    public Book(int id, String isbn, String title) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = false;
        this.checkedOutTo = " ";
    }
    //Calling the this.variables below
    public int getId() {
        return this.id;
    }
    public String getIsbn() {
        return this.isbn;
    }
    public String getTitle() {
        return this.title;
    }
    public boolean getIsCheckedOut() {
        return this.isCheckedOut;
    }
    public String getCheckedOutTo() {
        return this.checkedOutTo;
    }

    public static void main(String[] args) {

    }
}
