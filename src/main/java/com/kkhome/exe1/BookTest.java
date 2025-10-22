package com.kkhome.exe1;

public class BookTest {
    public static void main(String[] args) {

        Book book1 =new Book("00","Java基础","kk",25.5);
        Book book2 =new Book("01","Java进阶","kk",25.5);
        Book book3 =new Book("02","Java高级","kk",25.5);
        Book book4 =new Book("03","MySql基础","kk",25.5);
        Book book5 =new Book("04","MySql进阶","kk",25.5);
        Book book6 =new Book("05","MySql高级","kk",25.5);
        Book book7 =new Book("06","框架基础","kk",25.5);
        Book book8 =new Book("07","框架进阶","kk",25.5);
        Book book9 =new Book("08","框架高级","kk",25.5);
        Book book10 =new Book("09","Java编码风格","kk",25.5);

        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());
        System.out.println(book4.toString());
        System.out.println(book5.toString());
        System.out.println(book6.toString());
        System.out.println(book7.toString());
        System.out.println(book8.toString());
        System.out.println(book9.toString());
        System.out.println(book10.toString());
    }
}
