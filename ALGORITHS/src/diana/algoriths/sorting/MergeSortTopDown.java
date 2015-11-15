package diana.algoriths.sorting;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MergeSortTopDown {

	public static <T extends Comparable<? super T>> void mergeSort(T[] toBeSorted) {
		mergeSort(toBeSorted, 0, toBeSorted.length - 1);
	}

	private static <T extends Comparable<? super T>> void mergeSort(T[] toBeSorted, int low, int high) {
		if (low < high) {
			// why unsigned right shift???
			// Read more about this
			// http://googleresearch.blogspot.in/2006/06/extra-extra-read-all-about-it-nearly.html
			int mid = (low + high) >>> 1;
			mergeSort(toBeSorted, low, mid);
			mergeSort(toBeSorted, mid + 1, high);
			merge(toBeSorted, low, mid, high);
		}
	}

	private static <T extends Comparable<? super T>> void merge(T[] toBeSorted, int low, int mid, int high) {
		//Copy to an auxiliary array 
		T[] aux = toBeSorted.clone();
		int index_firstHalf = low, index_secondHalf = mid + 1;
		for (int loopIndex = low; loopIndex <= high; loopIndex++) {

			if (index_firstHalf > mid)
				// First half is merged, add second half one by one
				toBeSorted[loopIndex] = aux[index_secondHalf++];
			else if (index_secondHalf > high)
				// Second half is merged, add first half one by one
				toBeSorted[loopIndex] = aux[index_firstHalf++];

			// else compare them, add whichever is lesser.
			else if (aux[index_firstHalf].compareTo(aux[index_secondHalf]) <= 0)
				toBeSorted[loopIndex] = aux[index_firstHalf++];
			else
				toBeSorted[loopIndex] = aux[index_secondHalf++];
		}
	}

	// Test program to read strings and sort them based on lexicographic
	// ordering
	public static void main(String[] args) {
		if (!(args.length == 1)) {
			System.out.println("correct usage : java MergeSortTopDown FileName");
			return;
		}

		try {
			String text = new Scanner(new File(args[0])).useDelimiter("\\A").next();
			String[] toBeSorted = text.trim().split("\\s+");
			mergeSort(toBeSorted);
			for (int i = 0; i < toBeSorted.length; i++) {
				System.out.println(toBeSorted[i]);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found " + new File(args[0]).getAbsolutePath());
		}
	}

}
