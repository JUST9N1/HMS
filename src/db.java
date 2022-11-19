import java.sql.Connection;
import java.sql.DriverManager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khadk
 */
public class db {
    public static Connection connectsql(){

        try {
            String user="root";
            String pass = "root";
            String url = "jdbc:mysql://localhost:3306/test";

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, pass);
            return conn;
            

        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
        
    }
    public static void main(String[] args) {
        connectsql();
        System.out.println("sucess");
    
    }
}
