package multilevelinheritance;

public class C extends B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      C obj = new C();
      obj.print();
      obj.show();
      obj.display();
	}
	public void display()
	{
		System.out.println("Method of class c");
	}


}