import java.util.Scanner;
public class SWITCH6 {
 public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a grade:");
    String grade = sc.nextLine();
    switch(grade){
        case "A":
        System.out.println("Excellent");
        break;
        case "B":
        System.out.println("Good job");
        break;
        case "C":
        System.out.println("Could be better");
        break;
        case "D":
        System.out.println("Need for improvement");
        break;
        case "F":
        System.out.println("Better luck next time");
        break;
        default:
        System.out.println("Invalid input");
    }
    sc.close();
    }

 }   

