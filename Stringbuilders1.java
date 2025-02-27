import java.util.*;
public class Stringbuilders1 {
    public static void main (String args[]){
        StringBuilder sb = new StringBuilder("Shabnam");
        System.out.println(sb);
        //To print index at 0
        System.out.println(sb.charAt(0));
        //To change the character at index 0
        sb.setCharAt(0, 'A');
        System.out.println(sb);
    
    }
    
}
