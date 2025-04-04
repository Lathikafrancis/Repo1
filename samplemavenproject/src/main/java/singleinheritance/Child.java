package singleinheritance;

public class Child extends Parent{ // inherit parent class

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Child obj = new Child();
		obj.show();
		obj.print();
		System.out.println(obj.a);
	}
		public void show()
		{
			System.out.println("Instance method of child class");
		}
		

	}


