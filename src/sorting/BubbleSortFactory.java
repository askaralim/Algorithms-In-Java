package sorting;


public class BubbleSortFactory extends SortFactory {

	@Override
	public int[] sort(int[] array) {
		int size = array.length;

		for (int out = size - 1; out > 0; out--) {
			for (int in = 0; in < out; in++) {
				if (array[in] > array[in + 1]) {
					swap(array, in, in + 1);
				}
			}
		}

		return array;
	}
}
