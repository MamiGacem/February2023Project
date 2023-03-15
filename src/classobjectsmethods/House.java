package classobjectsmethods;

public class House {
	
	
	
	//class properties
	//variables
	int numberOfRooms=5;
	String color="white";
	
    // methods (Functions or bloc of code )
	void kitchen () {     // non return methods and all the others are return
		// body 
		System.out.println("Yummy yumm");
	}
	//return method
	String bathroom="value";
	String bathroom() {
		return "value";
	}
	int bedroom() {
		int numOfRooms=3;
		int numOfKitchen=2;
		int numberOfBathRooms=2;
		int totalOfRooms=numOfRooms+numOfKitchen+numberOfBathRooms;
		return totalOfRooms;
		
	}
	double livingroom() {
		return 1.254864;
		
	}
	byte room1() {
		return 124;
		
	}
    short room2() {
		return 15448;
    	
    }
    long room3() {
		return 5216461648756L;
    	
    }
    float room4() {
		return 1.25696F;
    	
    }
  char room5() {
		return '&';
    	
    }
    boolean room6() {
		return false;
    	
    }
}
