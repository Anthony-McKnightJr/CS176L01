import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Input {
	
	   public static void main(String args[])  {
		   try
	       {      
		   File f=new File("numbers.txt");
	           Scanner sc=new Scanner(f);
	           double total=0;
	           while(sc.hasNextDouble())
	           {
	               total= total +sc.nextDouble();
	               System.out.println(total);
	           }  
	          
	           
	           File output_file=new File("total.txt");
	           PrintWriter pw=new PrintWriter(output_file);
	           pw.print(total);
	           pw.close();
	           sc.close();
	       }
	           catch(FileNotFoundException e)
	           {
	               System.out.println("\nFile not found.\n");
	           }       
	       
	               
	              
	       }
}
