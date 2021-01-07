package abc;

import java.io.File;
import java.io.IOException;

public class file1 {
	public static void main(String args[]) throws IOException 
	{
		
		try 
		{
		File f1= new File("abc.txt");
		if(f1.createNewFile())
		{
			System.out.println("File created: " + f1.getName());
		}
		else
		{
			System.out.println("File already exists.");
		}
		}
		catch(IOException e)
		{
			System.out.println("An error occurred.");
		      e.printStackTrace();
		}
				
	}

}
