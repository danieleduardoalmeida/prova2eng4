package br.edu.univas.main;

import br.edu.univas.repository.StudentRepository;
import br.edu.univas.repository.UserRepository;
import br.edu.univas.vo.Student;
import br.edu.univas.vo.User;

public class Main {

	public static void main(String[] args) {
		StudentRepository studentRepository = new StudentRepository();
		Student student = new Student();
		student.setName("teste");
		student.setRa("teste");
		studentRepository.insert(student);
		
		UserRepository userRepository = new UserRepository();
		User user = new User();
		user.setName("teste");
		user.setPassword("teste");
		userRepository.insert(user);

	}

}
