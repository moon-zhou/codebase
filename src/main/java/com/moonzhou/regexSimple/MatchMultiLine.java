package com.moonzhou.regexSimple;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * use regex to match multi line content
 * @author moon-zhou
 *
 */
public class MatchMultiLine {

    public static void main(String[] args) {
        String string = "This is\r\na test\r\nString.";
        Pattern p = Pattern.compile("^.+$", Pattern.MULTILINE); // 打开多行匹配模式
        Matcher m = p.matcher(string);
        while (m.find()) {
            System.out.println("[" + m.group() + "]");
        }
    }

}
