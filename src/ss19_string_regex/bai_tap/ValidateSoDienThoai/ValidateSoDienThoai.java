package ss19_string_regex.bai_tap.ValidateSoDienThoai;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateSoDienThoai {
    public static void main(String[] args) {
        String sdt = "(84)-(0978489648)";
        String regex = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sdt);
        System.out.println(matcher.matches());
    }
}
