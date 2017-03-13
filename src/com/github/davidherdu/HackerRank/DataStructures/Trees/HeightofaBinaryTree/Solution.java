/**
 * URL: https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree
 */
package com.github.davidherdu.HackerRank.DataStructures.Trees.HeightofaBinaryTree;

public class Solution {

	static int height(Node root) {
		int right = (root.right == null ? 0 : 1 + height(root.right));
		int left = (root.left == null ? 0 : 1 + height(root.left));
		return Math.max(right, left);
	}
}

class Node {
	int data;
	Node left;
	Node right;
}
