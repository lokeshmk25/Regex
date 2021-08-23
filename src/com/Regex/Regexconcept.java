package com.Regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexconcept {
    public static void main(String[] args) {
        UserName();

    }
    public static void UserName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name starts with cap and has minimum 3 charcters");
        System.out.println("Enter the firstname :");
        String first = scanner.nextLine();
        System.out.println("Enter the lastname :");
        String last = scanner.nextLine();
        System.out.println("Enter emailid:");
        String email=scanner.nextLine();
        System.out.println("Enter the phonenumber with country code :");
        String phoneNo=scanner.nextLine();
        System.out.println("Enter the password :");
        String password=scanner.nextLine();
        Pattern pattern = Pattern.compile("[A-Z][a-z]{8,}");


        System.out.println(pattern.matches("[A-Z][a-z]{2,}", first));
        System.out.println(pattern.matches("[A-Z][a-z]{2,}",last));
       System.out.println(pattern.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$",email));
        System.out.println(pattern.matches("^+(0|91)?[7-9][0-9]{9}",phoneNo));
        System.out.println(pattern.matches("^[a-zA-Z]{8,}", password));
    }
}
