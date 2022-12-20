package view;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class nameValid {
    private static final String regex = "^[A-Za-z]\\w{5,29}$";

   public static boolean nameVerify(String name){
    List<String> names = new ArrayList<String>();
    names.add(name);
    Pattern pattern = Pattern.compile(regex);
    for(String values : names){
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
    System.out.println("Enter a name");
    String email = sc.nextLine();
    if(nameVerify(email)){
        System.out.println("Name is valid");
    }else{
        System.out.println("Name is invalid");

    }
}
}
