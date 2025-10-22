package com.kkhome.exe1;

import java.util.Scanner;

/**
 * @ClassName BookView
 * @Description 系统交互
 * @Author PZK
 * @Date 2025/10/22 21:27
 * @Version 1.0
 */
public class BookView {
    public void displayMenu(){
        boolean flag = true;
        while(flag){
            System.out.println("---------图书管理系统---------");
            System.out.println("\t\t1.添加图书");
            System.out.println("\t\t2.删除图书");
            System.out.println("\t\t3.展示图书");
            System.out.println("\t\t4.修改图书");
            System.out.println("\t\t5.退出系统");

            System.out.print("请选择（1-5）：");
            char selection = new Scanner(System.in).next().charAt(0);
            if(selection == '1' || selection == '2' ||selection == '3' || selection == '4' || selection == '5'){
                switch (selection) {
                    case '1':
                        systemAddBook();
                        break;
                    case '2':
                        systemRemoveBook();
                        break;
                    case '3':
                        systemDisplayBook();
                        break;
                    case '4':
                        systemModifyBook();
                        break;
                    case '5':
                        flag = false;
                        System.out.println("退出系统成功");
                        break;
                }
            }else {
                System.out.println("你输入的有误！");
            }

        }
    }

    public void systemModifyBook() {
    }

    public void systemDisplayBook() {
    }

    public void systemRemoveBook() {
    }

    public void systemAddBook() {
    }

    public static void main(String[] args) {
        BookList bookList = new BookList(10);
    }
}
