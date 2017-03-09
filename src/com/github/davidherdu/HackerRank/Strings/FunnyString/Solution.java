/**
 * URL: https://www.hackerrank.com/challenges/funny-string
 */
package com.github.davidherdu.HackerRank.Strings.FunnyString;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			String funny = "Funny";
			String S = in.next();
			for (int j = 1; j < S.length(); j++) {
				if (Math.abs(((int) S.charAt(j) - (int) S.charAt(j - 1))) != 
                    Math.abs(((int) S.charAt(S.length() - 1 - j) - (int) S.charAt(S.length() - j)))) {
					funny = "Not Funny";
					break;
				}
			}
			System.out.println(funny);
		}
    }
}