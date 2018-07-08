/**  
 * Project Name:codebase  
 * File Name:FilterFileContents.java  
 * Package Name:com.moonzhou.regexSimple  
 * Date:2018年7月8日下午2:56:20  
 * Copyright (c) 2018, ayimin1989@163.com All Rights Reserved.  
 *  
*/

package com.moonzhou.regexSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ClassName:FilterFileContents <br/>
 * Function: 按行读取文件，每行按照正则表达式匹配，看是否有符合条件的内容输出. <br/>
 * 为防止文件过大内存溢出，需要缓冲读取 Date: 2018年7月8日 下午2:56:20 <br/>
 * 
 * @author moon-zhou
 * @version
 * @since JDK 1.8
 * @see
 */
public class FilterFileContents {
	
	private static final String GOT_REGEX = "got:\\s*\\d*,";
	private static final String LIFE_TIME_REGEX = "life time:\\s*\\d*\\((\\w|\\W)\\)";
	private static final String QUERY_STARTIME_REGEX = "_QUERY_STARTIME:";
	private static final String QUERY_STRING_REGEX = "_QUERY_STRING:";
	
	private static final Pattern GOT_PATTERN = Pattern.compile(GOT_REGEX);
	private static final Pattern LIFE_TIME_PATTERN = Pattern.compile(LIFE_TIME_REGEX);
	private static final Pattern QUERY_STARTIME_PATTERN = Pattern.compile(QUERY_STARTIME_REGEX);
	private static final Pattern QUERY_STRING_PATTERN = Pattern.compile(QUERY_STRING_REGEX);
	

	public static void main(String[] args) {
		
		String folderPath = "E:/TestCode/contentfilter";
		loadFileFolder(folderPath);

	}

	/**
	 * 
	 * loadFileFolder:加载一个文件夹，遍历下面的文件，每个文件进行过滤，查找符合的内容. <br/>
	 * 因为通常一个日志文件都是放在一个文件夹下，所以直接输入文件夹遍历下面的所有文件即可
	 * 
	 * @author moon-zhou
	 * @param folderPath
	 * @since 2018年7月8日
	 */
	private static void loadFileFolder(String folderPath) {

		File foleder = new File(folderPath);

		if (foleder.exists() && foleder.isDirectory()) {

			File[] logs = foleder.listFiles();

			if (null != logs && logs.length > 0) {
				
				for (File log : logs) {
					
					System.out.println("----------------------------read log: " + log.getName());
					filterTxtByStringBuffer(log);
				}
			}
		}

	}

	/**
	 * 
	 * readTxtByStringBuffer:缓冲方式读取文件，防止文件过大一次性加载导致OOM.每一行根据正则表达式过滤输出符合条件的内容。 <br/>
	 * 
	 * @author moon-zhou
	 * @param fileName
	 * @since 2018年7月8日
	 */
	private static void filterTxtByStringBuffer(File logFile) {

		BufferedReader reader = null;

		try {
			// 缓冲区大小10M
			reader = new BufferedReader(new FileReader(logFile), 10 * 1024 * 1024);
			String stringMsg = null;
			while ((stringMsg = reader.readLine()) != null) {
				Matcher gotMatcher = GOT_PATTERN.matcher(stringMsg);
				Matcher lifeTimeMatcher = LIFE_TIME_PATTERN.matcher(stringMsg);
				Matcher queryStartimeMatcher = QUERY_STARTIME_PATTERN.matcher(stringMsg);
				Matcher queryStringMatcher = QUERY_STRING_PATTERN.matcher(stringMsg);
				
				if (gotMatcher.find()) {
					System.out.println(gotMatcher.group());
				} else if (lifeTimeMatcher.find()) {
					System.out.println(lifeTimeMatcher.group());
				} else if (queryStartimeMatcher.find()) {
					// 输出整行
					System.out.println(stringMsg);
				} else if (queryStringMatcher.find()) {
					// 输出整行
					System.out.println(stringMsg);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (null != reader) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();  
				}
			}
		}
	}

}
