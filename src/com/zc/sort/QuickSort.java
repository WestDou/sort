package com.zc.sort;


import com.zc.util.AutomaticArray;

/**
 * @Description: 快速排序
 * @author: zhangcheng
 * @date: 2019年3月1日
 */
public class QuickSort {

	public static void main(String[] args) {
		int[] randomArray = AutomaticArray.produceRandomArray();
		long start = System.currentTimeMillis();
		sort(randomArray, 0, randomArray.length-1);
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}

	/*
	 * 跟归并的相同点是都用到了递归，不过一个是二分还有一个是自己定义的中间值，快排的思路是由大到小，但是归并法是由小到大
	 * 
	 */
	public static void sort(int[] arr, int left, int right) {
		if (left < right) {
			int mid = partition2(arr, left, right);
			sort(arr, left, mid - 1);
			sort(arr, mid + 1, right);
		}
	}

	// 这个返回的是中间那个所在的值，比如左边比5大，右边比5小，这个5就是中间所在的位置
	public static int partition2(int[] arr, int left, int right) {
		int partValue = arr[right];
		while (left < right) {
			while (left < right && arr[left] <= partValue) {
				left++;
			}
			while (arr[right] > partValue) {
				right--;
			}
			// 交换位置
			if (left < right) {
				arr[left] = arr[right] ^ arr[left];
				arr[right] = arr[left] ^ arr[right];
				arr[left] = arr[right] ^ arr[left];
			}
		}
		return left;

	}
}
