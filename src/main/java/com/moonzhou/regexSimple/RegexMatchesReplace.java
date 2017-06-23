package com.moonzhou.regexSimple;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * 
 * @author moon-zhou
 *
 */
public class RegexMatchesReplace {

    public static void main(String[] args) {
        replace();
        
        System.out.println("--------");
        
        replace2();
    }

    private static void replace() {
        String regex = "dog";
        String input = "The dog says meow. " + "All dogs say meow.";
        String replace = "cat";

        Pattern p = Pattern.compile(regex);
        
        // get a matcher object
        Matcher m = p.matcher(input);
        input = m.replaceAll(replace);
        System.out.println(input);
    }

    private static void replace2() {
        String regex = "a*b";
        String input = "aabfooaabfooabfoob";
        String replace = "-";

        Pattern p = Pattern.compile(regex);
        
        // 获取 matcher 对象
        Matcher m = p.matcher(input);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(sb, replace);
        }
        m.appendTail(sb);
        System.out.println(sb.toString());
    }
}
