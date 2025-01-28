//Write a function that takes in the radius as input and return the circumference of a circle.
public class Circumference {
    public static double calculateCircumference(double radius){
        return 2*Math.PI*radius;
    }
    public static void main( String args[]){
        double radius = 5;
        double circumference= calculateCircumference(radius);
        System.out.println("The circumference of the circle is: "+ circumference);
    }
    
}
