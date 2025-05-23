public class funtionoverloading1 {
    public static int add(int a,int b){
        return a+b;
    }
    public static double add (double a , double b){
        return a+b;
    }
    public static int add (int a , int b, int c){
        return a+b+c;
    }
    public static void main(String args[]){
        int a = 5, b=10;
        int result = add(a,b);
        System.out.println(result);
        
    
}
}