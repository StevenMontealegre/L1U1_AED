package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exceptions.EmptyBoxException;
import model.Order;

class TestOrder {

	private Order model;

	public void setupSceneOne() {

		model = new Order();
	}

	@SuppressWarnings("static-access")
	@Test
	void testMergeOne() {
		setupSceneOne();
		double[] expected = { 5.1, 10.2, 15.3, 20.4, 25.5, 30.6, 35.7, 40.8, 45.9, 50.9, 55.8, 60.7, 65.6, 70.5, 75.4,
				80.3, 85.2, 90.1, 95.9, 100.8 };
		double[] actual = { 100.8, 95.9, 90.1, 85.2, 80.3, 75.4, 70.5, 65.6, 60.7, 55.8, 50.9, 45.9, 40.8, 35.7, 30.6,
				25.5, 20.4, 15.3, 10.2, 5.1 };
		model.mergeSort(actual);

		assertArrayEquals(expected, actual);

	}

	@SuppressWarnings("static-access")
	@Test
	void testMergeTwo() {
		setupSceneOne();
		double[] expected = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25,
				26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
		double[] actual = { 50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 10, 9,
				8, 7, 6, 5, 4, 3, 2, 1, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 19, 18, 17, 16, 15, 14, 13, 12, 11 };
		model.mergeSort(actual);

		assertArrayEquals(expected, actual);

	}

	@SuppressWarnings("static-access")
	@Test
	void testHeapOne() {
		setupSceneOne();
		double[] expected = { 5.5, 10.5, 15.5, 20.5, 25.5, 30.5, 35.5, 40.5, 45.5, 50.5, 55.5, 60.5, 65.5, 70.5, 75.5,
				80.5, 85.5, 90.5, 95.5, 100.5 };
		double[] actual = { 100.5, 95.5, 90.5, 85.5, 80.5, 75.5, 70.5, 65.5, 60.5, 55.5, 50.5, 45.5, 40.5, 35.5, 30.5,
				25.5, 20.5, 15.5, 10.5, 5.5 };
		model.heapSort(actual);

		assertArrayEquals(expected, actual);

	}

	@SuppressWarnings("static-access")
	@Test
	void testHeapTwo() {
		setupSceneOne();
		double[] expected = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25,
				26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
		double[] actual = { 50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 10, 9,
				8, 7, 6, 5, 4, 3, 2, 1, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 19, 18, 17, 16, 15, 14, 13, 12, 11 };
		model.heapSort(actual);

		assertArrayEquals(expected, actual);

	}

	@SuppressWarnings("static-access")
	@Test
	void testFailOne() {
		setupSceneOne();
		String[] actual = {};
		try {
			model.isDecimal(actual);
			fail("Se esperaba excepcion EmptyBoxException");
		} catch (EmptyBoxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
