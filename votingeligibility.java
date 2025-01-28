//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age >18 is eligible to vote.
import java.util.*;
public class votingeligibility {
    public static String checkEligibility(int age) {
        if (age >= 18) {
            return "Eligible to vote";
        } else { 
            return "Not eligible to vote";
        }
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int age = sc.nextInt();
        String result = checkEligibility(age);
        System.out.println("The person is: " + result);
    }
}
