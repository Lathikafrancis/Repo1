package multipleinheritance1;

public class Childinterface implements Interface11 ,Interface22 
{

	public static void main(String[] args) 
	{
		Childinterface obj = new Childinterface();
        obj.display();
		obj.print();
	}

	@Override
	public void display() 
	{

    System.out.println("Value of A is "+ A);
		
	}

	@Override
	public void print() 
	{
    
		System.out.println("My name is "+ NAME);

	}

}
