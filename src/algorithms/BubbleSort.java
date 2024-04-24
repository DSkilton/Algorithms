package algorithms;

import java.util.Arrays;
import java.util.Collection;

public class BubbleSort {

	protected static <T extends Comparable<? super T>> void bubbleSort(Collection<T> collection) {
		T[] arr = (T[]) collection.toArray();
		int n = arr.length;
		boolean swapped;

		do {
			swapped = false;
			for (int i = 1; i < n; i++) {
				T temp = arr[i - 1];
				arr[i - 1] = arr[i];
				arr[i] = temp;
				swapped = true;
			}
			n--;
		} while (swapped);

		collection.clear();
		collection.addAll(Arrays.asList(arr));
	}

	private void bubbleSort(String[] toSort) {
		String temp;

		for (int i = 0; i < toSort.length; i++) {
			for (int j = i + 1; i < toSort.length; j++) {
				if (toSort[i].compareTo(toSort[j]) < 0) {
					temp = toSort[j];
					toSort[j] = toSort[i];
					toSort[i] = temp;
				}
			}
			System.out.print(toSort[i] + ", ");
		}
	}
    
}
