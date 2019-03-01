package com.zc.sort;


import com.zc.util.AutomaticArray;

/** 
 * @Description: 插入排序
 * @author: zhangcheng
 * @date: 2019年2月28日 
 */


public class InsertSort {
	public static void main(String[] args) {
		int[] randomArray = AutomaticArray.produceRandomArray();
//		for (int i : randomArray) {
//			System.out.println(randomArray[i]);
//		}
//		System.out.println(Arrays.toString(randomArray));
		long start = System.currentTimeMillis();
		sort(randomArray);
		long end = System.currentTimeMillis();
		System.out.println(end-start);
//		System.out.println(Arrays.toString(randomArray));
	}
	
	/*
	 * 插入排序法
	 * 原来是从第二位开始,如果出现有后面一位小于前面一位，则开始进行判断,一直到有数比他小为止
	 * 
	 */
	public static void sort(int[] arr) {
		int j;
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]<arr[i-1]) {
				int temp = arr[i];
				for (j = i-1; j>-1&&arr[j]>temp; j--) {
					arr[j+1] = arr[j];
				}
				arr[j+1] = temp;
			}
		}
	}

}
