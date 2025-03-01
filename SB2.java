import java.util.*;
public class SB2 {
    public static void main (String args[]){
        int n = 5;
        int pos = 1;
        int bitMask = 1<<pos;
        if((bitMask|n)==0){
            System.out.println("The bit was 0");
        }else{
            System.out.println("The bit was one");
        }
    }
    
}
