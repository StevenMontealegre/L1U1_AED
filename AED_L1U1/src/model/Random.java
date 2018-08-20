package model;

public class Random {

	
	public static final int INT = 0;
	public static final int DOUBLE = 1;
	private double[] array;
	
	public Random()
	{
		
	}
	
	
	
	// RANDOM GENERATION
	// METHOD ----------------------------------------------------------------------------------------
	// It generates randomly an array of int and double numbers into a double array, within an specific range
	public double[] generateNumbers(int size, int min, int max)
	{
		array = new double[size];
		int type;
		
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
	
}
