import java.util.*;
public class CB1 {
    public static void main (String args[]){
        int n = 5;
        int pos = 2;
        int bitMask = 1<<pos;
        int notBitMask = ~(bitMask);
        int newnumber = notBitMask & n;
        System.out.println(newnumber);
    }
}
