package twoPointer;

/*
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 */
public class TwoSumIIInputarrayissorted {
	public void run() {
		twoSum(new int[]{2,7,11,15,18,21}, 18);
	}
	public int[] twoSum(int[] numbers, int target) {
		int[] results = new int[2];

		int mid = numbers.length / 2;
		int last = numbers.length;

		if (numbers[mid] >= target) {
			last = mid;
		}

		int i = 0;
		int j = last - 1;

		while (i < last) {
			if (numbers[i] + numbers[j] > target) {
				j--;
			} else if (numbers[i] + numbers[j] < target) {
				i++;
			} else if (numbers[i] + numbers[j] == target) {
				results[0] = ++i;
				results[1] = ++j;

				break;
			}
		}

		return results;
	}
}
