package br.edu.univas.si6.projeto_escolar.orm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private final String driver="org.postgresql.Driver";
	private final String url="jdbc:postgresql://localhost:5432/bd_escolar";
	private final String user="postgres";
	private final String password="abc123";
	private Connection con;
	
	public Conexao(){
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public Connection getConnection(){
		if(con==null){
			try {
				con=DriverManager.getConnection(url,user, password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return con;
	}
	public void desconectar(){
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		con=null;
	}
}
