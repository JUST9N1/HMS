package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class dateValid {
     static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

public static boolean dateVerify(String input) {
     try {
          format.parse(input);
          return true;
     }
     catch(ParseException e){
          return false;
     }
}
   public static void main(String[] args) {
    
    System.out.println(dateVerify("2000-12-12"));
   }
}
