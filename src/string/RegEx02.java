package string;

//    https://regexone.com/
//    https://stackoverflow.com/questions/24304620/regular-expression-for-user-id/24304858#24304858

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx02 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("0\\d{11}");
        Matcher matcher = pattern.matcher("023456789012");

        System.out.println("Input String matches regex - " + matcher.matches());
    }
}

/*
    Input String matches regex - true
* */
