package view;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class phoneValid {
    private static final String regex = "^(984|985|986|974|975|980|981|982|961|988|972|963)\\d{7}$";
    
    public static boolean phoneVerify(String email){
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
        System.out.println(phoneVerify("9843041037"));
    }
}
