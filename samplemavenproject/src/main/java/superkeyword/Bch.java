package superkeyword;

public class Bch extends Apa
{
   int a =10;

public static void main(String[] args) 
	{
	 Bch obj = new Bch();
     obj.show();
    }
public void show()
   {
	 System.out.println("welcome");
	 super.print();
	 super.display();
	 System.out.println(a);//child class instance variable
	 System.out.println(super.a);// parent class instance variable
   }
}
