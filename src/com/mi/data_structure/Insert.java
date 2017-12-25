package com.mi.data_structure;

public class Insert {

	public static void main(String[] args) {
		int[] arr = { 5, 4, 1, 6, 3, 2 };
		int count = 0;
		int flag = 0;
		int j = 0;
		for (int i = 1; i < arr.length; i++) {
			flag = arr[i];
			j = i - 1;
			while (j > -1 && arr[j] > flag) {
				arr[j + 1] = arr[j];
				j--;
				count++;
			}
			arr[j + 1] = flag;

			System.out.print("第" + i + "次排序 : ");
			for (j = 0; j < arr.length; j++) {
				System.out.print(arr[j]);
			}
			System.out.println();
		}
		System.out.println("最终执行次数 :" + count);
	}
}
