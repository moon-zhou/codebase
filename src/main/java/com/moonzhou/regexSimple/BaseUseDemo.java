package com.moonzhou.regexSimple;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * 正则表达式的基本使用方法
 * 
 * @author moon-zhou
 *
 */
public class BaseUseDemo {

    private String str;

    private String regEx;

    @Before
    public void initData() {
    }

    @Test
    public void useFromString() {
        String str = "gooooooogle";

        // * 是数量限定字符，它代表前面的字符可以不出现，也可以出现一次或者多次
        String regEx = "go*gle";

        Assert.assertTrue(str.matches(regEx));
    }

    /**
     * 测试正则表达式的匹配结果使用 匹配结果返回true/false
     */
    @Test
    public void testMatchResult() {
        // 要验证的字符串
        str = "service@xsoftlab.net";

        // 邮箱验证规则
        regEx = "[a-zA-Z_]{1,}[0-9]{0,}@(([a-zA-z0-9]-*){1,}\\.){1,3}[a-zA-z\\-]{1,}";

        // 编译正则表达式
        Pattern pattern = Pattern.compile(regEx);

        // 忽略大小写的写法
        // Pattern pat = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);

        // 字符串是否与正则表达式相匹配
        Assert.assertTrue(matcher.matches());
    }

    @Test
    public void testMatchFind() {
        // 要验证的字符串
        str = "baike.xsoftlab.net";

        // 正则表达式规则
        regEx = "baike.*";

        // 编译正则表达式
        Pattern pattern = Pattern.compile(regEx);
        // 忽略大小写的写法
        // Pattern pat = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);

        // 查找字符串中是否有匹配正则表达式的字符/字符串
        Assert.assertTrue(matcher.find());
    }

    @Test
    public void testMatchFindMore() {

        str = "Jack is a boy";

        regEx = "a";

        /*
         * str = "Jack is a boy, a very handsome boy.";
         * 
         * regEx = "[a-zA-Z_]*";
         */

        // 将字符串编译为正则表达式的对象表示形式
        Pattern pattern = Pattern.compile(regEx);

        // 创建对字符串 string 根据正则表达式 pattern 进行匹配操作的匹配器对象
        Matcher matcher = pattern.matcher(str);

        // 查找下一个匹配的字符串内容，如果找到返回 true，找不到返回 false
        while (matcher.find()) {
            // 输出捕获到的匹配内容
            System.out.println(matcher.group());
            Assert.assertNotNull(matcher.group());
        }
    }

    @Test
    public void testPatternParam() {
        str = "About Cats and dogs";

        regEx = "cat";

        // 在编译表达式时使用标记 CASE_INSENSITIVE，使表达式忽略大小写
        Pattern pattern = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }

    }
}
