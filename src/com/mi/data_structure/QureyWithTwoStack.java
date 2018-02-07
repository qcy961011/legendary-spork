package com.mi.data_structure;

import java.util.Stack;

public class QureyWithTwoStack {
	
	private Stack<String> stack1 = new Stack<>();
	
	private Stack<String> stack2 = new Stack<>();
	
	public void posh(String s) {
		stack1.push(s);
	}
	
	public void pop() {
		if(stack2.isEmpty()) {
			while(!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		
		if(stack2.isEmpty()) {
			System.out.println("队列为空，删除失败");
		} else {
			System.out.println(stack2.pop());
		}
		
	}
	
	
	
	public static void main(String[] args) {
		QureyWithTwoStack q = new QureyWithTwoStack();
		q.posh("1");
		q.posh("2");
		q.posh("3");
		q.pop();
				
	}
}
