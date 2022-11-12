package bai_thi_2.utils;

import bai_thi.utils.AccountInvalidException;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexData2 {
    private static Scanner sc = new Scanner(System.in);

    public static String regexStr2(String temp, String regex, String error) {
        boolean check = true;
        do {
            if (temp.matches(regex)) {
                check = false;
            } else {
                System.out.println(error);
                temp = sc.nextLine();
            }
        } while (check);
        return temp;
    }

    public static String regexQuocGia(String temp, String regex, String error) {
        boolean check = true;
        do {
            if (!temp.matches(regex)) {
                check = false;
            } else {
                System.out.println(error);
                temp = sc.nextLine();
            }
        } while (check);
        return temp;
    }
}
