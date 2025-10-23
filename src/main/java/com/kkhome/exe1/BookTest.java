package com.kkhome.exe1;

public class BookTest {
    public static void main(String[] args) {

        Book book1 =new Book("00","Java基础","kk",25.5);
        Book book2 =new Book("01","Java进阶","kk",25.5);
        Book book3 =new Book("02","Java高级","kk",25.5);

        System.out.println(book1.id);
        System.out.println(book2.author);
        System.out.println(book3.title);

    }
}
