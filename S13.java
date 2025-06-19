public class S13 {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.insert(5, " world");
        sb.replace(2, 5, "yy");
        String result = sb.toString();
        System.out.println(result);
    }
}
    
