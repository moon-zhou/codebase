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
}
