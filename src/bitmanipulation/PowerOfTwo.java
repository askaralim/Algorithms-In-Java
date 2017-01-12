package bitmanipulation;

/*
 * https://leetcode.com/problems/power-of-two/
 */
public class PowerOfTwo {
	public void run() {
		System.out.println(isPowerOfTwo(7));
	}

	/**
	 * 3: 0011, -4: 1100, -3: 1101
	 * 6: 0110, -7: 1001, -6: 1010
	 * num & -num: least significant non-zero digit
	 */
	public boolean isPowerOfTwo(int n) {
		return n > 0 && n == (n & -n);
	}
}