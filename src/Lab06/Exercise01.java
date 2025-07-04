package Lab06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise01 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[\\w-.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
        Matcher matcher = pattern.matcher("minhlam@gmail.com");

        System.out.println("Input String matches regex - " + matcher.matches());
    }
}

/*
    Input String matches regex - false
* */
