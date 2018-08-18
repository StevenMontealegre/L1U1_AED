package model;

import exceptions.ShortLongException;

public class Order {

	// MERGESORT RECURSIVE METHOD
	// Integer values version:

	public int[] integerMergeSort(int[] vector) throws ShortLongException {

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
		return vector;

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

	public double[] doubleMergeSort(double[] vector) throws ShortLongException {

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
		return vector;

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
}
