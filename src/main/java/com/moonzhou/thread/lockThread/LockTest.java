package com.moonzhou.thread.lockThread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {
    public static void main(String[] args) {
        // 只能锁同一个实例化的对象
        final Outputter1 output = new Outputter1();
        new Thread("thread1") {
            public void run() {
                Thread thread = Thread.currentThread();
                System.out.println(thread.getName());
                output.output("zhangsan");
                System.out.println();
            };
        }.start();

        new Thread("thread2") {
            public void run() {
                Thread thread = Thread.currentThread();
                System.out.println(thread.getName());
                output.output("lisi");
                System.out.println();
            };
        }.start();
        
        new Thread("thread3") {
            public void run() {
                Thread thread = Thread.currentThread();
                System.out.println(thread.getName());
                output.output("wangwu");
            };
        }.start();
        
        final Outputter1 output2 = new Outputter1();
        new Thread("thread4") {
            public void run() {
                Thread thread = Thread.currentThread();
                System.out.println(thread.getName());
                output2.output("maliu");
            };
        }.start();
    }
}

class Outputter1 {
    private Lock lock = new ReentrantLock();// 锁对象

    public void output(String name) {
        // 线程输出方法
        lock.lock();// 得到锁
        
        try {
            
            TimeUnit.SECONDS.sleep(5);
            
            for (int i = 0; i < name.length(); i++) {
                System.out.print(name.charAt(i));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();// 释放锁
        }
    }
}