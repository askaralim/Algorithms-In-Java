package twoPointer;

/*
 * https://leetcode.com/problems/container-with-most-water/
 */
public class ContainerWithMostWater {
	public void run() {
		System.out.println(maxArea(new int[] { 2, 3, 2, 1, 5, 4, 3 }));
	}

	public int maxArea(int[] height) {
		int max = 0;
		int i = 0;
		int j = height.length - 1;

		while (i < j) {
			max = Math.max(max, (j - i) * Math.min(height[i], height[j]));

			if (height[i] < height[j])
				i++;
			else
				j--;
		}

		return max;
	}
}
