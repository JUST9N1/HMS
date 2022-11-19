package view;


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
    public static Connection connectmysqldb(){
        try{
            String username = "root";
            String password = "root";
            String url ="jdbc:mysql://localhost:3306/hms";
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            return conn;
        }
        catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
    
    public static void main(String[] args){
        System.out.println("Sucess");
        
    }
}
