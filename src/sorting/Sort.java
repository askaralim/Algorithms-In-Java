package sorting;


public class Sort {
	Printer printer = new Printer();

	public void doSort(int[] array, SortFactory factory) {
		printer.print(array);

		factory.sort(array);

		printer.print(array);
	}
}
