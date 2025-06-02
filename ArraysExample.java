import java.util.Arrays;
public class ArraysExample {
public static void main(String args[]){
    int [] numbers = {5,2,8,1,9};
    System.out.println("Array length:"+ numbers.length);
    //Sorting array
    Arrays.sort(numbers);
    for(int number: numbers){
        System.out.println(number);
    }
    //searching a number
    int searchNumber = 8;
    int index = Arrays.binarySearch(numbers, searchNumber);
    if(index>=0){
        System.out.println("Element: "+searchNumber+ "Found at index" + index);
    }else{
        System.out.println("Element: "+ searchNumber+ "Not found");
    }
} 
}
