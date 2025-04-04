package accessspecifier;

public class access {
	
	public void publicmethod()
	{
		System.out.println("publicmethod");
	}

	private void privatemethod()
	{
		System.out.println("privatemethod");
	}
	void defaultmethod()
	{
		System.out.println("defaultmethod");
	}
	protected void protectedmethod()
	{
		System.out.println("protected method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		access obj = new access();
		obj.publicmethod();
		obj.privatemethod();
		obj.defaultmethod();
		obj.protectedmethod();

	}

}
