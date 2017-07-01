package com.moonzhou.thread;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 使用try-with-resources, 可以自动关闭实现了AutoCloseable或者Closeable接口的资源
 * 
 * try-with-resources 语句是声明一个或多个资源的try语句，在程序执行完后资源一定会随之被关闭，try-with-resources语句确保每一个声明的资源都会在该语句执行完毕后被关闭。任何实现了Java.util.AutoCloseable或者java.io.Closeable接口的对象都可以作为资源。
 * 
 * <b>since jdk7</b>
 * 
 * @author moon-zhou
 *
 */
public class TryWithreRources {

    public static void main(String[] args) {

    }

    private static void printFile() throws IOException {
        InputStream input = null;

        try {
            input = new FileInputStream("file.txt");

            int data = input.read();
            while (data != -1) {
                System.out.print((char) data);
                data = input.read();
            }
        } finally {
            if (input != null) {
                input.close();
            }
        }
    }

    // compile error in jdk8
    /*private static void printFileJava7() throws IOException {

        try (FileInputStream input = new FileInputStream("file.txt")) {

            int data = input.read();
            while (data != -1) {
                System.out.print((char) data);
                data = input.read();
            }
        }
    }*/
}
