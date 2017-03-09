/**
 * URL: https://www.hackerrank.com/challenges/gem-stones
 */
package com.github.davidherdu.HackerRank.Strings.Gemstones;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<HashSet<Character>> list = new ArrayList<HashSet<Character>>();
		for (int i = 0; i < n; i++) {
			String S = in.next();
			HashSet<Character> set = new HashSet<Character>();
			for (int j = 0; j < S.length(); j++) {
				set.add(S.charAt(j));
			}
			list.add(set);
		}
		int cont = 0;
		if (!list.isEmpty()) {
			HashSet<Character> firstSet = list.get(0);
			for (Character c : firstSet) {
				boolean isInOthers = true;
				for (int j = 1; j < list.size(); j++) {
					HashSet<Character> other = list.get(j);
					if (!other.contains(c)) {
						isInOthers = false;
						break;
					}
				}
				if (isInOthers) cont++;
			}
		}
		System.out.println(cont);
    }
}