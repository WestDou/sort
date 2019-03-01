package com.zc.util;

import java.util.Random;

/**
 * @Description: TODO
 * @author: zhangcheng
 * @date: 2019年2月28日
 */
public class AutomaticArray {

	public static int[] produceRandomArray() {
		Random random = new Random();
		int[] arr = new int[10000000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(10000000);
		}
		return arr;

	}

}
