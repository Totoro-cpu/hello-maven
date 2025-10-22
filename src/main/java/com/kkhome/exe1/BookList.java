package com.kkhome.exe1;

/**
 * @ClassName BookList
 * @Description 书本类的方法和属性
 * @Author PZK
 * @Date 2025/10/22 21:22
 * @Version 1.0
 */
public class BookList {
    Book[] books;
    int  total;

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

    public boolean removeBook(int index) {
        if (index >= 0) {
            for (int i = index; i < total; i++) {
                books[i] = books[i + 1];
            }
            books[total-1] = null;
            total--;
            return true;
        }
        return false;
    }

    public boolean updateBook(int index, Book book) {
        if (index >= 0 && index < total) {
            books[index] = book;
            return true;
        }
        return false;
    }

    public Book getAllBooks() {
        Book book = new Book();
        for (int i = 0; i < total; i++) {
            book = books[i];
        }
        return book;
    }

    public Book getBook(int index) {
        if (index >= 0 && index < total) {
            return books[index-1];
        }
        return null;
    }

    public int  getTotal() {
        return total;
    }
}
