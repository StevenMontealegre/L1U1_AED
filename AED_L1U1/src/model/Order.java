package model;

import exceptions.ShortLongException;

public class Order {
	//
	// private int[] orderedIntegerArray;
	// private double[] orderedDoubleArray;
	//
	// public Order() {
	// // TODO Auto-generated constructor stub
	// orderedDoubleArray = new double[0];
	// orderedIntegerArray = new int[0];
	// }

	// MERGESORT RECURSIVE METHOD
	// Integer values version:

	static void integerMergeSort(int[] vector) throws ShortLongException {

		int n = vector.length;
		if (n < 2)
			throw new ShortLongException();
		int mid = n / 2;
		int left[] = new int[mid];
		int right[] = new int[n - mid];
		for (int i = 0; i < mid; i++)
			left[i] = vector[i];
		for (int i = mid; i < n; i++)
			right[i - mid] = vector[i];
		integerMergeSort(left);
		integerMergeSort(right);
		integerMerge(vector, left, right);

	}

	public static void integerMerge(int arr[], int left[], int right[]) {
		int nL = left.length;
		int nR = right.length;
		int i = 0, j = 0, k = 0;
		while (i < nL && j < nR) {
			if (left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[i];
				j++;
			}
			k++;
		}
		while (i < nL) {
			arr[k] = left[i];
			i++;
			k++;
		}
		while (j < nR) {
			arr[k] = right[j];
			j++;
			k++;
		}
	}

	// double values version:

	static void doubleMergeSort(double[] vector) throws ShortLongException {

		int n = vector.length;
		if (n < 2)
			throw new ShortLongException();
		int mid = n / 2;
		double left[] = new double[mid];
		double right[] = new double[n - mid];
		for (int i = 0; i < mid; i++)
			left[i] = vector[i];
		for (int i = mid; i < n; i++)
			right[i - mid] = vector[i];
		doubleMergeSort(left);
		doubleMergeSort(right);
		doubleMerge(vector, left, right);

	}

	public static void doubleMerge(double arr[], double left[], double right[]) {
		int nL = left.length;
		int nR = right.length;
		int i = 0, j = 0, k = 0;
		while (i < nL && j < nR) {
			if (left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[i];
				j++;
			}
			k++;
		}
		while (i < nL) {
			arr[k] = left[i];
			i++;
			k++;
		}
		while (j < nR) {
			arr[k] = right[j];
			j++;
			k++;
		}
	}
	// HEAPSORT RECURSIVE METHOD:
	// For integer values:

	static void integerHeapSort(int arr[]) {
		int n = arr.length;

		// Build heap (rearrange array)
		for (int i = n / 2 - 1; i >= 0; i--)
			integerHeap(arr, n, i);

		// One by one extract an element from heap
		for (int i = n - 1; i >= 0; i--) {
			// Move current root to end
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

			// call max heapify on the reduced heap
			integerHeap(arr, i, 0);

		}

	}

	// To heapify a subtree rooted with node i which is
	// an index in arr[]. n is size of heap
	public static void integerHeap(int arr[], int n, int i) {
		int largest = i; // Initialize largest as root
		int l = 2 * i + 1; // left = 2*i + 1
		int r = 2 * i + 2; // right = 2*i + 2

		// If left child is larger than root
		if (l < n && arr[l] > arr[largest])
			largest = l;

		// If right child is larger than largest so far
		if (r < n && arr[r] > arr[largest])
			largest = r;

		// If largest is not root
		if (largest != i) {
			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;

			// Recursively heapify the affected sub-tree
			integerHeap(arr, n, largest);
		}
	}
	// For double values:

	static void doubleHeapSort(double arr[]) {
		int n = arr.length;

		// Build heap (rearrange array)
		for (int i = n / 2 - 1; i >= 0; i--)
			doubleHeap(arr, n, i);

		// One by one extract an element from heap
		for (int i = n - 1; i >= 0; i--) {
			// Move current root to end
			double temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

			// call max heapify on the reduced heap
			doubleHeap(arr, i, 0);

		}

	}

	// To heapify a subtree rooted with node i which is
	// an index in arr[]. n is size of heap
	public static void doubleHeap(double arr[], int n, int i) {
		int largest = i; // Initialize largest as root
		int l = 2 * i + 1; // left = 2*i + 1
		int r = 2 * i + 2; // right = 2*i + 2

		// If left child is larger than root
		if (l < n && arr[l] > arr[largest])
			largest = l;

		// If right child is larger than largest so far
		if (r < n && arr[r] > arr[largest])
			largest = r;

		// If largest is not root
		if (largest != i) {
			double swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;

			// Recursively heapify the affected sub-tree
			doubleHeap(arr, n, largest);
		}
	}

	//
	// public int[] getOrderedIntegerArray() {
	// return orderedIntegerArray;
	// }
	//
	// public void setOrderedIntegerArray(int[] orderedIntegerArray) {
	// this.orderedIntegerArray = orderedIntegerArray;
	// }
	//
	// public double[] getOrderedDoubleArray() {
	// return orderedDoubleArray;
	// }
	//
	// public void setOrderedDoubleArray(double[] orderedDoubleArray) {
	// this.orderedDoubleArray = orderedDoubleArray;
	// }
}
