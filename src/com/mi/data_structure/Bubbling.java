package com.mi.data_structure;

public class Bubbling {

	public static void main(String[] args) {
		int[] arr = { 5, 4, 1, 6, 3, 2 };
		bubblingWhlie(arr);
	}

	public static void bubblingWhlie(int[] arr) {
		int count = 0;
		int index = 0;
		int temp = 0;
		int all = 0;
		for (int i = arr.length - 2; i >= 0; i--) {
			index = arr[i];
			int j = i + 1;
			while (j < arr.length && arr[j] < index) {
				arr[j - 1] = arr[j];
				j++;
				count++;
				all++;
			}
			arr[j - 1] = index;
			System.out.print("第 " + (arr.length - 1 - i) + "次排序 : ");
			for (j = 0; j < arr.length; j++) {
				System.out.print(arr[j]);
			}
			System.out.println();
		}
		System.out.println("count : " + count);
		System.out.println("all : " + all);

	}

	public static void bubblingFor(int[] arr) {
		int count = 0;
		int index = 0;
		int temp = 0;
		int all = 0;
		for (int i = arr.length - 2; i >= 0; i--) {
			index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[index]) {
					temp = arr[j];
					arr[j] = arr[index];
					arr[index] = temp;
					index = j;
					count++;
				}
				all++;
			}
			System.out.print("第 " + (arr.length - 1 - i) + "次排序 : ");
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j]);
			}
			System.out.println();
		}
		System.out.println("count : " + count);
		System.out.println("all : " + all);
	}
}
