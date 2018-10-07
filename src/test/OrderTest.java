package test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import exceptions.EmptyBoxException;
import junit.framework.TestCase;
import model.Order;

public class OrderTest extends TestCase{
	
	private Order order;
	private double[] array;
	private double[] array2;
	
	private Order model;

	public void setupSceneOne() {

		model = new Order();
	}
	public void setUp()
	{
		order = new Order();
		
	}
	
	public void setUp2()
	{
		order = new Order();
		array = new double[400];
		array2 = new double[400];
		
		for(int i = 0; i<array.length;i++)
		{
			array[i] = i+1;
			array[array.length-i-1] = i+1;
		}
	}
	
	
	
	@Test
	public void testInvertNumbers()
	{
		
		double[] normal = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		double[] inverted = {20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
		double[] result =  order.invertArray(normal);
		for(int i= 0; i<inverted.length; i++)
		{
			assertTrue(inverted[i] ==result[i]);
		}
		
	}
	
	@Test
	public void testGenerateNumbers()
	{
		setUp();
		double[] array = order.generateNumbers(50, 40, 1500);
		assertEquals(50, array.length);
		for(int i = 0; i< 50; i++)
		{
			assertTrue(array[i] != 0 && array[i] > 39 && array[i] <1500);
		}
	}
	
	@Test
	public void testQuickSort()
	{
		setUp();
		double[] array1 = {564.8216461335977,750.0,242.0,261.10595896105053,752.6944527282392,312.0,110.21765003464674,511.0336074520279,465.0,477.0,354.5040761490707,602.1697719553719,673.0,272.0,954.0,367.0,385.8263756584211,226.0,602.7015164799674,927.2025239574598,942.0,502.31632120367266,318.6133218338361,586.0,972.7761359181102,251.0,491.0,797.0,230.0,881.0,280.0,772.7918048952147,65.0,318.0,624.0,110.0,445.0,236.0,499.7252053556231,359.0,579.4703873580625,995.4764513083677,31.78196603034619,665.0,576.3310634209186,800.0,609.8658496123057,687.5970312521572,816.4478583238318,40.0};
		double[] array2 = {31.78196603034619,40.0,65.0,110.0,110.21765003464674,226.0,230.0,236.0,242.0,251.0,261.10595896105053,272.0,280.0,312.0,318.0,318.6133218338361,354.5040761490707,359.0,367.0,385.8263756584211,445.0,465.0,477.0,491.0,499.7252053556231,502.31632120367266,511.0336074520279,564.8216461335977,576.3310634209186,579.4703873580625,586.0,602.1697719553719,602.7015164799674,609.8658496123057,624.0,665.0,673.0,687.5970312521572,750.0,752.6944527282392,772.7918048952147,797.0,800.0,816.4478583238318,881.0,927.2025239574598,942.0,954.0,972.7761359181102,995.4764513083677};
		double[] arraySorted = order.quickSort(array1, 0, array1.length-1);


		for(int i = 0; i<array1.length; i++)
			{
			    assertEquals(array2[i], arraySorted[i]);
			}
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

//	@SuppressWarnings("static-access")
//	@Test
//	void testFailOne() {
//		setupSceneOne();
//		String[] actual = {};
//		try {
//			model.isDecimal(actual);
//			fail("Se esperaba excepcion EmptyBoxException");
//		} catch (EmptyBoxException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}

}



	
