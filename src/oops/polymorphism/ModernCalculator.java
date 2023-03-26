package oops.polymorphism;

public class ModernCalculator extends Calculator{
// method overriding is when 2 methods have the same name and same number of parameters but different body
   // and you have to inherit the current class with the original class
// also call runtime polymorphism

   @Override   // called annotation and  decoration in java tell java you use in the overriding method
    public void add(int a, int b) {
        int total = a + b+ 10;
        System.out.println(total);

    }
}
