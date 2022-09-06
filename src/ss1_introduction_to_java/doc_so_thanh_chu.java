package ss1_introduction_to_java;

import java.util.Scanner;

public class doc_so_thanh_chu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 1 số nguên có 3 chữ số bất kỳ: ");
        int so = sc.nextInt();
        String chu = "";
        if (so < 10) {
            switch (so) {
                case 0:
                    chu = "Zero";
                    break;
                case 1:
                    chu = "One";
                    ;
                    break;
                case 2:
                    chu = "Two";
                    break;
                case 3:
                    chu = "Three";
                    break;
                case 4:
                    chu = "Four";
                    break;
                case 5:
                    chu = "Five";
                    break;
                case 6:
                    chu = "Six";
                    break;
                case 7:
                    chu = "Seven";
                    break;
                case 8:
                    chu = "Eight";
                    break;
                case 9:
                    chu = "Nine";
                    break;
            }
        } else if (so < 20) {
            switch (so) {
                case 10:
                    chu = "Ten";
                    break;
                case 11:
                    chu = "Eleven";
                    break;
                case 12:
                    chu = "Twelve";
                    break;
                case 13:
                    chu = "Thirteen";
                    break;
                case 14:
                    chu = "Fourteen";
                    break;
                case 15:
                    chu = "Fifteen";
                    break;
                case 16:
                    chu = "Sixteen";
                    break;
                case 17:
                    chu = "Seventeen";
                    break;
                case 18:
                    chu = "Eighteen";
                    break;
                case 19:
                    chu = "Nineteen";
                    break;
            }
        } else if (so < 100) {
            switch (so / 10) {
                case 2:
                    chu = "Twemty";
                    break;
                case 3:
                    chu = "Thirty";
                    break;
                case 4:
                    chu = "Forty";
                    break;
                case 5:
                    chu = "Fifty";
                    break;
                case 6:
                    chu = "Sixty";
                    break;
                case 7:
                    chu = "Seventy";
                    break;
                case 8:
                    chu = "Eightty";
                    break;
                case 9:
                    chu = "Ninety";
                    break;
            }
            switch (so % 10) {
                case 1:
                    chu += "-one";
                    break;
                case 2:
                    chu += "-two";
                    break;
                case 3:
                    chu += "-three";
                    break;
                case 4:
                    chu += "-four";
                    break;
                case 5:
                    chu += "-five";
                    break;
                case 6:
                    chu += "-six";
                    break;
                case 7:
                    chu += "-seven";
                    break;
                case 8:
                    chu += "-eight";
                    break;
                case 9:
                    chu += "-nine";
                    break;
            }
        } else {
            switch (so / 100) {
                case 1:
                    chu = "One hundred";
                    break;
                case 2:
                    chu = "Two hundred";
                    break;
                case 3:
                    chu = "Three hundred";
                    break;
                case 4:
                    chu = "Four hundred";
                    break;
                case 5:
                    chu = "Five hundred";
                    break;
                case 6:
                    chu = "Six hundred";
                    break;
                case 7:
                    chu = "Seven hundred";
                    break;
                case 8:
                    chu = "Eight hundred";
                    break;
                case 9:
                    chu = "Nine hundred";
                    break;
            }
            if ((so % 100) < 10) {
                switch (so % 100) {
                    case 1:
                        chu += " One";
                        break;
                    case 2:
                        chu += " Two";
                        break;
                    case 3:
                        chu += " Three";
                        break;
                    case 4:
                        chu += " Four";
                        break;
                    case 5:
                        chu += " Five";
                        break;
                    case 6:
                        chu += " Six";
                        break;
                    case 7:
                        chu += " Seven";
                        break;
                    case 8:
                        chu += " Eight";
                        break;
                    case 9:
                        chu += " Nine";
                        break;
                }
            } else if ((so % 100) < 20) {
                switch (so % 100) {
                    case 10:
                        chu += " Ten";
                        break;
                    case 11:
                        chu += " Eleven";
                        break;
                    case 12:
                        chu += " Twelve";
                        break;
                    case 13:
                        chu += " Thirteen";
                        break;
                    case 14:
                        chu += " Fourteen";
                        break;
                    case 15:
                        chu += " Fifteen";
                        break;
                    case 16:
                        chu += " Sixteen";
                        break;
                    case 17:
                        chu += " Seventeen";
                        break;
                    case 18:
                        chu += " Eighteen";
                        break;
                    case 19:
                        chu += " Nineteen";
                        break;
                }
            } else {
                switch ((so % 100) / 10) {
                    case 2:
                        chu += " Twemty";
                        break;
                    case 3:
                        chu += " Thirty";
                        break;
                    case 4:
                        chu += " Forty";
                        break;
                    case 5:
                        chu += " Fifty";
                        break;
                    case 6:
                        chu += " Sixty";
                        break;
                    case 7:
                        chu += " Seventy";
                        break;
                    case 8:
                        chu += " Eightty";
                        break;
                    case 9:
                        chu += " Ninety";
                        break;
                }
                switch ((so % 100) % 10) {
                    case 1:
                        chu += "-one";
                        break;
                    case 2:
                        chu += "-two";
                        break;
                    case 3:
                        chu += "-three";
                        break;
                    case 4:
                        chu += "-four";
                        break;
                    case 5:
                        chu += "-five";
                        break;
                    case 6:
                        chu += "-six";
                        break;
                    case 7:
                        chu += "-seven";
                        break;
                    case 8:
                        chu += "-eight";
                        break;
                    case 9:
                        chu += "-nine";
                        break;
                }

            }
        }
        System.out.println("Có dạng chữ là: "+chu);
    }
}

