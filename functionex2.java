public class functionex2 {
    public static int add(int a, int b){
        return a+b;
    }
    public static void printMessage(String message){
    System.out.println("Message:"+ message);
    }
    public static void printMessage(int number){
        System.out.println("Number:"+number);
    }
    public static void main (String args[]){
        int a = 5, b=10;
        int result = add(a,b);
        System.out.println(result);
        printMessage(result);
        printMessage("Hello!");
    }
}
