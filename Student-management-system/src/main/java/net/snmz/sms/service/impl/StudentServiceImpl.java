package net.snmz.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import net.snmz.sms.entity.Student;
import net.snmz.sms.repository.StudentRepository;
import net.snmz.sms.service.StudentService;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;
	
	
	
	
	
	
	@Override
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll();
	}
}
