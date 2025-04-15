package exception;

public class CustomException 
{

	public static void age(int age) throws LicenseException 
	{

		if (age > 18) 
		{
			System.out.println("Eligible for license");
		} else 
		{
			throw new LicenseException("Not eligible");

		}
	}

	public static void main(String[] args)
	{
		try 
		
		{
			CustomException.age(15);

		} 
		catch (LicenseException e) 
		{
			System.out.println(e);
		}
		System.out.println("rest of the code");
	}
}
