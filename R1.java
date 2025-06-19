import java.util.regex.*;

public class R1 {
    public static void main(String args[]) {
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]*");
        Matcher matcher = pattern.matcher("HelloWorld123");
        boolean result = matcher.matches();
        System.out.println(result);
    }
}