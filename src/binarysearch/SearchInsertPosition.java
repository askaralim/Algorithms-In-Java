package binarysearch;

/*
 * https://leetcode.com/problems/search-insert-position/
 */
public class SearchInsertPosition {
	public int searchInsert(int[] nums, int target) {
		int first = 0;
		int last = nums.length - 1;

		while (first <= last) {
			int mid = first + (last - first) / 2;

			if (target == nums[mid]) {
				return mid;
			} else if (target < nums[mid]) {
				last = mid - 1;
			} else if (target > nums[mid]) {
				first = mid + 1;
			}
		}

		return first;
	}
}
