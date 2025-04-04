package methodoverriding;

public class Aa {

	public void print()
	{
		System.out.println("hello");
	}
   public void show(int a, int b)
   {
	   int c = a+b;
	   System.out.println(c);
   }
}
