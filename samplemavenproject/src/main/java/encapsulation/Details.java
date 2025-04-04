package encapsulation;

public class Details {

	public static void main(String[] args) {
		
		Employee obj = new Employee();// local aggregation
		obj.setter("Sam", "Engineer",50000);
		obj.getter();

	}

}
