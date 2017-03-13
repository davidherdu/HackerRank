/**
 * URL: https://www.hackerrank.com/challenges/tree-postorder-traversal
 */
package com.github.davidherdu.HackerRank.DataStructures.Trees.PostorderTraversal;

public class Solution {

	void postOrder(Node root) {
		if (root == null)
			return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}
}

class Node {
	int data;
	Node left;
	Node right;
}
