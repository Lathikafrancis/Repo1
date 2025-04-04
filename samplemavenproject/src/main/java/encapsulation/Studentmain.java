package encapsulation;

public class Studentmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj = new Student();
		obj.setMailid("lathika@gmail.com");
		obj.setName("lathika");
		obj.setRollno(30);
		System.out.println(obj.getMailid());
		System.out.println(obj.getName());
		System.out.println(obj.getRollno());

	}

}
