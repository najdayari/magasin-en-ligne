package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connexion {
	
	Connection c=null ; 
	private String url="jdbc:mysql://localhost:3306/magasin_en_ligne";
	private String user="root";
	private String password="";
	private Statement st;
	
	public Statement getConnexion(){
		
try {
			
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			c=DriverManager.getConnection(url,user,password);
			st =c.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return st ;
		
		
	}
}
