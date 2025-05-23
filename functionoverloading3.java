public class functionoverloading3 {
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
        int a= 10,b= 15, c=20;
        int result= add(a,b,c);
        System.out.println(result);
    }
    
}
