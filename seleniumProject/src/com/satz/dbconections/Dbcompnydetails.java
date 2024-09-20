package com.satz.dbconections;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Dbcompnydetails {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://root@127.0.0.1/satz_2202");
		
	    Statement statement =	connection.createStatement();
	    
	    ResultSet resultSet=   statement.executeQuery("SELECT * FROM `cmpny_detls`");
	    
	    Workbook workbook = new XSSFWorkbook();
	    Sheet sheet = workbook.createSheet();
	    
	    int rowindex=0;
	    
	    while(resultSet.next()) {
	    	Row row = sheet.createRow(rowindex++);
	    	row.createCell(0).setCellValue(resultSet.getString(1));
	    	row.createCell(1).setCellValue(resultSet.getString(2));
	    	
	    	System.out.println(resultSet.getString(1));
	    	System.out.println(resultSet.getString(2));
	    	
	    }
	    String filePath = "C:\\Users\\sathi\\OneDrive\\Desktop\\DataBase.xlsx";
	    FileOutputStream stream = new FileOutputStream(filePath);
	    workbook.write(stream);
	    workbook.close();
	    

	}

}
