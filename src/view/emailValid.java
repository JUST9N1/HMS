package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class emailValid {
   private static final String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,}$";

   public static boolean emailVerify(String email){
    List<String> emails = new ArrayList<String>();
    emails.add(email);
    Pattern pattern = Pattern.compile(regex);
    for(String values : emails){
        Matcher matcher = pattern.matcher(values);
        if(matcher.matches()){
            return true;
        }else{
            return false;
        }
    }
    return false;
   }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a email");
    String email = sc.nextLine();
    if(emailVerify(email)){
        System.out.println("Email is valid");
    }else{
        System.out.println("Email is invalid");

    }

    // emailVerify("")
   }
}