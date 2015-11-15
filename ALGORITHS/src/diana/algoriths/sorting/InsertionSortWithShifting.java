package diana.algoriths.sorting;

import java.util.Arrays;

public class InsertionSortWithShifting {

	public static <T extends Comparable<? super T>> void sort(T[] array) {
		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0 && (array[j].compareTo(array[j - 1])) < 0; j--) {
				T temp = array[j];
				array[j] = array[j - 1];
				array[j - 1] = temp;
			}
		}
	}

	public static void sortWithSentinal(int[] array) {
		for (int i = array.length - 1; i > 0; i--) {
			if (array[i] < array[i - 1]) {
				int temp = array[i];
				array[i] = array[i - 1];
				array[i - 1] = temp;
			}
		}

		for (int i = 2; i < array.length; i++) {
			for (int j = i; array[j] < array[j - 1]; j--) {
				int temp = array[j];
				array[j] = array[j - 1];
				array[j - 1] = temp;
			}
		}
	}
	
	public static void main (String[] args) {
		
		Integer[] array = new Integer[]{1,38,9,34,23,22,31,12};
		
		sort(array);
		
		System.out.println(Arrays.toString(array));
		
	}
}
