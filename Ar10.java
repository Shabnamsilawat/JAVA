public class Ar10 {
    static int [] getArray(){
    return new int [] {1,2,3,4}; 
}
public static void main(String args[]){
    int [] arr = getArray();
    for(int i =0; i<arr.length;i++){
        System.out.println(arr[i]);
    }
}
}