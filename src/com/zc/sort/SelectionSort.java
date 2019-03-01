package com.zc.sort;

import com.zc.util.AutomaticArray;

/**
 * @Description: 直接选择排序法
 * @author: zhangcheng
 * @date: 2019年2月28日
 */
public class SelectionSort {

	public static void main(String[] args) {
		int[] randomArray = AutomaticArray.produceRandomArray();
		long start = System.currentTimeMillis();
		sort(randomArray);
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}
	
	/* 直接选择出最大的一位元素与最后一位交换
	 * 时间复杂度O(n2)
	 * 
	 * */

	public static void sort(int[] arr) {
		// 需要排序的次数
		for (int i = 0; i < arr.length - 1; i++) {
			int max = 0;
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] > arr[max]) {
					max = j;
				}
			}
			if (max != arr.length - 1 - i) {
				// 将还没排好的最后一位与最大值进行交换
				arr[max] = arr[max] ^ arr[arr.length - 1 - i];
				arr[arr.length - 1 - i] = arr[arr.length - 1 - i] ^ arr[max];
				arr[max] = arr[max] ^ arr[arr.length - 1 - i];
			}

		}

	}
	
	
}
