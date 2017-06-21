package com.moonzhou.thread;

public class TestThread {

    public static void main(String args[]) {
        /*RunnableDemo R1 = new RunnableDemo("Thread-1");
        R1.start();

        RunnableDemo R2 = new RunnableDemo("Thread-2");
        R2.start();*/

        System.out.println("===========================");

        ThreadDemo T1 = new ThreadDemo("Thread-1");
        T1.start();

        ThreadDemo T2 = new ThreadDemo("Thread-2");
        T2.start();

    }
}
