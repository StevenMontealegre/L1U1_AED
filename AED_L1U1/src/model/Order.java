package model;

import exceptions.EmptyBoxException;

public class Order {
	
	
	public static final int INT = 0;
	public static final int DOUBLE = 1;
	
	
	private double[] array;
	private String result;
	private int min;
	private int max;

	public Order() {

		// TODO Auto-generated constructor stub
		setResult("");

	}
	
	public void say()
	{
		System.out.println("Yes");
	}
	
	// RANDOM GENERATION WITH NO ORDER
		// METHOD ----------------------------------------------------------------------------------------
		// It generates randomly an array of int and double numbers into a double array, within an specific range
		public double[] generateNumbers(int size, int min, int max)
		{
			array = new double[size];
			int type;
			this.min = min;
			this.max = max;
			
			for(int i = 0; i<size; i++)
			{
				type = (int)Math.floor(Math.random()*2);
				if(type == INT)
				{
					int b =  (int)Math.floor(Math.random()*(max-(min+1)) +min);
					array[i] = b;
				}
				else
				{
					array[i] = Math.random()*(max-(min+1)) +min;
				}
			}
			return array;
		}
		
	//RANDOM GENERATION WITH % OF SORTED NUMBERS 
	// It receives as parameter a sorted array and the percentage of disorder than the user wants. 
	// It changes the times needed, two elements of the array
	public double[] sortPercentage(double[] array, double percentage)
	{
		this.array = array;
		int k = (int)(array.length*percentage); 
		
		
		int index1;
		int index2;
		double temp;
		for(int i = 0; i<k/2; i++)
		{
			index1 = (int) Math.floor(Math.random() +(array.length-1));
			index2 = (int) Math.floor(Math.random() +(array.length-1));
			while(index1==index2)
			{
				index2 = (int) Math.floor(Math.random() +(array.length-1));
			}
			
			temp = array[index1];
			array[index1] = array[index2];
			array[index2] = temp;
		}
		
		return array;
		
	}
	
	//INVERSE ARRAY METHOD
	//It receives an array allready sorted and it changes all the position to invert it
	public double[] invertArray(double[] array)
	{
		this.array = array;
		int n = array.length;
		double[] inverted = new double[n];
		
		for(int i = 0; i<array.length;i++)
		{
			inverted[i] = array[n-i-1];
		}
		return inverted;
	}
	
	
	
	//QUICKSORT RECURSIVE
	//METHOD-----------------------------------------------------------------------------------------
	public double[] quickSort( double[] array, int min, int max)
	{
		this.array = array;
		
		double pivot = array[min];
		double temporal;
		int a = min; 
		int b = max;
		
		while(a<b)
		{
			while(array[a]<= pivot && a<b)
			{
				a++;
			}
			while(array[b]>pivot)
			{
				b--;
			}
			if(a<b)
			{
				temporal = array[a];
				array[a] = array[b];
				array[b] = temporal;
			}
		}
		
		array[min] = array[b];
		array[b] = pivot;
		if(min < b-1)
		{
			quickSort(array, min, b-1);
		}
		if(b+1 < max)
		{
			quickSort(array, b+1, max);
		}
		return array;
	}
	

	// MERGESORT RECURSIVE
	// METHOD-----------------------------------------------------------------------------------------
	// We consider that integers numbers are contain in doubles numbers, for
	// this reason we can use only one method:

	public static double[] mergeSort(double[] n) {
		int i = 1;
		for (i = 1; i < n.length; i *= 2) {
			for (int j = 0; j < n.length; j += i) {
				int p = i >> 1;
				auxMergeSort(n, j, j + p - 1, j + p, j + p + p - 1);
			}
		}
		auxMergeSort(n, 0, i / 2 - 1, i / 2, n.length);
		return n;
	}

	public static void auxMergeSort(double[] n, int a, double b, int c, int d) {
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
	// We consider that integers numbers are contain in doubles numbers, for
	// this reason we can use only one method:
	public static double[] heapSort(double arr[]) {
		int n = arr.length;

		// Build heap (rearrange array)
		for (int i = n / 2 - 1; i >= 0; i--)
			auxHeapSort(arr, n, i);

		// One by one extract an element from heap
		for (int i = n - 1; i >= 0; i--) {
			// Move current root to end
			double temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

			// call max heapify on the reduced heap
			auxHeapSort(arr, i, 0);

		}
		return arr;

	}

	// To heapify a subtree rooted with node i which is
	// an index in arr[]. n is size of heap
	public static void auxHeapSort(double arr[], int n, int i) {
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
			auxHeapSort(arr, n, largest);
		}
	}

<<<<<<< HEAD

	// PRINT
	// METHODS--------------------------------------------------------------------------------------------------------------
	public String printIntegers(int[] vector) {
=======
	public String printVector(double[] vector) {
>>>>>>> refs/remotes/origin/master

		for (int i = 0; i < vector.length; i++) {
			result = result + vector[i] + " ";

		}
		return result;
	}

	public void isDecimal(String[] cad) throws EmptyBoxException {

		for (int i = 0; i < cad.length; i++) {
			try {
				Double.parseDouble(cad[i]);

			} catch (NumberFormatException nfe) {
				throw new EmptyBoxException();
			}

		}

	}

	public double[] getRamdonNumbersWithoutRepetion(int tamanio, int cotaSuperior) {

		double[] ramdonVector = new double[tamanio];
		for (int i = 0; i < ramdonVector.length; i++) {
			double number = ((Math.random() * cotaSuperior)) + 1;
			number = Math.rint(number * 100) / 100;
			ramdonVector[i] = number;
			for (int j = 1; j < ramdonVector.length; j++) {
				if (number != ramdonVector[j - 1]) {
					ramdonVector[i] = number;
				}
			}

		}
		return ramdonVector;

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
