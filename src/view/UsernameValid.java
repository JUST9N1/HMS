package view;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsernameValid {
    private static final String regex = "^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$";
    
       public static boolean nameVerify(String email){
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
              System.out.println(nameVerify("John"));
       }
}
