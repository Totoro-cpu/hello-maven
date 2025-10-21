package com.kkhome;

import java.util.Scanner;

/**
 * @ClassName AccountBook
 * @Description 简易记账本小Demo
 * @Author PZK
 * @Date 2025/10/21 12:41
 * @Version 1.0
 */
public class AccountBook {
    public static void main(String[] args) throws InterruptedException {


        int balance = 100;
        String stringInfo = "";
        boolean flag = true;
        while(flag){

            System.out.println("------------简易记账本------------");
            System.out.println("\t\t\t1.登记收入");
            System.out.println("\t\t\t2.登记支出");
            System.out.println("\t\t\t3.展示账单");
            System.out.println("\t\t\t4.退出");

            System.out.println("请输入你的选择（1-4）");

            char selection = new Scanner(System.in).next().charAt(0);

            if(selection == '1' || selection == '2' || selection == '3' || selection == '4'){
                switch (selection){
                    case '1':
                        System.out.println("请输入收入金额：");
                        int money1 = new Scanner(System.in).nextInt();
                        balance += money1;
                        System.out.println("请输入收入款项：");
                        String addReason = new Scanner(System.in).next();
                        stringInfo  +=  "收入\t\t" + balance + "\t\t" + money1 + "\t\t" + addReason + "\n";
                        System.out.println("登记完成！");
                        break;
                    case '2':
                        System.out.println("请输入支出金额：");
                        int money2 = new Scanner(System.in).nextInt();
                        balance -= money2;
                        System.out.println("请输入支出款项：");
                        String minusReason = new Scanner(System.in).next();
                        stringInfo  +=  "支出\t\t" + balance + "\t\t" + money2 + "\t\t" + minusReason + "\n";
                        System.out.println("登记完成！");
                        break;
                    case '3':
                        System.out.println("------------账单展示------------");
                        System.out.println("收支\t\t余额\t\t金额\t\t原因");
                        System.out.println(stringInfo);
                        System.out.println("-------------------------------");
                        break;
                    case '4':
                        System.out.println("请确认是否退出（Y/N）");
                        char isExit = new Scanner(System.in).next().charAt(0);
                        if (isExit == 'Y') flag = false;
                        break;
                }
            }else {
                System.out.println("你输入的不合法，系统将自动返回...");
                Thread.sleep(1000);
            }

        }
    }
}
