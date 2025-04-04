package pack1;

public class BufferBuilderMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 StringBuffer a = new StringBuffer("Hello");
  a.append(" world"); // used to add string
  System.out.println(a);
  a.insert(6, "new"); // used to add string at any index position
  System.out.println(a);
  a.replace(0, 5, "good morning"); //used to replace a string, index last position plus one kodukkanam
  System.out.println(a);
  a.delete(13, 16);
  System.out.println(a); 
  System.out.println(a.reverse());
	
	}

}
