package com.jy;

import java.util.Arrays;

public class StraightSelectSort {

	public static void main(String[] args) {
		DataWrap[] dataWraps = new DataWrap[] { new DataWrap(21, ""), new DataWrap(30, ""), new DataWrap(49, ""),
				new DataWrap(30, ""), new DataWrap(16, ""), new DataWrap(9, "") };

		System.out.println("排序前：" + Arrays.toString(dataWraps));

		straightSelectSort(dataWraps);
		System.out.println("*********************排序结束*********************");

		System.out.println("排序后（从小到大）：" + Arrays.toString(dataWraps));

	}

	/**
	 * 优化后的快速选择排序 每趟寻找到最值后只交换一次数据
	 * 
	 * @param dataWraps
	 *            待排序的数组
	 */
	public static void straightSelectSort(DataWrap[] dataWraps) {
		System.out.println("*********************开始排序*********************");
		int arrayLength = dataWraps.length;
		
		for (int i = 0; i < arrayLength; i++) {
			// 本趟比较中最小值在数组中的索引
			int minIndex = i;
			// 本趟比较从后面一个数开始
			for (int j = i + 1; j < arrayLength; j++) {
				// 寻找到本趟的最小值，并记录它的索引
				if (dataWraps[minIndex].compareTo(dataWraps[j]) > 0)
					minIndex = j;
			}
			// 每趟得出最小值后，只交换一次数据
			if (minIndex != i) {
				DataWrap temp = dataWraps[i];
				dataWraps[i] = dataWraps[minIndex];
				dataWraps[minIndex] = temp;
			}
			// 每一趟后都打印出当前的排序结果
			System.out.println(Arrays.toString(dataWraps));
		}
	}

}
