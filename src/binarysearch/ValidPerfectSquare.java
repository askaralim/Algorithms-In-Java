package binarysearch;

/*
 * https://leetcode.com/problems/valid-perfect-square/
 */
public class ValidPerfectSquare {
	public void run() {
		System.out.println(isPerfectSquare(2147395600));
	}

	public boolean isPerfectSquare(int num) {
		int digit = 1;
		int power = 0;
		int temp = num;

		while (temp / 10 != 0) {
			temp = temp / 10;
			digit++;
		}

		if (digit % 2 != 0) {
			power = (digit - 1) / 2;
		}
		else if (digit % 2 == 0) {
			power = (digit - 2) / 2;
		}

		long left = (long) Math.pow(10, power);
		long right = (long) Math.pow(10, power + 1);

		while (left <= right) {
			long middle = left + (right - left) / 2;

			if (num == middle * middle) {
				return true;
			}
			if (num < middle * middle) {
				right = middle - 1;
			}
			else {
				left = middle + 1;
			}
		}

		return false;
	}
}