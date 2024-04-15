package myPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

public class Student {
    public void createDatabase() {

    }

    public void createTable() {

        //driver load

        //connection establishment
        try {
            String url = "jdbc:mysql://localhost:3306/DB";
            String username = "root";
            String password = "password";

            Connection conn = DriverManager.getConnection(url, username, password);

            //statement create

            Statement stm = conn.createStatement();

            //statement execute - query
            String query = "create table student (sid int(3), sname varchar(200), semail varchar(200))";
            stm.execute(query);
            System.out.println("Table Created Successfully");

            // connection close
            conn.close();


        } catch (Exception e ){
            e.printStackTrace();
        }


    }

    public void createData() {
        try {

            // Driver Manager

            // Connection Establishment
            String url = "jdbc:mysql://localhost:3306/";
            String db = "DB";
            String username = "root";
            String password = "password";

            Connection conn = DriverManager.getConnection(url+db,username,password);

            // Statement Creation
            Statement st = conn.createStatement();

            // Statement Execute - query
            String query = "INSERT into student (sid, sname, semail)  VALUES (?,?,?) ";
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setInt(1, 10);
            pstm.setString(2, "Jinks");
            pstm.setString(3, "jinks@gmail.com");

            pstm.execute();
//            pstm.executeUpdate(); : - To Update Values;
//            st.execute(query);
            System.out.println("Data Inserted Successfully");

            // Connection close
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void readData() {

        try {

//          Driver Manager : import java.util.DriverManager;

//          Connection Establishment :
            String url = "jdbc:mysql://localhost:3306/";
            String db = "DB";
            String username = "root";
            String password = "password";

//            import java.util.Connection;

            Connection conn = DriverManager.getConnection(url+db, username, password);

//            Statement Creation
//            import java.util.Statement;

            Statement st = conn.createStatement();

//            Statement Execution - query
            String query = "SELECT * FROM student";
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                System.out.println("id = " + rs.getInt(1));
                System.out.println("name = " + rs.getString(2));
                System.out.println("email = " + rs.getString(3));
            }

            System.out.println("Data Retrieved Successfully" );

//            Close Connection
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }



    }

    public void updateData() {

        try {
//            Driver Manager
//            import java.util.DriverManager;

//            Connection Establishment
//            import java.util.Connection;
            String url = "jdbc:mysql://localhost:3306/";
            String db = "DB";
            String username = "root";
            String password = "password";

            Connection conn = DriverManager.getConnection(url+db, username, password);

//            Statement creation
//            import java.util.Statement;
//            import java.util.prepareStatement;

//          Statement Execution - Query
            String query = "UPDATE student set sid = ? where sname = ?";

            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setInt(1, 11);
            pstm.setString(2, "Jinks");

            pstm.execute();
            System.out.println("Data Updated Successfully");

//            Connection close
            conn.close();






        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void deleteData() {
        try {

            // Connection Establishment
            String url = "jdbc:mysql://localhost:3306/DB";
            String username = "root";
            String password = "password";

            Connection conn = DriverManager.getConnection(url, username, password);

            // Statement creation
            PreparedStatement pstm = conn.prepareStatement("DELETE FROM student WHERE sid = ? AND sname = ? AND semail = ?");

            // Set values for placeholders
            pstm.setInt(1, 11); // Adjust these values as needed
            pstm.setString(2, "Jinks");
            pstm.setString(3, "jinks@gmail.com");

            // Statement execution
            pstm.execute();
            System.out.println("Data Deleted Successfully");

            // Connection Close
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
