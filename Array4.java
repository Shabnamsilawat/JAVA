import java.util.ArrayList;
public class Array4 {
    public static void main(String args[]){
        ArrayList<Integer> arr= new ArrayList<Integer>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.remove(2);
        for(Integer element:arr){
            System.out.println(element);
        }
    }
}
