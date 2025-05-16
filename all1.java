//To pprint a number for the range 2-20 with the help of of if statement, for loop, while loop, do while loop, break statement and continue statement
import java.util.Scanner;
public class all1 {
 public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number between the range 2-20");
    int number = sc.nextInt();
    if(number<2||number>20){
        System.out.println("Invalid value");
    }
    System.out.println("Using for loop");
    for(int i = 1; i<=number; i++){
        System.out.println(i);
    }
    System.out.println("Using while loop");
    int counter = 1;
    while(counter<=number){
        System.out.println(counter);
        counter++;
    }
    System.out.println("Using do while loop");
    counter=1;
    do{
        System.out.println(counter);
        counter++;
    }while(counter<=number);
System.out.println("Using break statement");
for(int i =1; i<=number; i++){
    if(i==7){
        break;
    }
    System.out.println(i);
}
System.out.println("Using continue statement");
for(int i = 1; i<=number; i++){
    if (i==8){
        continue;
    }
    System.out.println(i);
}
sc.close();
 }   
}
