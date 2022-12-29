package view;

public class fullNameValid {
    private static final String regex = "^[A-Za-z]\\w{5,29}$";

   public static boolean nameVerify(String name){
    String[] names = name.split(" ");
    for(String values : names){
        if(!values.matches(regex)){
            return false;
        }
    }
    return true;
   }

   public static void main(String[] args) {
    String name = "John Doe";
    if(nameVerify(name)){
        System.out.println("Name is valid");
    }else{
        System.out.println("Name is invalid");

    }
}
}
