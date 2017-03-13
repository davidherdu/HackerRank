/**
 * URL: https://www.hackerrank.com/challenges/tree-top-view
 */
package com.github.davidherdu.HackerRank.DataStructures.Trees.TopView;

public class Solution {

	void top_view(Node root) {
		printLeft(root.left);
		System.out.print(root.data + " ");
		printRight(root.right);
	}

	void printLeft(Node root) {
		if (root == null)
			return;
		printLeft(root.left);
		System.out.print(root.data + " ");
	}

	void printRight(Node root) {
		if (root == null)
			return;
		System.out.print(root.data + " ");
		printRight(root.right);
	}
}

class Node {
	int data;
	Node left;
	Node right;
}
