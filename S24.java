public class S24 {
   
    public static void main(String args[]) {
        String dashes = "-".repeat(7);
        String hello = "hello\n".repeat(3);
        System.out.print(dashes);
        System.out.print(hello);
        System.out.print(dashes);

        String result = hello.substring(0, hello.length() - 1);
        System.out.println(result);
    }
} 

