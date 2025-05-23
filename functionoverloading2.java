public class functionoverloading2 {
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
        double a =5.5, b=10.5;
        double result = add(a,b);
        System.out.println(result);
    }
    
}
