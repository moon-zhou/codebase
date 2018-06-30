/**  
 * Project Name:codebase  
 * File Name:ListRemoveWhenErgodic.java  
 * Package Name:com.moonzhou.collectionObj  
 * Date:2018年6月30日下午5:00:30  
 * Copyright (c) 2018, ayimin1989@163.com All Rights Reserved.  
 *  
*/

package com.moonzhou.collectionObj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ClassName:ListRemoveWhenErgodic <br/>
 * Function: . <br/>
 * Date: 2018年6月30日 下午5:00:30 <br/>
 * 
 * 其他方式见下面链接，不做一一列举<br/>
 * https://blog.csdn.net/pomme_qixiaohu/article/details/8524615
 * 
 * @author moon-zhou
 * @version
 * @see
 */
public class ListRemoveWhenErgodic {
	public static void main(String[] args) {

		// test remove exception
		// removeException();

		// 通过i遍历时删除
		// removeByIndexErgodic();

		// 通过Iterator遍历时直接删除iterator
		removeByIterator();
	}

	/**
	 * 
	 * removeException:遍历list过程对符合条件的数据做删除操作，抛出异常. <br/>
	 * 
	 * 以下方式均会造成java.util.ConcurrentModificationException
	 * 
	 * @author moon-zhou
	 * @since 2018年6月30日
	 */
	private static void removeException() {
		List<Integer> handleData = initListData();

		/*
		 * for (Iterator<Integer> iter = handleData.iterator(); iter.hasNext();) { int i = iter.next(); if (i == 3) { handleData.remove(i); } }
		 */

		for (Integer integer : handleData) {
			if (integer == 3) {
				handleData.remove(integer);
			}
		}

		outList(handleData);
	}

	/**
	 * 
	 * removeByIndexErgodic:通过index遍历. <br/>
	 * 
	 * @author moon-zhou
	 * @since 2018年6月30日
	 */
	private static void removeByIndexErgodic() {

		List<Integer> handleData = initListData();

		for (int i = 0; i < handleData.size(); i++) {
			if (i == 3) {
				handleData.remove(i);
			}
		}

		outList(handleData);
	}

	/**
	 * 
	 * removeException:遍历list过程对符合条件的数据做删除操作，抛出异常. <br/>
	 * 
	 * 以下方式均会造成java.util.ConcurrentModificationException
	 * 
	 * @author moon-zhou
	 * @since 2018年6月30日
	 */
	private static void removeByIterator() {
		List<Integer> handleData = initListData();

		for (Iterator<Integer> iter = handleData.iterator(); iter.hasNext();) {
			int i = iter.next();
			if (i == 3) {
				iter.remove();
			}
		}

		outList(handleData);
	}

	/**
	 * 
	 * initListData:生成使用的测试数据. <br/>
	 * 
	 * @author moon-zhou
	 * @return
	 * @since 2018年6月30日
	 */
	private static List<Integer> initListData() {

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);

		return list;
	}

	/**
	 * 
	 * outList:控制台打印list数据. <br/>
	 * 
	 * @author moon-zhou
	 * @param list
	 * @since 2018年6月30日
	 */
	private static void outList(List<Integer> list) {

		for (Integer integer : list) {
			System.out.println(integer);
		}
	}
}
