package oops.inheritance.encapsulation;

public class Movie {
// global variable is the var belongs to the class
    // local variable is the one who belongs to the methodes or blocs

    //P  PG-13  R
 private String rating; // we have to create setter and getter to do the encapsulation
  private int duration;

    public int getDuration() {
        return duration;
    }
// this keyword makes reference to the global variable
    public void setDuration(int duration) {
       this.duration= duration;
// the local var goes first
    }

    //  String rating; // if it is not private
// private var + setter and getter = encapsulation
    // you can have access to private variable outside the class with encapsulation with getter and setter
    // getter
    public String getRating() {
        if (rating != "P" && rating != "PG" && rating != "PG-13" && rating != "R") {
            rating = "NR"; // not readed is NR
            return rating;
        }else{
            return rating;
        }
//  return rating without any informatios of the top just the variable not private
    }


// setter
    public void setRating(String rating) {
        this.rating = rating;
    }

}
