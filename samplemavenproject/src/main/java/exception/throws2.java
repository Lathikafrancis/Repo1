package exception;

import java.io.IOException;

public class throws2 {
	
	public static void print()throws IOException
	
	{
		throw new IOException();
	}

	public static void main(String[] args) throws IOException
	{

      throws2.print();

	}

}
