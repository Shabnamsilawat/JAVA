import java.util.*;
public class StringBuilder3 {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Shabnam");
        System.out.println(sb);
        sb.insert(0,'S');
        System.out.println(sb);
        sb.delete(0,1);
        System.out.println(sb);
    }
    
}
