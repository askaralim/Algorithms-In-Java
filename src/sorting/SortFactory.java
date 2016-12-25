package sorting;


public abstract class SortFactory {
	public abstract int[] sort(int[] array);

	public void swap(int[] numbers, int i, int j) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}
}