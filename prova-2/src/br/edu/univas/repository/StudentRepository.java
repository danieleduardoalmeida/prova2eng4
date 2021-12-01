package br.edu.univas.repository;

import br.edu.univas.configuration.DatabaseConfiguration;
import br.edu.univas.vo.Student;

public class StudentRepository {

	private DatabaseConfiguration databaseConfiguration = DatabaseConfiguration.getInstance();


	public void insert(Student student) {
		System.out.println("Inserindo no banco de dados: " + databaseConfiguration.getDataBaseConnectionInfo());
	}
}
