import java.util.Scanner;
public class CodeExample2 {
public static void main (String args[]){
    Scanner sc = new Scanner (System.in);
    String Firstname, Lastname, Name;
    int age;
    System.out.println("Enter your first name: ");
    Firstname = sc.nextLine();
    System.out.println("Enter your last name: ");
    Lastname = sc.nextLine();
    System.out.println("Enter your age: ");
    age = sc.nextInt();
    Name = Firstname+ " "+ Lastname;
    System.out.println("Your name is: "+ Name);
    System.out.println("Your age is: "+age);
    sc.close();
}   
}
