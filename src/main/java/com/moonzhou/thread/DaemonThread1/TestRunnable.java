package com.moonzhou.thread.DaemonThread1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.tomcat.jni.OS;

class TestRunnable implements Runnable {

    public void run() {
        FileOutputStream os = null;
        try {

            Thread.sleep(1000);// 守护线程阻塞1秒后运行

            File f = new File("E:/TestCode/thread/daemon.txt");

            os = new FileOutputStream(f, true);

            os.write("daemon".getBytes());

        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        } finally {
            if (null != os) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
