package getstarted;

 class Hello {

	public static void main(String[] args) { // this is main method
		// this is one line comment 
		/*this is 
		 a multiple line 
		 comment
		 */
     System.out.print("Hello World");/* this is print statement*/
     // System.out.println(num);  here i am printing the variable before declare it this is called a scope 
     
     // variables 
     // numbers
         //whole numbers
         byte b=127; // 1 byte    -128/127
         short s =24535;// 2 bytes    -32000/32000
         int x=515315352; // 4bytes   -2147000000/+2147000000
         long l=254155556412364333L; // 8bytes   -2e1074/(2-2)e-52 2e1023
         
         //fractions
         float f=145633111.2554564f;// 4 bytes   6 to 7 decimals degits
         double d =1488662147611132.2514525877466;  //  8bytes    15 decimals degits
         // the double is bigger number than float 
         
         
      // characters  can be letters,numbers...
         char ch  =' '; // java consider a space as character 2bytes
         
         
     // chain of characters or Null
         String str= " ";  // in java a string can be null but the character never can be null 
  //  if you just put " " means java will  understand that as string that the null is just for string
         
         
         //true or false values
         boolean bool=true; // 1/4 byte (1bit)
         
         
        //  int 25age=12;  // i cannot start any variable name with number
         
         // in-line variable declaration and assignment
       // thisCamelCase 
         int ageOfADog=12; // a camel case that every new word start wsith capital letters
         
         // variable declaration which is declare var without value
         double doub;
         
         // variable assignment that is giving the value for the variable
         doub = 1.5;
         
         //variable reassignment  : i want to change the value of my variable 
         doub=5.4;
         
         int g,k,a,m;  // declare multiple variable in the same line
         g=2;
         k=8;
         
         
         // variable declaration
         int num;  
         
         
         //Variable assignment
         num =1234; 
         System.out.println(num);
         
      // variable reassignment
         num=25468;   
         System.out.println(num);
         
         // name of var start with lowercase like int maxSpeed which is string naming
	
         
    //final makes the variable immutable  never change     
 int age=20;  
	

	// String concatenation : add string to a value 
     System.out.println(5+9+"20"); // this is java logic its gonna say true 
     
     System.out.println(5!=3);   // ==  or !=
	
     // operators in java 
     // assignment: =
     String name="john";
     // arithmetic  ; +,-,+,/,%,++,--
     System.out.println(3+3); //6
     System.out.println(3-3);//0
     System.out.println(10/3);//3
     System.out.println(10*3);//30
     System.out.println(10%3);//1
     System.out.println(age++);// ++ will add 1 //21
     System.out.println(age--); //20-1=19
     //comparison:==,!=,>,<,>=,<=
     System.out.println(num);
     System.out.println(num);
     System.out.println(num);
     System.out.println(num);
     System.out.println(num);
     //logical: &&.||,! (and , or,not)
     
     
     
     
     
     
     
     
     
     
     
     
     
	}

}
