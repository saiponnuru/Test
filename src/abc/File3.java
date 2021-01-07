package abc;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File3 {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		
		try
		{
		File f1 = new File ("D:\\videos\\abc1.txt");
		if(f1.exists())
			System.out.println("Already Exists");
		else
			f1.createNewFile();
		
		if(f1.exists())
		{
		FileWriter fw= new FileWriter("D:\\videos\\abc1.txt");
		fw.write("Hello");
		fw.close();
		}
		else
		{		
			System.out.println("Unable to Find the File");
		}
		
		if(f1.exists())
		{
		FileReader fw= new FileReader("D:\\videos\\abc1.txt");
	    Scanner sc = new Scanner(fw);
	    while (sc.hasNext())
	    {
            String data= sc.nextLine();
	    	System.out.println(data+"Hellomine");
		}
		}
		else
		{		
			System.out.println("Unable to Find the File");
		}
		
		}
		
		catch(IOException ie)
		{
			System.out.println("An error occurred.");
			ie.printStackTrace();
		}
		

	}
}


