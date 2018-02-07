package com.mi.data_structure;

import java.util.ArrayList;
import java.util.List;

public class Tree_Solution {

	/**
	 * 二叉树还原入口方法
	 * @param pre
	 * @param in
	 * @return
	 */
	public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		TreeNode root = reConstrcuBinaryTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
		return root;
	}

	/**
	 * 将二叉树还原，将
	 * @param pre
	 * @param startPre
	 * @param endPre
	 * @param in
	 * @param startIn
	 * @param endIn
	 * @return
	 */
	private TreeNode reConstrcuBinaryTree(int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn) {
		if (startPre > endPre || startIn > endIn) {
			return null;
		}
		TreeNode root = new TreeNode(pre[startPre]);
		for (int i = startIn; i <= endIn; i++) {
			if (in[i] == pre[startPre]) {
				root.left = reConstrcuBinaryTree(pre, startPre + 1, startPre + i - startIn, in, startIn, i - 1);
				root.right = reConstrcuBinaryTree(  
	                    pre,i-startIn+startPre+1,endPre,in,i+1,endIn);
			}
		}

		return root;
	}

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public List<Integer> printRoot(TreeNode root,List<Integer> list){
		if(root.left != null) {
			printRoot(root.left , list);
		}
		if(root.right != null) {
			printRoot(root.right , list);
		}
		list.add(root.val);
		return list;
	}
	
	
	
	public static void main(String[] args) {
		int pre[] = {1,2,4,7,3,5,6,8};
		int in[] = {4,7,2,1,5,3,8,6};
		TreeNode root = new Tree_Solution().reConstructBinaryTree(pre, in);
		List<Integer> list = new ArrayList<>();
		list = new Tree_Solution().printRoot(root, list);
		for (Integer i : list) {
			System.out.print(i + "\t");
		}
	
	}
}