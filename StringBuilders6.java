import java.util.Scanner;
public class StringBuilders6 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        StringBuilder sbarray[]= new StringBuilder[size];
        int totalLength =0;
        for(int i =0; i<size;i++){
            System.out.println("Enter string " + (i + 1) + ": ");
            sbarray[i] = new StringBuilder(sc.nextLine());
            totalLength += sbarray[i].length();
        }
      System.out.println(totalLength);
      sc.close();
        }
    }
    

