package superkeyword;

public class Constructor2 extends Constructor1{

	public static void main(String[] args)
	{
 
		Constructor2 obj = new Constructor2();
		Constructor2 obj1 = new Constructor2("hello");
	}
	
		public Constructor2()
		
		{
			super(10);
			System.out.println("Constructor of child");
		}
		public Constructor2(String a)
		{
			super();
			System.out.println(a);
		}

	}


