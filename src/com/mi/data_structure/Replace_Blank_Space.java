package com.mi.data_structure;

public class Replace_Blank_Space {

	public static String replace(StringBuffer str) {
		int index = -1;
		if((index = str.indexOf(" ")) != -1) {
			str.deleteCharAt(index);
			str.insert(index, "%20");
			replace(str);
		}
		return str.toString();
	}
	
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("We Are Happy");
		System.out.println(replace(str));
	}
}
