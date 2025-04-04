package methodoverriding;

public class Bb extends Aa
{

	public static void main(String[] args)
	{
		Bb obj = new Bb();
		obj.print();
		obj.show(2, 3);
	}
    public void print()
    {
    	super.print();
    	System.out.println("method of class 2");
    }
    public void show(int a, int b)
    {
 	   super.show(5, 5);
 	   System.out.println("parameterised instance method of class 2");
    }
}
