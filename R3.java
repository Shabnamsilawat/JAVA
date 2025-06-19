import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class R3 {
    public static boolean isValidPhoneNumber(String phoneNumber) {
        String regex = "^(\\d{3}[-\\s]?\\d{3}[-\\s]?\\d{4})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
}