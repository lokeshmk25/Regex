package com.Regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexconcept {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name starts with cap and has minimum 3 charcters");
        System.out.println("Enter the firstname :");
        String  s=scanner.nextLine();
        Pattern pattern = Pattern.compile("[A-Z][a-z]{2,}");
        Matcher matcher = pattern.matcher(s);
        boolean ismatched=matcher.matches();

        System.out.println(ismatched);
    }
}
