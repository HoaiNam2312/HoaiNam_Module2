package ss19_string_regex.thuc_hanh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_So_dien_thoai {
    public static void main(String[] args) {
//        String regex1 = "^09\\d{8}$";
//        Pattern pattern = Pattern.compile(regex1);
//        Matcher matcher = pattern.matcher("0900");
//        System.out.println(matcher.matches());

        String regex1 = "^\\(\\d{3}\\)\\.\\d{4}\\.\\(\\d{4}\\)$";
        Pattern pattern = Pattern.compile(regex1);
        Matcher matcher = pattern.matcher("(043).2688.(2445)");
        System.out.println(matcher.matches());
    }
}
