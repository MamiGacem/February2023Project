package switchstatement;

import java.util.Scanner;

public class SwitchStatemnt {

	public static void main(String[] args) {
		
		
		
        String day ="Monday";
        Scanner sc= new Scanner (System.in);
        System.out.println("Please enter a day:");
        day=sc.nextLine();
        
         switch (day) {
         case "Monday":
         System.out.println("school");
         
         case "Tuesday":
         System.out.println("review java");
         
         case "wedensday":
         System.out.println("do codelab");
         
         case "Thursday":
         System.out.println("do assignment");
         
         case "Friday":
         System.out.println("go gym");
         
         case "Satuday":
         System.out.println("practice java");
         
         case "Sunday":
         System.out.println("Submit assignmment ");
         
          break;
          default:
        	  System.out.println("Invalid dy");
         
}
	}

}
