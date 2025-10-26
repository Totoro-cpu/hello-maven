package com.kkhome.exe1;

import java.util.Scanner;

/**
 * @ClassName BookView
 * @Description 系统交互界面
 * @Author PZK
 * @Date 2025/10/22 21:27
 * @Version 1.0
 */
public class BookView {
    public void displayMenu() {
        BookList bookList = new BookList(10);
        boolean flag = true;
        while (flag) {
            System.out.println("-----------图书管理系统-----------");
            System.out.println("\t\t1.添加图书");
            System.out.println("\t\t2.删除图书");
            System.out.println("\t\t3.展示图书");
            System.out.println("\t\t4.修改图书");
            System.out.println("\t\t5.退出系统");

            System.out.print("请选择（1-5）：");
            char selection = new Scanner(System.in).next().charAt(0);
            if (selection == '1' || selection == '2' || selection == '3' || selection == '4' || selection == '5') {
                switch (selection) {
                    case '1':
                        systemAddBook(bookList);
                        break;
                    case '2':
                        systemRemoveBook(bookList);
                        break;
                    case '3':
                        systemDisplayBook(bookList);
                        break;
                    case '4':
                        systemModifyBook(bookList);
                        break;
                    case '5':
                        flag = false;
                        System.out.println("退出系统成功");
                        break;
                }
            } else {
                System.out.println("你输入的有误！");
            }

        }
    }

    public void systemModifyBook(BookList bookList) {
        boolean flag = true;
        if (bookList.getTotal() > 0) {
            while (flag) {
                System.out.println("---------修改图书---------");
                System.out.println("请选择要按图书什么属性修改：");
                System.out.println("\t\t1.编号");
                System.out.println("\t\t2.名称");
                System.out.println("\t\t3.作者");
                System.out.println("\t\t4.价格");
                char selection = new Scanner(System.in).next().charAt(0);
                if (selection == '1' || selection == '2' || selection == '3' || selection == '4') {
                    switch (selection) {
                        case '1':
                            System.out.print("请输入图书编号：");
                            String oldId = new Scanner(System.in).nextLine();
                            if (bookList.getBookById(oldId).id == null) {
                                System.out.println("书架没有该图书！");
                                continue;
                            } else {
                                for (int i = 0; i < bookList.getTotal(); i++) {
                                    if (bookList.getBook(i).getId().equals(oldId)) {
                                        System.out.print("请输入要改成什么编号：");
                                        String newId = new Scanner(System.in).nextLine();
                                        bookList.updateBook(i, bookList.getBook(i).setId(newId));
                                    }
                                }
                            }
                            flag = false;
                            break;
                        case '2':
                            System.out.print("请输入图书名称：");
                            String oldTitle = new Scanner(System.in).nextLine();
                            if (bookList.getBookByTitle(oldTitle).title == null) {
                                System.out.println("书架没有该图书！");
                                continue;
                            } else {
                                for (int i = 0; i < bookList.getTotal(); i++) {
                                    if (bookList.getBook(i).getTitle().equals(oldTitle)) {
                                        System.out.print("请输入要改成什么名称：");
                                        String newTitle = new Scanner(System.in).nextLine();
                                        bookList.updateBook(i, bookList.getBook(i).setTitle(newTitle));
                                    }
                                }
                            }
                            flag = false;
                            break;
                        case '3':
                            System.out.print("请输入图书作者：");
                            String oldAuthor = new Scanner(System.in).nextLine();
                            if (bookList.getBookByAuthor(oldAuthor).author == null) {
                                System.out.println("书架没有该图书！");
                                continue;
                            } else {
                                for (int i = 0; i < bookList.getTotal(); i++) {
                                    if (bookList.getBook(i).getAuthor().equals(oldAuthor)) {
                                        System.out.print("请输入要改成什么作者：");
                                        String newAuthor = new Scanner(System.in).nextLine();
                                        bookList.updateBook(i, bookList.getBook(i).setAuthor(newAuthor));
                                    }
                                }
                            }
                            flag = false;
                            break;
                        case '4':
                            System.out.print("请输入图书价格：");
                            double oldPrice = new Scanner(System.in).nextDouble();
                            if (bookList.getBookByPrice(oldPrice).id == null) {
                                System.out.println("书架没有该图书！");
                                continue;
                            } else {
                                for (int i = 0; i < bookList.getTotal(); i++) {
                                    if (bookList.getBook(i).getPrice() == oldPrice) {
                                        System.out.print("请输入要改成什么价格：");
                                        double newPrice = new Scanner(System.in).nextDouble();
                                        bookList.updateBook(i, bookList.getBook(i).setPrice(newPrice));
                                    }
                                }
                            }
                            flag = false;
                            break;
                    }
                } else {
                    System.out.println("输入有误！");
                }
            }
            System.out.println("价格修改成功");
        } else {
            System.out.println("书架为空，修改失败！");
        }
    }

    public void systemDisplayBook(BookList bookList) {
        System.out.println("-------------书架展示-------------");
        System.out.println("编号\t\t书名\t\t作者\t\t价格");
        bookList.systemToPrint();
    }

    public void systemRemoveBook(BookList bookList) {
        boolean flag = true;
        if (bookList.getTotal() > 0) {
            while (flag) {
                System.out.println("---------删除图书---------");
                System.out.println("请选择要按图书什么属性删除：");
                System.out.println("\t\t1.编号");
                System.out.println("\t\t2.名称");
                System.out.println("\t\t3.作者");
                System.out.println("\t\t4.价格");
                char selection = new Scanner(System.in).next().charAt(0);
                if (selection == '1' || selection == '2' || selection == '3' || selection == '4') {
                    switch (selection) {
                        case '1':
                            System.out.print("请输入图书编号：");
                            String id = new Scanner(System.in).nextLine();
                            if (bookList.getBookById(id).id == null) {
                                System.out.println("书架没有该图书！");
                                continue;
                            } else {
                                for (int i = 0; i < bookList.getTotal(); i++) {
                                    if (bookList.getBook(i).getId().equals(id)) {
                                        bookList.removeBook(i);
                                    }
                                }
                            }
                            flag = false;
                            break;
                        case '2':
                            System.out.print("请输入图书名称：");
                            String title = new Scanner(System.in).nextLine();
                            if (bookList.getBookByTitle(title).title == null) {
                                System.out.println("书架没有该图书！");
                                continue;
                            } else {
                                for (int i = 0; i < bookList.getTotal(); i++) {
                                    if (bookList.getBook(i).getTitle().equals(title)) {
                                        bookList.removeBook(i);
                                    }
                                }
                            }
                            flag = false;
                            break;
                        case '3':
                            System.out.print("请输入图书作者：");
                            String author = new Scanner(System.in).nextLine();
                            if (bookList.getBookByAuthor(author).author == null) {
                                System.out.println("书架没有该图书！");
                                continue;
                            } else {
                                for (int i = 0; i < bookList.getTotal(); i++) {
                                    if (bookList.getBook(i).getAuthor().equals(author)) {
                                        bookList.removeBook(i);
                                    }
                                }
                            }
                            flag = false;
                            break;
                        case '4':
                            System.out.print("请输入图书价格：");
                            double price = new Scanner(System.in).nextDouble();
                            if (bookList.getBookByPrice(price).id == null) {
                                System.out.println("书架没有该图书！");
                                continue;
                            } else {
                                for (int i = 0; i < bookList.getTotal(); i++) {
                                    if (bookList.getBook(i).getPrice() == price) {
                                        bookList.removeBook(i);
                                    }
                                }
                            }
                            flag = false;
                            break;
                    }
                } else {
                    System.out.println("输入有误！");
                }
            }
            System.out.println("删除成功");
        } else {
            System.out.println("书架为空，删除失败！");
        }

    }

    public void systemAddBook(BookList bookList) {
        System.out.println("---------添加图书---------");
        System.out.print("请输入图书编号：");
        String id = new Scanner(System.in).nextLine();
        System.out.print("请输入图书名称：");
        String title = new Scanner(System.in).nextLine();
        System.out.print("请输入图书作者：");
        String author = new Scanner(System.in).nextLine();
        System.out.print("请输入图书价格：");
        double price = new Scanner(System.in).nextDouble();
        Book book = new Book(id, title, author, price);
        boolean iSuccess = bookList.addBook(book);
        if (iSuccess) {
            System.out.println("图书添加成功");
        } else {
            System.out.println("书架容量已满，请重新添加！");
        }
    }

    public static void main(String[] args) {
        BookView bookView = new BookView();
        bookView.displayMenu();
    }
}
