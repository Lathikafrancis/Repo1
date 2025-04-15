package exception;

public class thorwsSample 
{
	public static void add()throws ArithmeticException
	
	{
		throw new ArithmeticException();
	}

	public static void main(String[] args)
	{
		thorwsSample.add();
	}

}
