package com.kkhome.exe1;

/**
 * @ClassName BookList
 * @Description 书架类的设计
 * @Author PZK
 * @Date 2025/10/22 21:22
 * @Version 1.0
 */
public class BookList {
    Book[] books;
    int total;

    public BookList(int total) {
        books = new Book[total];
    }

    public boolean addBook(Book book) {
        if (total < books.length) {
            books[total] = book;
            total++;
            return true;
        }
        return false;
    }

    public void removeBook(int index) {
        if (index >= 0) {
            for (int i = index; i < total; i++) {
                books[i] = books[i + 1];
            }
            books[total - 1] = null;
            total--;
        }
    }

    public void updateBook(int index, Book book) {
        if (index >= 0 && index < total) {
            books[index] = book;
        }
    }

    public Book getBook(int index) {
        if (index >= 0 && index < total) {
            return books[index];
        }
        return null;
    }

    public Book getBookById(String id) {
        Book book = new Book();
        for (int i = 0; i < total; i++) {
            if (books[i].getId().equals(id)) {
                book = books[i];
            }
        }
        return book;
    }

    public Book getBookByTitle(String title) {
        Book book = new Book();
        for (int i = 0; i < total; i++) {
            if (books[i].getTitle().equals(title)) {
                book = books[i];
            }
        }
        return book;
    }

    public Book getBookByAuthor(String author) {
        Book book = new Book();
        for (int i = 0; i < total; i++) {
            if (books[i].getAuthor().equals(author)) {
                book = books[i];
            }
        }
        return book;
    }

    public Book getBookByPrice(double price) {
        Book book = new Book();
        for (int i = 0; i < total; i++) {
            if (books[i].getPrice() == price) {
                book = books[i];
            }
        }
        return book;
    }

    public int getTotal() {
        return total;
    }

    public void systemToPrint() {
        for (int i = 0; i < total; i++) {
            books[i].toPrint();
        }
    }
}
