package model;

public class Model {

	
	public static final int MERGE = 1;
	public static final int QUICK = 2;
	public static final int HEAP = 3;
	
	private Order model;
	private int action;
	private int min;
	private int max;
	private int n;
	private double percentage;
	
	public Model()
	{
		model = new Order();
		this.action = 1;
	}
	
	public void setAction(int action, int min, int max, int n,double percentage)
	{
		this.min = min;
		this.max = max;
		this.n= n;
		this.action = action;
		this.percentage = percentage;
	}
	
	public double[] showNumbers(boolean rep)
	{
		double[] array = new double[n];
		if(rep)
		{
			System.out.println("Generated non repeated" );

			array = model.getRamdonNumbersWithoutRepetion(n, max, min);
		}else 
		{
			System.out.println("Generated  repeated" );
			array =model.generateNumbers(n, min, max);
		}
		
		switch(action) {
		case 1: array = array;
		break;
		case 2: array = generateSortNumbers(array,n, min, max);
		break;
		case 3: array = generateInverseSortNumbers(array,n, min, max);
		break;
		case 4: array = generatePercentageSorted(array,n, min, max, percentage);
		break;
		}
		return array;
		
	}
	
	//REQUIREMENTS MENU
	public double[] generateSortNumbers(double[] array,int n, int min, int max)
	{
		double[] sorted = model.quickSort(array, 0, n-1);
		return sorted;
		
	}
	
	
	public double[] generatePercentageSorted(double[] array,int n, int min, int max, double percentage)
	{
		if(percentage>1)
		{
			percentage/=( percentage/100);
		}
		double[] array2 = model.quickSort(array, 0, n-1);
		array = model.sortPercentage(array2, percentage);
		return array;
	}
	
	public double[] generateInverseSortNumbers(double[] array,int n, int min, int max)
	{
		double[] array2 = model.quickSort(array,0, n-1);
		array2 = model.invertArray(array2);
		return array;
	}
	
	public double[] sort(int mode, double[] a)
	{
		double[] array = a;
		switch(mode)
		{ case MERGE:  array =  model.mergeSort(array);	
		break;
		case QUICK:array=  model.quickSort(array,0, array.length-1);
		break;
		case HEAP: array =  model.heapSort(array);
		break;
		}
		
		return array;
	}

}
