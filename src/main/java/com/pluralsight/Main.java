package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner library = new Scanner(System.in);
        System.out.print("Please enter your first and last name: ");
        String name = library.nextLine();

        System.out.print("Show Available Books");
        System.out.print("\nShow Checked Out Books");
        System.out.print("\nExit");

        System.out.print("\nType in the A, C, or E for select options: ");
        String option = library.next();

        Book[] books = new Book[20]; //array of type book

        Book stock1 = new Book(1, "1-1", "Book1");
        books[0] = stock1;
        Book stock2 = new Book(2, "1-2", "Book2");
        books[1] = stock2;
        Book stock3 = new Book(3, "1-3", "Book3");
        books[2] = stock3;
        Book stock4 = new Book(4, "1-4", "Book4");
        books[3] = stock4;
        Book stock5 = new Book(5, "1-5", "Book5");
        books[4] = stock5;
        Book stock6 = new Book(6, "1-6", "Book6");
        books[5] = stock6;
        Book stock7 = new Book(7, "1-7", "Book7");
        books[6] = stock7;
        Book stock8 = new Book(8, "1-8", "Book8");
        books[7] = stock8;
        Book stock9 = new Book(9, "1-9", "Book9");
        books[8] = stock9;
        Book stock10 = new Book(10, "1-10", "Book10");
        books[9] = stock10;
        Book stock11 = new Book(11, "1-11", "Book11");
        books[10] = stock11;
        Book stock12 = new Book(12, "1-12", "Book12");
        books[11] = stock12;
        Book stock13 = new Book(13, "1-13", "Book13");
        books[12] = stock13;
        Book stock14 = new Book(14, "1-14", "Book14");
        books[13] = stock14;
        Book stock15 = new Book(15, "1-15", "Book15");
        books[14] = stock15;
        Book stock16 = new Book(16, "1-16", "Book16");
        books[15] = stock16;
        Book stock17 = new Book(17, "1-17", "Book17");
        books[16] = stock17;
        Book stock18 = new Book(18, "1-18", "Book18");
        books[17] = stock18;
        Book stock19 = new Book(19, "1-19", "Book19");
        books[18] = stock19;
        Book stock20 = new Book(20, "1-20", "Book20");
        books[19] = stock20;
        if(stock1.getIsCheckedOut() == true) {
            String checkedOutTo = name;
        } else {
            String checkedOutTo = " ";
        }
        if(stock2.getIsCheckedOut() == true) {
            String checkedOutTo = name;
        } else {
            String checkedOutTo = " ";
        }
        if(stock3.getIsCheckedOut() == true) {
            String checkedOutTo = name;
        } else {
            String checkedOutTo = " ";
        }
        if(stock4.getIsCheckedOut() == true) {
            String checkedOutTo = name;
        } else {
            String checkedOutTo = " ";
        }
        if(stock5.getIsCheckedOut() == true) {
            String checkedOutTo = name;
        } else {
            String checkedOutTo = " ";
        }
        if(stock6.getIsCheckedOut() == true) {
            String checkedOutTo = name;
        } else {
            String checkedOutTo = " ";
        }
        if(stock7.getIsCheckedOut() == true) {
            String checkedOutTo = name;
        } else {
            String checkedOutTo = " ";
        }
        if(stock8.getIsCheckedOut() == true) {
            String checkedOutTo = name;
        } else {
            String checkedOutTo = " ";
        }
        if(stock9.getIsCheckedOut() == true) {
            String checkedOutTo = name;
        } else {
            String checkedOutTo = " ";
        }
        if(stock10.getIsCheckedOut() == true) {
            String checkedOutTo = name;
        } else {
            String checkedOutTo = " ";
        }
        if(stock11.getIsCheckedOut() == true) {
            String checkedOutTo = name;
        } else {
            String checkedOutTo = " ";
        }
        if(stock12.getIsCheckedOut() == true) {
            String checkedOutTo = name;
        } else {
            String checkedOutTo = " ";
        }
        if(stock13.getIsCheckedOut() == true) {
            String checkedOutTo = name;
        } else {
            String checkedOutTo = " ";
        }
        if(stock14.getIsCheckedOut() == true) {
            String checkedOutTo = name;
        } else {
            String checkedOutTo = " ";
        }
        if(stock15.getIsCheckedOut() == true) {
            String checkedOutTo = name;
        } else {
            String checkedOutTo = " ";
        }
        if(stock16.getIsCheckedOut() == true) {
            String checkedOutTo = name;
        } else {
            String checkedOutTo = " ";
        }
        if(stock17.getIsCheckedOut() == true) {
            String checkedOutTo = name;
        } else {
            String checkedOutTo = " ";
        }
        if(stock18.getIsCheckedOut() == true) {
            String checkedOutTo = name;
        } else {
            String checkedOutTo = " ";
        }
        if(stock19.getIsCheckedOut() == true) {
            String checkedOutTo = name;
        } else {
            String checkedOutTo = " ";
        }
        if(stock20.getIsCheckedOut() == true) {
            String checkedOutTo = name;
        } else {
            String checkedOutTo = " ";
        }
        String a1 = stock1.getId() + stock1.getIsbn() + stock1.getTitle();
        String a2 = stock2.getId() + stock2.getIsbn() + stock2.getTitle();
        String a3 = stock3.getId() + stock3.getIsbn() + stock3.getTitle();
        String a4 = stock4.getId() + stock4.getIsbn() + stock4.getTitle();
        String a5 = stock5.getId() + stock5.getIsbn() + stock5.getTitle();
        String a6 = stock6.getId() + stock6.getIsbn() + stock6.getTitle();
        String a7 = stock7.getId() + stock7.getIsbn() + stock7.getTitle();
        String a8 = stock8.getId() + stock8.getIsbn() + stock8.getTitle();
        String a9 = stock9.getId() + stock9.getIsbn() + stock9.getTitle();
        String a10 = stock10.getId() + stock10.getIsbn() + stock10.getTitle();
        String a11 = stock11.getId() + stock11.getIsbn() + stock11.getTitle();
        String a12 = stock12.getId() + stock12.getIsbn() + stock12.getTitle();
        String a13 = stock13.getId() + stock13.getIsbn() + stock13.getTitle();
        String a14 = stock14.getId() + stock14.getIsbn() + stock14.getTitle();
        String a15 = stock15.getId() + stock15.getIsbn() + stock15.getTitle();
        String a16 = stock16.getId() + stock16.getIsbn() + stock16.getTitle();
        String a17 = stock17.getId() + stock17.getIsbn() + stock17.getTitle();
        String a18 = stock18.getId() + stock18.getIsbn() + stock18.getTitle();
        String a19 = stock19.getId() + stock19.getIsbn() + stock19.getTitle();
        String a20 = stock20.getId() + stock20.getIsbn() + stock20.getTitle();

        //Continuing Scanner here
        if (option.equalsIgnoreCase("A")) {
            System.out.print(a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 + a14 + a15 + a16 + a17 +
                    a18 + a19 + a20);
        }
    }
}