package com.mi.data_structure;

public class Select {

	public static void main(String[] args) {
		int[] arr = { 5, 4, 1, 6, 3, 2 };

		int count = 0;
		int temp = 0;
		// minIndex���ã� �����ڵڶ���ѭ���� ���ݽ����Ĵ���
		int minIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[minIndex]) {
					minIndex = j;
					count++;
				}
			}

			if (minIndex != i) {
				temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}

			System.out.print("��" + (i + 1) + "������ : ");
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j]);
			}
			System.out.println();
		}
		System.out.println("����ִ�д��� :" + count);

	}
}
