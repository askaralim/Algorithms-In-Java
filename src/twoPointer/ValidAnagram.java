package twoPointer;

/*
 * https://leetcode.com/problems/valid-anagram/
 */
public class ValidAnagram {
	public void run() {
		System.out.println(isAnagram("nl", "cx"));
	}

	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}

		int[] freqs = new int[26];

		for (int i = 0; i < s.length(); i++) {
			freqs[s.charAt(i) - 'a'] ++;
		}

		for (int i = 0; i < t.length(); i++) {
			freqs[t.charAt(i) - 'a'] --;
		}

		for (int freq : freqs) {
			if (freq != 0) return false;
		}

		return true;
	}
}
