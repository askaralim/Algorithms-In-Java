package twoPointer;

/*
 * https://leetcode.com/problems/implement-strstr/
 * 
 * KMP will be better
 * https://www.topcoder.com/community/data-science/data-science-tutorials/introduction-to-string-searching-algorithms/
 */
public class ImplementStrStr {
	public void run() {
		System.out.println(strStr("mississippi", "issipi"));
	}

	public int strStr(String s, String needle) {
		if (s.length() == 0 && needle.length() == 0)
			return 0;

		if (needle.length() == 0)
			return 0;

		if (s.length() < needle.length())
			return -1;

		for (int i = 0; i <= s.length() - needle.length(); i++) {
			int temp = i;
			int j = 0;

			while ((temp < s.length()) && (s.charAt(temp) == needle.charAt(j))) {
				if (j == needle.length() - 1) {
					return temp - j;
				}

				temp++;
				j++;
			}
		}

		return -1;
	}
}