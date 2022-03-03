import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberExample {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String PhoneNumber_REGEX = "\\d{2}-\\d{10}";

    public PhoneNumberExample() {
        pattern = Pattern.compile(PhoneNumber_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
