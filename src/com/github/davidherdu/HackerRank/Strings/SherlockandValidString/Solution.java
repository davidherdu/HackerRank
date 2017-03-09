/**
 * URL: https://www.hackerrank.com/challenges/sherlock-and-valid-string
 */
package com.github.davidherdu.HackerRank.Strings.SherlockandValidString;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		String S = in.next();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < S.length(); i++) {
			if (map.containsKey(S.charAt(i))) {
				map.put(S.charAt(i), map.get(S.charAt(i)) + 1);
			} else {
				map.put(S.charAt(i), 1);
			}
		}
		Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		map.forEach((k, v) -> {
			if (map1.containsKey(v)) {
				map1.put(v, map1.get(v) + 1);
			} else {
				map1.put(v, 1);
			}
		});
		String result = "YES";
		if(map1.values().size() > 2) {
			result = "NO";
		} else {
			Integer[] values = map1.values().toArray(new Integer[0]);
			if(values.length == 2 && values[0] > 1 && values[1] > 1) {
				result = "NO";							
			}
		}
		System.out.println(result);
    }
}