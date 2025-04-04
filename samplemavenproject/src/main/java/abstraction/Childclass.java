package abstraction;

public class Childclass extends Abstractclass {
	
	public void display()// body of abstract method
	{
		System.out.println("implementation of abstract method");
	}

	public static void main(String[] args) 
	{
      
		Childclass obj = new Childclass();
		obj.display();
		obj.show();

	}

}
