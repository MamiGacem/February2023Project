package datatype;

public class Casting {
	public static void main(String[]args) {
		
		// up casting(or widening) goes from byte-char-int-long-float-double , the down one that java does not take care of it 
		int  a=10;    
		int  b=3;
		double c=a/b;  // it print 3.33 but if you put the a and b as int it print 3.0
		
		System.out.println(c);
		
		// down-casting should be done manually ( or narrowing)
		double  d=10;    
		double  f=3;
		int g =(int) (d/f);  //3  
		
		System.out.println(g);
		
		
		
		
		
		int z=1;
		double x=z;
		System.out.println("value of x="+x);  //1.0 this concept is string concatenation:string and +sign
		
		double h=1.25;
		int y=(int) h;
        System.out.println("value of y="+y);
		
	
}
}