package interface1;

public class DemoChild implements Demo
{

	public static void main(String[] args) 
	{
		Demo obj = new DemoChild();//(interface) object = new childclass
         obj.sample();
         obj.show();
	}

	@Override
	public void sample() 
	{

    System.out.println("implementation of abstract method1");
		
	}

	@Override
	public void show() 
	{
     
		System.out.println("implementation of abstract method2");

	}

}
