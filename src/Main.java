//@Sergio Danilo Sabogal Quintin Autor

import java.sql.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Connection myConn = null;
        Statement myStamt = null;
        ResultSet myRes = null;

        try {
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebadatos", "root", "Sq1007156509");
            System.out.println("CONEXIÖN ESTABLECIDA....");

            myStamt  = myConn.createStatement();

            myRes = myStamt.executeQuery("SELECT * FROM clients");
            while (myRes.next()){
                System.out.println(myRes.getString("name"));
            }

            
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("FALLA EN LA CONEXIÓN....");

        }
    }

}