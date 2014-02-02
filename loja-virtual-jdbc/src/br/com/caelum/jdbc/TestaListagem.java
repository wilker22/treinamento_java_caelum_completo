package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaListagem {
	public static void main(String[] args) throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/loja-virtual", "SA", "");

		Statement createStatement = connection.createStatement();
		boolean resultado = createStatement.execute("SELECT * FROM Produto");
		ResultSet resultSet = createStatement.getResultSet();
		
		while(resultSet.next()){
			int id = resultSet.getInt("id");
			String nome = resultSet.getString("nome");
			String descricao = resultSet.getString("descricao");
			System.out.println(id);
			System.out.println(nome);
			System.out.println(descricao);
		}
		
		createStatement.close();
		resultSet.close();

		// se return true que dizer que temo algo para se fazer, false caso contrario
		System.out.println("Opá temos algo a ser feito ?" + resultado);
		
		connection.close();
	}
}