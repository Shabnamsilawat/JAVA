/* Take 2 inputs from the user and print
•	a= b (equal)
•	a>b (a is greater)
•	a<b ( a is lesser) (using else if condition)
 */

import java.util.*;
public class Practice7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==b){
            System.out.println("A is equal to B");
        }else if(a>b){
            System.out.println("A is greater than b");
        }else{
            System.out.println("A is smaller than b");
        }
    }

    
}
