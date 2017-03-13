/**
 * URL: https://www.hackerrank.com/challenges/tree-inorder-traversal
 */
package com.github.davidherdu.HackerRank.DataStructures.Trees.InorderTraversal;

public class Solution {

	void inOrder(Node root) {
		if (root == null)
			return;
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}
}

class Node {
	int data;
	Node left;
	Node right;
}
