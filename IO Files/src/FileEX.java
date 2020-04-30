import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileEX
{  
   public static void main(String args[])
   {              
       try
       {          
           //creating a file object
           File f=new File("numbers.txt");
          
           //creating scanner object
           Scanner sc=new Scanner(f);
          
           //variable to store the total
           double total=0;
          
           // scanning through the text file
           while(sc.hasNextDouble())
           {
               //getting a line of data, converted to double then added to the total
               total= total +sc.nextDouble();
              
           }      
           //opening a file for writing the output          
           File output_file=new File("total.txt");
          
           //creating PrintWriter object
           PrintWriter pw=new PrintWriter(output_file);
          
           //writing the output to the file
           pw.print(total);
          
           //closing the file and scanner
           pw.close();
           sc.close();
       }
              
       //catching exception
       catch(FileNotFoundException e)
       {
           System.out.println("\nFile not found.\n");
       }              
      
   }
}