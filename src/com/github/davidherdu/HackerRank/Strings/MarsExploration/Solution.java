/**
 * URL: https://www.hackerrank.com/challenges/mars-exploration
 */
package com.github.davidherdu.HackerRank.Strings.MarsExploration;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		String S = in.next();
		int cont = -1;
		if (S.length() % 3 == 0) {
			cont = 0;
			int num = S.length() / 3;
			for (int i = 0; i < num; i++) {
				String subS = S.substring(i * 3, (i + 1) * 3);
				char[] c = subS.toCharArray();
				if (c[0] != 'S') cont++;
				if (c[1] != 'O') cont++;
				if (c[2] != 'S') cont++;
			}
		}
		System.out.println(cont);
    }
}