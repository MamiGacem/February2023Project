package oops.inheritance.encapsulation;

public class UseMovie {
    public static void main(String[] args) {

        Movie lordOfRings=new Movie();
      //  lordOfRings.rating="PG" ; // the setter
      //  System.out.println(lordOfRings.rating);

        lordOfRings.setRating("NnsasR"); //this to set the variable
     System.out.println(lordOfRings.getRating());// to get and retrieve the value

        lordOfRings.setDuration(3);
     int a=3;
     int total=lordOfRings.getDuration()+a;
     System.out.println(total);
    }
}
