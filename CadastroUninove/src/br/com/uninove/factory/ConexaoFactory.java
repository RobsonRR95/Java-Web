package br.com.uninove.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {
		
	private static final String USUARIO = "root";
	private static final String URL = "jdbc:mysql://localhost:3306/cadastrouninove";
	private static final String SENHA = "q1w2e3r4";
	
	public static Connection conectar() throws SQLException{
		try {
			
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
						
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro de conex�o");
		}
		Connection connection = DriverManager.getConnection(URL, USUARIO, SENHA);
		
		return connection;
	}
	/*
	public static void main(String [] args){
		try {
			Connection con = ConexaoFactory.conectar();
			System.out.println("Conectado");
		} catch (Exception e) {
			System.out.println("N�o Conectado");
			e.printStackTrace();
		}
	}
	*/
	
	
}