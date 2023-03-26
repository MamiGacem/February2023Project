package oops.abstraction;

public interface Car {  /* the difference between interface and class :interface
    interface doesn't have implementation with no body */

    int maxspeed=160; // anytime you create in interface it is considred as final by default
    //method in interface are public by default
     void shape();  //method without body is abstract method

    void start();

     void brake();

}
