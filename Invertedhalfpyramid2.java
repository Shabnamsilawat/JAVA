//inverted half pyramid (rotated by 180 degree)
import java.util.*;
public class Invertedhalfpyramid2 {
    public static void main(String[] args) {
        int n= 4;
        //outer loop
        for (int  i = 1; i<=4; i++ ){
    //inner loop to print spaces
    for(int j=1; j<=n-i;j++){
        System.out.print(" ");
    }
    for(int j=1; j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
        }
    }
}
