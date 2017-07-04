package com.moonzhou.thread.joinThread;

import java.util.Date;

class RunnableJob implements Runnable {

    public void run() {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + " start" + " at " + new Date());
        try {
            Thread.sleep(1000);
            System.out.println(thread.getName() + " end" + " at " + new Date());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

public class BasicTest {
    public static void main(String[] args) throws InterruptedException {
        // 初始化
        RunnableJob runnableJob = new RunnableJob();
        Thread T1 = new Thread(runnableJob, "T1");
        Thread T2 = new Thread(runnableJob, "T2");
        Thread T3 = new Thread(runnableJob, "T3");

        // T2在T1执行完后执行，T3在T2执行完后执行
        T1.start();
        T1.join();
        T2.start();
        T2.join();
        T3.start();
    }

}