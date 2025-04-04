package aggregation;

public class Student {
	int rollno;
	String name,subject;
	Address add;// reference variable
	
		public Student(int rollno, String name, String subject, Address add)
		{
			this.rollno = rollno;
			this.name = name;
			this.subject = subject;
			this.add = add;
		}
		public void display()
		{
		System.out.println(rollno);	
		System.out.println(name);
		System.out.println(subject);
		System.out.println(add.housenumber);
		System.out.println(add.housename);
		System.out.println(add.city);
		System.out.println(add.pincode);
		}
	

	public static void main(String[] args) 
	{
      
		Address obj = new Address(695004,40,"villa","Trivandrum");
		Student ob = new Student(30,"lathika","science", obj );
		ob.display();

	}

}
