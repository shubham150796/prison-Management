package prisonmanagement;

import java.sql.*;

public class Prisonmanagement {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbms?zeroDateTimeBehavior=convertToNull", "root", "123");
            System.out.println("Success");
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
