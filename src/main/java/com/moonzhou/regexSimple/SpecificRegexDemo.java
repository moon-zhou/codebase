package com.moonzhou.regexSimple;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Common examples
 * 
 * @author moon-zhou
 * 
 *         http://blog.csdn.net/tiandiwuya/article/details/52035129
 *
 */
public class SpecificRegexDemo {

    public static void main(String[] args) {

    }

    public boolean vefiryEmail() {

        Pattern p = Pattern.compile("(\\w+)@(\\w+\\.\\w+)"); // 一个用于匹配邮件地址的简单表达式
        Matcher m = p.matcher("gzyangfan@gmail.com");
        return m.matches(); // 进行匹配
    }

    /**
     * 验证网址Url
     * 
     * @param 待验证的字符串
     * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
     */
    public static boolean IsUrl(String str) {
        String regex = "http(s)?://([\\w-]+\\.)+[\\w-]+(/[\\w- ./?%&=]*)?";
        return str.matches(regex);
    }

    /**
     * 验证电话号码
     * 
     * @param 待验证的字符串
     * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
     */
    public static boolean IsTelephone(String str) {
        String regex = "^(\\d{3,4}-)?\\d{6,8}$";
        return str.matches(regex);
    }

    /**
     * 验证输入密码条件(字符与数据同时出现)
     * 
     * @param 待验证的字符串
     * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
     */
    public static boolean IsPassword(String str) {
        String regex = "[A-Za-z]+[0-9]";
        return str.matches(regex);
    }

    /**
     * 验证输入密码长度 (6-18位)
     * 
     * @param 待验证的字符串
     * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
     */
    public static boolean IsPasswLength(String str) {
        String regex = "^\\d{6,18}$";
        return str.matches(regex);
    }

    /**
     * 验证输入邮政编号
     * 
     * @param 待验证的字符串
     * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
     */
    public static boolean IsPostalcode(String str) {
        String regex = "^\\d{6}$";
        return str.matches(regex);
    }

    /**
     * 验证输入两位小数
     * 
     * @param 待验证的字符串
     * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
     */
    public static boolean IsDecimal(String str) {
        String regex = "^[0-9]+(.[0-9]{2})?$";
        return str.matches(regex);
    }

    /**
     * 验证输入一个月的31天
     * 
     * @param 待验证的字符串
     * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
     */
    public static boolean IsDay(String str) {
        String regex = "^((0?[1-9])|((1|2)[0-9])|30|31)$";
        return str.matches(regex);
    }

    /**
     * 验证数字输入
     * 
     * @param 待验证的字符串
     * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
     */
    public static boolean IsNumber(String str) {
        String regex = "^[0-9]*$";
        return str.matches(regex);
    }

    /**
     * 验证非零的正整数
     * 
     * @param 待验证的字符串
     * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
     */
    public static boolean IsIntNumber(String str) {
        String regex = "^\\+?[1-9][0-9]*$";
        return str.matches(regex);
    }

    /**
     * 验证验证输入字母
     * 
     * @param 待验证的字符串
     * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
     */
    public static boolean IsLetter(String str) {
        String regex = "^[A-Za-z]+$";
        return str.matches(regex);
    }

    /**
     * 验证验证输入汉字
     * 
     * @param 待验证的字符串
     * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
     */
    public static boolean IsChinese(String str) {
        String regex = "^[\u4e00-\u9fa5],{0,}$";
        return str.matches(regex);
    }

    /**
     * 验证验证输入字符串
     * 
     * @param 待验证的字符串
     * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
     */
    public static boolean IsLength(String str) {
        String regex = "^.{8,}$";
        return str.matches(regex);
    }

    /**
     * @param regex
     *            正则表达式字符串
     * @param str
     *            要匹配的字符串
     * @return 如果str 符合 regex的正则表达式格式,返回true, 否则返回 false;
     */
    public static boolean match(String regex, String str) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

}
