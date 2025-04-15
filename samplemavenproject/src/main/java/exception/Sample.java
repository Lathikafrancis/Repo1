package exception;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=5,b=20;
		int sum = a+b;
		//int arr[] = new int [5];
		//arr[10]=54;
		
		try
		{
			int res =5/0;
			int arr[]= new int [5];
			arr[10] = 54;
		}
		catch(ArithmeticException e)
		
		{
			System.out.println(e);
	    }
		catch(ArrayIndexOutOfBoundsException f)
		{
			System.out.println(f);
		
		}
	System.out.println(sum);
	}

}
