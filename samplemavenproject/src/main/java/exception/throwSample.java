package exception;

public class throwSample 
{
	public static void sum()
	{
		int a=50;
		int b=10; 
		int c= a+b;
		if(c>30)
		{
			throw new ArithmeticException("Sum is greter than 30");
		}
		else
		{
			System.out.println("sum is less than 30");
		}
	}
	

	public static void main(String[] args)
	{
		throwSample.sum();
	}

}
