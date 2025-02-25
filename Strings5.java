import java.util.*;
public class Strings5 {
    public static void main (String args []){
        String firstname ="Shabnam";
        String lastname ="Silawat";
        String fullname = firstname + " "+ lastname;
        System.out.println(fullname.length());
        for(int i=0; i<fullname.length(); i++){
            System.out.println(fullname.charAt(i));
        }
    }
    
}
