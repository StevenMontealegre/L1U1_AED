package model;

public class Model {

	
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
	
	public double[] showNumbers()
	{
		double[] array = new double[n];
		switch(action) {
		case 1: array =generateRandomNumbers(n, min, max);
		break;
		case 2: array = generateSortNumbers(n, min, max);
		break;
		case 3: array = generatePercentageSorted(action, min, max, percentage);
		break;
		case 4: array = generateInverseSortNumbers(n, min, max);
		break;
		}
		return array;
		
	}
	
	//REQUIREMENTS MENU
	public double[] generateSortNumbers(int n, int min, int max)
	{
		double[] sorted = model.quickSort(model.generateNumbers(n, min, max), 0, n-1);
		return sorted;
		
	}
	
	public double[] generateRandomNumbers(int n, int min, int max)
	{
		double[] random = model.generateNumbers(n,min,max);
		return random;
	}
	
	public double[] generatePercentageSorted(int n, int min, int max, double percentage)
	{
		if(percentage>1)
		{
			percentage/=( percentage/100);
		}
		double[] array = model.quickSort(model.generateNumbers(n, min, max), 0, n-1);
		array = model.sortPercentage(array, percentage);
		return array;
	}
	
	public double[] generateInverseSortNumbers(int n, int min, int max)
	{
		double[] array = model.quickSort(model.generateNumbers(n, min, max),0, n-1);
		array = model.invertArray(array);
		return array;
	}

}
