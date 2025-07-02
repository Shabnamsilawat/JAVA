package Abstraction;

public class Mainab2 {
   public static void main(String args[]){
    Shape square = new Square();
    square.draw();
    square.printDetails();
    System.out.println();
    Shape circle = new Circle();
    circle.draw();
    circle.printDetails();
   } 
}
