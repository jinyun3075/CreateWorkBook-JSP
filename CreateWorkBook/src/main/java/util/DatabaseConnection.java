package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	public static Connection getConnection() {
		try {
			String dbURL="jdbc:mysql://localhost:3306/workbook";
			String dbID ="root";
			String dbPW="jindodo1";
			Class.forName("com.mysql.jdbc.Driver");// Ŭ���� ã��
			
			return DriverManager.getConnection(dbURL,dbID,dbPW);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}