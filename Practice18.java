//Print the table of a number input by the user
import java.util.*;
public class Practice18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<11; i++){
            System.out.println(i*n);
        }
    }
    
}
