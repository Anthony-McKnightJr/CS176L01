import java.util.*;


class Venue
{
  
   boolean allSeats[][][];
  
  
   public Venue(int section, int row, int seat)
   {
       allSeats = new boolean [section][row][seat];
      

       for(int i=0; i<section; i++)
           for(int j=0; j<row; j++)
               for(int k=0; k<seat; k++)
                   allSeats[i][j][k] = false;
   }
  
   
   public boolean seatLookup(int section, int row, int seat)
   {
       if(allSeats[section][row][seat]==false) return false;
       return true;  
   }

    	


} 

