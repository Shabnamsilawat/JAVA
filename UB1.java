import java.util.Scanner;
public class UB1 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int pos = 1;
        System.out.println("Enter the operation 0 or 1: ");
        int oper = sc.nextInt();
        int bitMask = 1<<pos;
        if(oper==1){
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }else{
            int notBitMask = ~(bitMask);
            int newNumber = notBitMask & n;
            System.out.println(newNumber);
        }
        sc.close();
    }
}
