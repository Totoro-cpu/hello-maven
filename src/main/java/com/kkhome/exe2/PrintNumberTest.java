package com.kkhome.exe2;

class PrintThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        };
    }
}
public class PrintNumberTest {
    public static void main(String[] args) {
        PrintThread printThread = new PrintThread();
        printThread.start();
    }
}
