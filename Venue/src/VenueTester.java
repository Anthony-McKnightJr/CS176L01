import java.util.Random;

class VenueTester
{
   
   public static void main (String[] args)
   {
      
       Venue Barclays = new Venue(4, 5, 10);
      
       int section, row, seat;
       Random rand = new Random();
       for(int i=0; i<100; i++)
       {
           section = rand.nextInt(4);
           row = rand.nextInt(5);
           seat = rand.nextInt(10);
        
           boolean fg= Barclays.seatLookup (section,row,seat);
          

           if(fg==false)
           {
          
               System.out.println ((section+1) + "-" + (row+1) + "-" + (seat+1) + " seat awarded");
                Barclays.allSeats[section][row][seat] = true;
           }
           else
           {
               //Print seat taken if it was unavailable.
               System.out.println ((section+1) + "-" + (row+1) + "-" + (seat+1) + " seat taken");
           }
       }
}
}
