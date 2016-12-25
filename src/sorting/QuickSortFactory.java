package sorting;

public class QuickSortFactory extends SortFactory {

	@Override
	public int[] sort(int[] array) {
		quickSort(array, 0, array.length - 1);
		return array;
	}

	void quickSort(int array[], int l, int r) {
		if (l < r) {
			// Swap(s[l], s[(l + r) / 2]); //将中间的这个数和第一个数交换 参见注1
			int i = l, j = r, x = array[l];
			while (i < j) {
				while (i < j && array[j] >= x)
					// 从右向左找第一个小于x的数
					j--;
				if (i < j)
					array[i++] = array[j];

				while (i < j && array[i] < x)
					// 从左向右找第一个大于等于x的数
					i++;
				if (i < j)
					array[j--] = array[i];
			}
			array[i] = x;
			quickSort(array, l, i - 1); // 递归调用
			quickSort(array, i + 1, r);
		}
	}
}
