package encapsulation;

public class Class1 
{
	
	private int atmpin;
    public void setter(int atmpin)
 {
	 this.atmpin = atmpin;
 }
    
    public void getter()
     
       {
    	System.out.println(atmpin);
       }
 
   public void pin()
   {
	   if(atmpin ==1001 || 1234 || 1212)
		   
	   {
		   this.getter();
	   }
	   else
	   {
		   System.out.println("invalid");
	   }
   }
   
}


