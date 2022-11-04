package ss19_string_regex.thuc_hanh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {
    public static void main(String[] args) {
        String regex1 = "^([3-9][1-9]\\d*)|([1-9][1-9]\\d+)$";
        Pattern pattern = Pattern.compile(regex1);
        Matcher matcher = pattern.matcher("120");
        System.out.println(matcher.matches());
    }
}
