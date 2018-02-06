package com.mi.data_structure;

public class Tow_Array_Lookup {
	
	/**
	 * 此为有序数组的排列，查找时可以使用
	 * @param target
	 * @param array
	 * @return
	 */
	public static boolean find(int target, int[][] array) {
		int row = 0;
		int line = array[row].length - 1;
		while(true) {
			if(target < array[row][line]) {
				break;
			} else {
				row++;
				line--;
			}
		}
		for(int i = 0 ;i < line ; i++) {
			if(array[row][i] == target) {
				return true;
			}
		
		}
		System.out.println("row : " + row  + "line :" + line);
		return false;
	}
	
	public static void main(String[] args) {
		int array[][] = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		System.out.println(find1(7, array));
	}
	
	public static boolean find1(int target,int[][] array) {
		for(int i = 0 ;i < array.length ; i++) {
			for(int j = 0 ; j < array[i].length ; j++) {
				if(array[i][j] > target) {
					break;
				}
				if(array[i][j] == target) {
					return true;
				}
			}
		}
		return false;
	}
}
