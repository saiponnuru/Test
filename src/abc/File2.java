package abc;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		File f1= new File("D:\\videos\\abc.txt");
		try {
			if (f1.createNewFile())
			{
				System.out.println("file created");
			}
			else
			{
				System.out.println("already created");
			}
			
			FileWriter fw= new FileWriter("D:\\videos\\abc.txt");
			fw.write("Help");
			fw.close();
			
			FileReader fr= new FileReader("D:\\videos\\abc.txt");
			Scanner sc = new Scanner(fr);
			while (sc.hasNextLine())
			{
				String data = sc.nextLine();
		        System.out.println(data);
			}
			
			
		   } 
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		

	}

}
