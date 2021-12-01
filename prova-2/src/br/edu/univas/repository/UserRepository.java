package br.edu.univas.repository;

import br.edu.univas.configuration.DatabaseConfiguration;
import br.edu.univas.vo.User;

public class UserRepository {

	private DatabaseConfiguration databaseConfiguration = DatabaseConfiguration.getInstance();


	public void insert(User user) {
		System.out.println("Inserindo no banco de dados: " + databaseConfiguration.getDataBaseConnectionInfo());
		//proceed with insert object in database
	}
}
