package model;

public class Order {
	private String result;

	public Order() {
		// TODO Auto-generated constructor stub
		setResult("");

	}

	// MERGESORT RECURSIVE
	// METHOD-----------------------------------------------------------------------------------------
	// Integer values version:

	public static int[] integerMergeSort(int[] n) {
		int i = 1;
		for (i = 1; i < n.length; i *= 2) {
			for (int j = 0; j < n.length; j += i) {
				int p = i >> 1;
				integerMerge(n, j, j + p - 1, j + p, j + p + p - 1);
			}
		}
		integerMerge(n, 0, i / 2 - 1, i / 2, n.length);
		return n;
	}

	public static void integerMerge(int[] n, int a, int b, int c, int d) {
		d = Math.min(d, n.length - 1);
		int mer[] = new int[d - a + 1];
		int idx = 0;
		int or = a;
		while (idx < mer.length)
			if ((a > b ? false : (c > d ? true : n[a] <= n[c])))
				mer[idx++] = n[a++];
			else
				mer[idx++] = n[c++];

		for (int i = 0; i < mer.length; i++)
			n[or + i] = mer[i];
	}
	// double values
	// version:--------------------------------------------------------------------------------------

	public static double[] doubleMergeSort(double[] n) {
		int i = 1;
		for (i = 1; i < n.length; i *= 2) {
			for (int j = 0; j < n.length; j += i) {
				int p = i >> 1;
				doubleMerge(n, j, j + p - 1, j + p, j + p + p - 1);
			}
		}
		doubleMerge(n, 0, i / 2 - 1, i / 2, n.length);
		return n;
	}

	public static void doubleMerge(double[] n, int a, double b, int c, int d) {
		d = Math.min(d, n.length - 1);
		double mer[] = new double[d - a + 1];
		int idx = 0;
		int or = a;
		while (idx < mer.length)
			if ((a > b ? false : (c > d ? true : n[a] <= n[c])))
				mer[idx++] = n[a++];
			else
				mer[idx++] = n[c++];

		for (int i = 0; i < mer.length; i++)
			n[or + i] = mer[i];
	}
	// HEAPSORT RECURSIVE
	// METHOD:--------------------------------------------------------------------------------------------
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
	// For double
	// values:-----------------------------------------------------------------------------------------------

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

	// PRINT
	// METHODS--------------------------------------------------------------------------------------------------------------
	public String printIntegers(int[] vector) {

		for (int i = 0; i < vector.length; i++) {
			result = result + vector[i] + " ";

		}
		return result;
	}

	public String printDoubles(double[] vector) {

		for (int i = 0; i < vector.length; i++) {
			result = result + vector[i] + " ";

		}
		return result;
	}
	// GETTER AND
	// SETTER---------------------------------------------------------------------------------------------------------------

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}
