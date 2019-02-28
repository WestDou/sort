package com.zc.sort;

/**
 * @Description: 冒泡排序
 * @author: zhangcheng
 * @date: 2019年2月28日
 */
public class BubbleSort {

	public static void main(String[] args) {

		int[] randomArray = AutomaticArray.produceRandomArray();
		long start = System.currentTimeMillis();
		sort(randomArray);
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		
	}

	/* 
	 * 交换两个数的方法有很多种
	 * 数学方法
	 * a = a + b;
	 * b = a - b;
	 * a = a - b;
	 * 或者除法同理
	 * a = a * b;
	 * b = a / b;
	 * a = a / b;
	 * 
	 * 位运算
	 * 根据a ^ b ^ a 的结果是b的性质
	 * a = a ^ b;
	 * b = b ^ a;
	 * a = a ^ b;
	 * */
	
	public static  void sort(int[] array) {
		// 控制排序次数
		for (int i = 0; i < array.length - 1; i++) {
			// 要冒泡的数组
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					// 进行交换
					array[j] = array[j] ^ array[j + 1];
					array[j + 1] = array[j+1] ^ array[j];
					array[j] = array[j] ^ array[j + 1];
				}
			}
		}
	}
	
	/*
	 * 冒泡排序的时间复杂度是O(n2)
	 * 
	 */
}
