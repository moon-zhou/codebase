package com.moonzhou.classLoaderSimple.simple1;

/**
 * 通过数组定义来引用类，不会触发此类的初始化：（SuperClass类已在本文开篇定义）
 * 
 * @author moon-zhou
 *
 */
public class NotInitialization2 {
    public static void main(String[] args) {
        SuperClass[] sca = new SuperClass[10];
    }
}
