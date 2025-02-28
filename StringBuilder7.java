import java.util.Scanner;
public class StringBuilder7 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        StringBuilder names = new StringBuilder(name);
        System.out.println(names);
        names.setCharAt(1,'i');
        System.out.println(names);
        sc.close();

        }
    }
    

