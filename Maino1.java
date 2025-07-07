package Methodoverloadingandoverriding;

public class Maino1 {
    public static void main(String args[]){
        Shape2 square2 = new Square2();
        Shape2 circle2 = new Circle2();
        circle2.draw();
        square2.draw("Sqaure");
    }
}
