package finalkeyword;

public final class Sample 
{
 final int A = 20;// constant name be in caps, variable becomes constant as we are using final 
 final int B;// blank final variable or uninitialised final variable

//B=5;// blank final variable can be initialised only inside constructor
public Sample()
{
   B=5;
  
}
public final void print()
{
	System.out.println("final");
}

}