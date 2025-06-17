import java.util.ArrayList;
public class Ar4 {
   public static void main (String args[]){
    ArrayList<Integer>arr= new ArrayList<Integer>();
    int index =0;
    arr.add(10);
    arr.add(20);
    arr.add(20);
    arr.add(30);
    arr.add(40);
    arr.add(50);
    arr.remove(2);
    for(int Element: arr){
        System.out.println("Element at index "+ index+ " is "+ Element);
        index++;
    }
   } 
}
