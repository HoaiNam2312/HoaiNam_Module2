package ss19_string_regex.bai_tap.ValidateTenLopHoc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateTenLopHoc {
    public static void main(String[] args) {

        String tenLopHoc = "M0318G";

        String regex = "^[CAP]\\d{4}[GHIKLM]$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(tenLopHoc);
        System.out.println(matcher.matches());
    }
}
