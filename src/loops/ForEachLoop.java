package loops;

public class ForEachLoop {

	public static void main(String[] args) {
		// Inhaced for loop , this loop does not use indexes ,it works with reassignment
		// its update a loop 
		
		int[]array= {9,7,0,1,2};
		
		/*for(int a:array) { // the array take every value in different iterations 
			System.out.println(a);*/
       for (int a:array) {  // from index to index  means indexes
			
			System.out.println(a);
			
		}
       String [] menu = {"Biriani","Couscous","Hummus","pulao"};
       for (String plate: menu) {
    	   System.out.println(plate);
       }
	}
}
