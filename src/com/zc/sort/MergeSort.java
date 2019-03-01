package com.zc.sort;


import com.zc.util.AutomaticArray;

/**
 * @Description: 归并排序
 * @author: zhangcheng
 * @date: 2019年2月28日
 */
public class MergeSort {

	public static void main(String[] args) {
		int[] randomArray = AutomaticArray.produceRandomArray();
		int[] tempArr = new int[randomArray.length];
		long start = System.currentTimeMillis();
		sort(randomArray, 0, randomArray.length-1, tempArr);
		long end = System.currentTimeMillis();
		System.out.println(end-start);
//		System.out.println(Arrays.toString(randomArray));
	}

	/*
	 * 归并排序的时间复杂度为O(nlogn)
	 * 时间相对较快了
	 * 思想就是主要是用到了一个二分法，然后分完后合并的一个思想
	 * 
	 */
	public static void sort(int[] arr, int left, int right, int[] tempArr) {
		if (left < right) {
			int mid = (left + right) / 2;
			sort(arr, left, mid, tempArr);
			sort(arr, mid + 1, right, tempArr);
			merge(arr, left, mid, right, tempArr);
		}
	}

	private static void merge(int[] arr, int left, int mid, int right, int[] tempArr) {
		int k = left;
		int j = mid + 1;
		for (int i = left; i <= right; i++) {
			if (k > mid) {
				tempArr[i] = arr[j++];
			} else if (j > right) {
				tempArr[i] = arr[k++];
			} else if (arr[k] > arr[j]) {
				tempArr[i] = arr[j++];
			} else {
				tempArr[i] = arr[k++];
			}
		}
		for (int i = left; i <=right; i++) {
			arr[i] = tempArr[i];
		}

	}

}
