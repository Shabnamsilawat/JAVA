import java.util.Arrays;
public class Ar7 {
    public static void main(String args[]){
        int [] numbers = {5,2,8,1,9};
        System.out.println("Array length: "+ numbers.length);
        Arrays.sort(numbers);
        for(int number: numbers){
            System.out.println(number);
        }
        int SearchNumber = 8;
        int index = Arrays.binarySearch(numbers,SearchNumber);
        if(index>=0){
            System.out.println("Element "+ SearchNumber+ " found at "+ index);
        }else{
            System.out.println("Element"+ SearchNumber+ " not found ");
        }
    }
}
