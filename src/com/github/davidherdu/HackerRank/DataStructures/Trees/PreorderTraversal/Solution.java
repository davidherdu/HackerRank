/**
 * URL: https://www.hackerrank.com/challenges/tree-preorder-traversal
 */
package com.github.davidherdu.HackerRank.DataStructures.Trees.PreorderTraversal;

public class Solution {

	void preOrder(Node root) {
		if (root == null)
			return;
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}
}

class Node {
	int data;
	Node left;
	Node right;
}
