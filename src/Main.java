import sorting.QuickSortFactory;
import sorting.Sort;

public class Main {
	public static void main(String[] args) {
		new Main().runSort();
	}

	private void runSort() {
		int[] array = new int[] { 3, 1, 5, 6, 1, 2, 5, 6, 8, 9, 4, 0 };

		Sort sort = new Sort();

		sort.doSort(array, new QuickSortFactory());
	}
}
