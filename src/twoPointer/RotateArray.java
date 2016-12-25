package twoPointer;

/*
 * https://leetcode.com/problems/rotate-array/
 */
public class RotateArray {
	public void run() {
		rotate(new int[] { 1, 2 }, 2);
	}

	public void rotate(int[] nums, int k) {
		k %= nums.length;
		reverse(nums, 0, nums.length - k - 1);
		for (int num : nums) {
			System.out.print(num);
		}
		System.out.println();
		reverse(nums, nums.length - k, nums.length - 1);
		for (int num : nums) {
			System.out.print(num);
		}
		System.out.println();
		reverse(nums, 0, nums.length - 1);
		for (int num : nums) {
			System.out.print(num);
		}
		System.out.println();
	}

	public void reverse(int[] nums, int start, int end) {
		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}
}
