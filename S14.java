public class S14 {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        sb.insert(1, " from StringBuffer");
        sb.delete(1, 30);
        sb.replace(2, 5, "y");
        String result = sb.toString();
        System.out.println(result);
    }
}
    

