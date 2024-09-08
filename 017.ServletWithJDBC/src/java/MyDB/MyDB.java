/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author LENOVO
 */
package MyDB;

import java.sql.*;

public class MyDB {

    public Connection con;
    private Statement statement;
    private ResultSet rs;

    public MyDB() {
        System.out.println("Hey hi");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbc?useTimeZone=true&serverTimezone=UTC&autoReconnect=true&useSSL=false"
                    + "", "root",
                    "root");
            System.out.println("Connection established.");
            statement = con.createStatement();
        } catch (ClassNotFoundException e) {
            System.out.println("Unable to connect");
        } catch (Exception se) {
            System.out.println("sql error!");
        }
    }

    public String displayWithbrowser() {
                System.out.println("display data");

        String dbdata = "<table>";
        try {
            rs = statement.executeQuery("Select * From tblclients");
            while (rs.next()) {
                dbdata += "<tr>" + "<td style='width:300px'>" + rs.getString(1) + "</td><td style='width:300px'>" + rs.getString(2) + "</td></tr>";

            }

        } catch (SQLException se) {
            System.out.println("sql error in display!");
        }
        return dbdata + "</table>";
    }

    public int insertdata(String name, String email) {
        System.out.println("insert data");
        try {
            statement.executeUpdate("INSERT INTO tblclients(name,email) Values('" + name + "','" + email + "')");

        } catch (SQLException se) {
            System.out.println("sql error in insertdata!"+ se);
        }
        return 1;
    }

    public void closecon() {
//        try {
//            con.close();
//        } catch (SQLException se) {
//            System.out.println("sql error!");
//        }

    }

}
