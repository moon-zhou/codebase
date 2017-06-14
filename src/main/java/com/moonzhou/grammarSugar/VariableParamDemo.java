package com.moonzhou.grammarSugar;

/**
 * 
 * 可变参数demo
 * 
 * @author moon-zhou
 *
 */
public class VariableParamDemo {

    public static void main(String[] args) {
        print("000", "111", "222", "333");
    }

    private static void print(String... strs) {
        for (String str : strs) {
            System.out.println(str);
        }
        
        System.out.println("-------another for-------");
        
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }
    }
}
