package com.project.SMS;

import com.project.SMS.Entity.Student;
import com.project.SMS.Repositary.StudentRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SmsApplication.class, args);
	}
@Autowired
	StudentRepositary studentRepositary;
	@Override
	public void run(String... args) throws Exception {
//		Student student1=new Student("mani","sidaga","s.mani.k1436@gmail.com");
//		studentRepositary.save(student1);

	}
}
