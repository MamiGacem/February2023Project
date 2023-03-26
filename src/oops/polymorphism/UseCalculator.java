package oops.polymorphism;

public class UseCalculator {
    public static void main(String[] args) {

        Calculator cal = new Calculator();
      cal.add(5,7,8);
     // cal.div(10,0); // an example of  run time error.

       ModernCalculator ncal = new ModernCalculator();
         ncal.add(5,5);
    }
}
