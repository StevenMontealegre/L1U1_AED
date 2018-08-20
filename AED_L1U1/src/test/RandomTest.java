package test;



import junit.framework.TestCase;
import model.RandomGen;

public class RandomTest extends TestCase{
	
	
	private RandomGen random;
	
	
	public void setUp()
	{
		random = new RandomGen();
	}
	
	
	public void testGenerateNumbers()
	{
		setUp();
		double[] array = random.generateNumbers(50, 40, 1500);
		assertEquals(50, array.length);
		for(int i = 0; i< 50; i++)
		{
			assertTrue(array[i] != 0 && array[i] > 39 && array[i] <1500);
		}
	}

}
