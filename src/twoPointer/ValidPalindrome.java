package twoPointer;

/*
 * https://leetcode.com/problems/valid-palindrome/
 */
public class ValidPalindrome {
	public void run() {
		isPalindrome("ab");
	}

	public boolean isPalindrome(String s) {
		int j = s.length() - 1;
		int i = 0;

		while (i <= j) {
			while ((i <= j) && !isValidAlphanumeric(s.charAt(i))) {
				i++;
			}
			while ((i <= j) && !isValidAlphanumeric(s.charAt(j))) {
				j--;
			}

			if ((i <= j) && !compareAlphanumeric(s.charAt(i), s.charAt(j))) {
				return false;
			}

			i++;
			j--;
		}

		return true;
	}

	public boolean isValidAlphanumeric(char c) {
		int num = (int) c;
		if ((num >= 65 && num <= 90) || (num >= 97 && num <= 122)
			|| (num >= 48 && num <= 57)) {
			return true;
		}
		return false;
	}

	public boolean compareAlphanumeric(char a, char b) {
		int numA = (int) a;
		int numB = (int) b;

		if ((numA >= 31 && numA <= 39) || (numB >= 31 && numB <= 39)) {
			return false;
		}
		if (numA >= 97 && numA <= 122) {
			numA -= 32;
		}
		if (numB >= 97 && numB <= 122) {
			numB -= 32;
		}

		return numA == numB;
	}
}
