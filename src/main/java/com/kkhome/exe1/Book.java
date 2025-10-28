package com.kkhome.exe1;

/**
 * @ClassName Book
 * @Description 图书类的设计
 * @Author PZK
 * @Date 2025/10/26 17:43
 * @Version 1.0
 */
public class Book {
    String id;
    String title;
    String author;
    double price;

    public Book() {
    }

    public Book(String id, String title, String author, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public Book setId(String id) {
        this.id = id;
        return Book.this;
    }

    public double getPrice() {
        return price;
    }

    public Book setPrice(double price) {
        this.price = price;
        return Book.this;
    }

    public String getAuthor() {
        return author;
    }

    public Book setAuthor(String author) {
        this.author = author;
        return Book.this;
    }

    public String getTitle() {
        return title;
    }

    public Book setTitle(String title) {
        this.title = title;
        return Book.this;
    }

    public void toPrint() {
        System.out.println(id + "\t\t" + title + "\t\t" + author + "\t\t" + price + "元");
    }

}
