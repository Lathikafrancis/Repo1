package abstraction;

public class Contractor extends Employee {

	public void calculateSalary()
	   {
		  int paymentperhour =  100;
		  int H = 8;
		 int payment = paymentperhour*H;
		 System.out.println("Per day salary is " +payment);
	   }
	public static void main(String[] args)
	{
		Contractor obj = new Contractor();
		obj.calculateSalary();
   }

}
