package com.zc.sort;


import com.zc.util.AutomaticArray;

/** 
 * @Description: TODO
 * @author: zhangcheng
 * @date: 2019年3月1日 
 */
public class ShellSort {
	public static void main(String[] args) {
		int[] randomArray = AutomaticArray.produceRandomArray();
//		int[] randomArray = {34,54,1,453,7,2};
		long start = System.currentTimeMillis();
		sort(randomArray);
		long end = System.currentTimeMillis();
		System.out.println(end-start);
//		System.out.println(Arrays.toString(randomArray));
	}
	
	
	/*
	 * 希尔排序是插入排序的加强版，把每次需要往前移动一个位置变成动态的了，这个移动的量也在不停地由大缩小
	 * 
	 */
	public static void sort(int[] arr) {
		int j;
		int gap = arr.length;
		while((gap=gap/3-1)>=1) {
			for (int i = 1; i < arr.length; i++) {
				if(arr[i]<arr[i-1]) {
					int temp = arr[i];
					for (j = i-gap; j>-1&&arr[j]>temp; j-=gap) {
						arr[j+gap] = arr[j];
					}
					arr[j+gap] = temp;
				}
			}
		}
		
	}

}
