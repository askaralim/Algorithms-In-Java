package twoPointer;

/*
 * https://leetcode.com/problems/product-of-array-except-self/
 */
public class ProductofArrayExceptSelf {
	public void run() {
		int[] results = productExceptSelf(new int[] {1,2,3,4});

		for (int i : results) {
			System.out.print(i + " ");
		}
	}

	public int[] productExceptSelf(int[] nums) {
		int[] results = new int[nums.length];
		int left = 1;
		int right = 1;

		for (int i = 0; i < nums.length; i++) {
			results[i] = left;
			left = left * nums[i];
		}

		for (int i = nums.length - 1; i >= 0; i--) {
			results[i] = results[i] * right;
			right = right * nums[i];
		}

		return results;
	}
}
