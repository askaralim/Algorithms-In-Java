package binarysearch;

/*
 * https://leetcode.com/problems/search-for-a-range/
 */
public class SearchForARange {
	public int[] searchRange(int[] nums, int target) {
		return searchRange(nums, 0, nums.length - 1, target);
	}

	public int[] searchRange(int[] nums, int left, int right, int target) {
		if (left == right && nums[left] == target) {
			return new int[] { left, left };
		}
		else if (left == right && nums[left] != target) {
			return new int[] { -1, -1 };
		}

		int mid = left + (right - left) / 2;

		int[] leftRange = searchRange(nums, left, mid, target);
		int[] rightRange = searchRange(nums, mid + 1, right, target);

		if (leftRange[0] != -1 && rightRange[0] != -1) {
			return new int[] { leftRange[0], rightRange[1] };
		}
		else if (leftRange[0] == -1) {
			return rightRange;
		} 
		else return leftRange;
	}
}
