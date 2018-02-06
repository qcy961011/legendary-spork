package com.mi.data_structure;

import java.util.ArrayList;

public class Linked_End_To_Start {

	public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> list = new ArrayList<>();
		if (listNode != null && listNode.next != null) {
			list = printListFromTailToHead(listNode.next);
		} 
		if(listNode != null) {
			list.add(listNode.val);
		}
		return list;
	}

	public static void main(String[] args) {
		
		System.out.println(printListFromTailToHead(null).toString());
	}
}

class ListNode {

	int val;
	ListNode next = null;

	public ListNode(int val) {
		super();
		this.val = val;
	}
}