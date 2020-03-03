
public class ComboLock {
		
	
		private int currentNumber = 0;
		private int num1, num2, num3; 
		private boolean pos0 = true; 
		private boolean pos1, pos2, pos3 = false; 
		private boolean unlock = false; 
	 
		public ComboLock(int num1, int num2, int num3) {
			this.num1 = num1;
			this.num2 = num2;
			this.num3 = num3;
		}
		
		public void reset()
		 {
		  pos0 = true; 
		  pos1= false; 
		  pos2 = false; 
		  pos3 = false; 
		  }

		
		public void turnLeft(int ticks) {
			if (pos1==true);{
				currentNumber = (currentNumber + ticks);
				 if(currentNumber == num2) {
					 pos2 = true; 
				 }
				 else {
					 pos2 = false;
				 }
			}
		}

		public void turnRight(int ticks) {
			if (pos0) {
				currentNumber = (40 - ticks);
				if (currentNumber == num1) {
		            pos1 = true;
		            pos0 = false;
		        }
			}
			else {
				if(currentNumber - ticks > 0);{
					pos3 = true;
				}
			 {
					currentNumber = (40 - (ticks - currentNumber)); 
			          pos3 = false; 
			          if(currentNumber == num3){
			        	  pos3 = true;
			          }
				}
			}
		}
		public boolean open() {
			if (pos1&&pos2&&pos3) {
				unlock = true;
				System.out.println("ComboLock is Open");
			}
			else {
				unlock = false;
				System.out.println("Incorrect combination");
			}
			return unlock;
		}
		
		public int getCurrentNumber() {
			return currentNumber;
		}
		     
		    


		 
		
}
