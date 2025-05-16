import java.util.Scanner;
public class ce1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting of the number: ");
        int start = sc.nextInt();
        System.out.println("Enter the ending of the number: ");
        int end = sc.nextInt();
        int sum =0;
        while(start<=end){
            if(start%2==0){
                sum+=start;
            }
            start++;
        }
        System.out.println(sum);
        sc.close();
    
    }
    
}
