package binarysearch;

/*
 * https://leetcode.com/problems/guess-number-higher-or-lower/
 */
public class GuessNumberHigherorLower {
	public int guessNumber(int n) {
		int lo = 1, hi = n, mid = 0;
		while (lo <= hi) {
			mid = lo + (hi - lo) / 2;
			int guess = guess(mid);
			if (guess == 0)
				return mid;
			if (guess == -1)
				hi = mid - 1;
			else
				lo = mid + 1;
		}
		return 1;
	}

	/*
	 * You call a pre-defined API guess(int num) which returns 3 possible results (-1, 1, or 0):
	 * -1 : My number is lower
	 * 1 : My number is higher
	 * 0 : Congrats! You got it!
	 */
	private int guess(int num) {
		return 0;
	}
}