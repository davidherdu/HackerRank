/**
 * URL: https://www.hackerrank.com/contests/w29/challenges/day-of-the-programmer
 */
package com.github.davidherdu.HackerRank.WeekofCode29.DayoftheProgrammer;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int y = in.nextInt();
		boolean isLeap = y <= 1918 ? isJulianLeapYear(y) : isGregorianLeapYear(y);
		String date = "";
		if (y == 1918) {
			date = "26.09.1918";
		} else {
			date = isLeap ? "12.09" : "13.09";
			date += "." + y;
		}
		System.out.println(date);
	}

	public static final boolean isGregorianLeapYear(int paramInt) {
		return (paramInt % 4 == 0) && ((paramInt % 100 != 0) || (paramInt % 400 == 0));
	}

	public static final boolean isJulianLeapYear(int paramInt) {
		return paramInt % 4 == 0;
	}
}