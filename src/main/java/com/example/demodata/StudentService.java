package com.example.demodata;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

@Service
public class StudentService{
	@Autowired
	private StudentRepository studentRepository;

	
	public List<Student> getAllStudents()
	{
		List<Student> students=new ArrayList<>();
		studentRepository.findAll().forEach(students::add);


		return students;
	}

	public Student getStudent(String id)
	{
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return studentRepository.findById(id)
								.orElse(null);
	}
	public void addStudent(Student student){
		studentRepository.save(student);
	}
	public void updateStudent( String id, Student student)
	{
		studentRepository.save(student);
	}
	public void deleteStudent(String id)
	{
		studentRepository.deleteById(id);
	}
}