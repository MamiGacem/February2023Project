package classobjectsmethods;

public class UseHouse {

	public static void main(String[] args) {
		 String str=new String();
		House whiteHouse= new House(); //object of class
		System.out.println(whiteHouse.numberOfRooms); // we use the objects to access 
		System.out.println(whiteHouse.color);
		
		
		//print return method
		System.out.println(whiteHouse.livingroom());
		
		// print non return method
		// System.out.println(whiteHouse.kitchen()); // its not running because it doesn't have any value
	}

}
