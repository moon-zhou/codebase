package com.moonzhou.thread;

public class TestThread {

    public static void main(String args[]) {
        
        // test RunnableDemo.class
        /*
         * RunnableDemo R1 = new RunnableDemo("Thread-1"); R1.start();
         * 
         * RunnableDemo R2 = new RunnableDemo("Thread-2"); R2.start();
         */

        System.out.println("===========================");

        // test ThreadDemo
        /*
         * ThreadDemo T1 = new ThreadDemo("Thread-1"); T1.start();
         * 
         * ThreadDemo T2 = new ThreadDemo("Thread-2"); T2.start();
         */

        
        // test MyThread
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 30) {
                Thread myThread1 = new MyThread(); // 创建一个新的线程 myThread1 此线程进入新建状态
                Thread myThread2 = new MyThread(); // 创建一个新的线程 myThread2 此线程进入新建状态
                myThread1.start(); // 调用start()方法使得线程进入就绪状态
                myThread2.start(); // 调用start()方法使得线程进入就绪状态
            }
        }
    }
}
