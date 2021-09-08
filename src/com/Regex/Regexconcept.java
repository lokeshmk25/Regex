package com.Regex;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Regexconcept {
    public static void main(String[] args) {
       // UserName();
        Emailvalidation();

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
        System.out.println(pattern.matches("^(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[@#$%&]).{8,20}$", password));

    }
    public static void Emailvalidation() {
        List emails = new ArrayList();
        emails.add("lokeshmk25@gamil.com");
        emails.add("abc@yahoo.com");
        emails.add("abc-100@yahoo.com");
        emails.add("abc.100@yahoo.com");
        emails.add("abc111@abc.com");
        emails.add("abc-100@abc.net");
        emails.add("abc.100@abc.com.au");
        emails.add("abc@1.com");
        emails.add("abc@gmail.com.com");
        emails.add("abc2002@gmail.com");
        emails.add("abc%*.@gmail.com");
        emails.add("abc123@.com.com");
        emails.add("abc");
        emails.add("abc123@.com");
        emails.add("abc()*@gmail.com");
        emails.add("abc+100@gmail.com");
        String regex = "^[A-Za-z0-9+_.-]+@(?=.*[a-z])[a-z0-9][a-zA-Z0-9.-]+.{2,3}$";
        Pattern pattern = Pattern.compile(regex);
       //converting regex to predicate
        Predicate predicate = pattern.asPredicate();
        emails.forEach(n -> {if (predicate.test(n))System.out.println(n+ " is valid"); });
    }

}

