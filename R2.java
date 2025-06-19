  import java.util.regex.*;

public class R2 {
    public static void main(String args[]) {
        Pattern pattern = Pattern.compile("[0-9]{6}");
        Matcher matcher = pattern.matcher("123456");
        boolean result = matcher.matches();
        System.out.println(result);
    }
}

