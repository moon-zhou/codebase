package com.moonzhou.thread.guessAndDisplay;

import java.util.concurrent.TimeUnit;

/**
 * 通过实现 Runnable 接口创建线程
 * @author moon-zhou
 *
 */
public class DisplayMessage implements Runnable {
    private String message;

    public DisplayMessage(String message) {
        this.message = message;
    }

    public void run() {
        while (true) {
            System.out.println(message);
            
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}