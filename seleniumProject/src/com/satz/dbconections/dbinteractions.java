package com.satz.dbconections;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dbinteractions {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection connection =DriverManager.getConnection("jdbc:mysql://root@127.0.0.1/satz_2202");
	
     Statement statement =	connection.createStatement();
    ResultSet result = statement.executeQuery("SELECT * FROM `cmpny_detls`");
    while(result.next()) {
    System.out.println(result.getString(1));
     
    }

}
}
