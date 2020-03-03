
public class ComboLockTest {

	public static void main(String[] args) {
		ComboLock hs = new ComboLock(5,31,20);
		hs.turnRight(35);
		System.out.println(hs.getCurrentNumber());
		hs.turnLeft(26);
		System.out.println(hs.getCurrentNumber());
		hs.turnRight(51);
		System.out.println(hs.getCurrentNumber());
		System.out.println(hs.open());

		
		
		ComboLock ms = new ComboLock(5,31,20);
		ms.turnRight(35);
		System.out.println(ms.getCurrentNumber());
		ms.turnLeft(26);
		System.out.println(ms.getCurrentNumber());
		ms.turnRight(20);
		System.out.println(ms.getCurrentNumber());
		System.out.println(ms.open());
	}
	
	

}
