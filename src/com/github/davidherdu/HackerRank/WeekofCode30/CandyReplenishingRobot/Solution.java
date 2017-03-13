/**
 * URL: https://www.hackerrank.com/contests/w30/challenges/candy-replenishing-robot
 */
package com.github.davidherdu.HackerRank.WeekofCode30.CandyReplenishingRobot;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int t = in.nextInt();
		int[] c = new int[t];
		for (int c_i = 0; c_i < t; c_i++) {
			c[c_i] = in.nextInt();
		}
		int totalNewCandies = 0;
		int b = n;
		int aux = 0;
		for (int i = 0; i < t; i++) {
			b -= c[i];
			aux += c[i];
			if (b < 5 && i < t - 1) {
				totalNewCandies += aux;
				b = n;
				aux = 0;
			}
		}
		System.out.println(totalNewCandies);
	}

}
