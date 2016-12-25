package sorting;

public class MergeSortFactory extends SortFactory {
	Printer printer = new Printer();
	@Override
	public int[] sort(int[] array) {
		int[] workSpace = new int[array.length];
		recMergeSort(array, workSpace, 0, array.length - 1);

		return array;
	}

	private void recMergeSort(int[] source, int[] workSpace, int lowerBound, int upperBound) {
		if (lowerBound == upperBound) {
			return;
		}
		else {
			int mid = (lowerBound + upperBound) / 2;
			recMergeSort(source, workSpace, lowerBound, mid);
			recMergeSort(source, workSpace, mid + 1, upperBound);
			merge(source, workSpace, lowerBound, mid + 1, upperBound);
			System.out.print("source   : "); printer.print(source);
			System.out.print("workSpace: "); printer.print(workSpace);
		}
	}

	private void merge(int[] source, int[] workPlace, int lowerIndex, int middleIndex, int upperIndex) {
		int j = 0;
		int low = lowerIndex;
		int mid = middleIndex - 1;
		int count = upperIndex - low + 1;

		while (lowerIndex <= mid && middleIndex <= upperIndex) {
			if (source[lowerIndex] < source[middleIndex]) {
				workPlace[j++] = source[lowerIndex++];
			}
			else {
				workPlace[j++] = source[middleIndex++];
			}
		}

		while (lowerIndex <= mid) {
			workPlace[j++] = source[lowerIndex++];
		}

		while (middleIndex <= upperIndex) {
			workPlace[j++] = source[middleIndex++];
		}

		for (j = 0; j < count; j++) {
			source[low + j] = workPlace[j];
		}
	}
}