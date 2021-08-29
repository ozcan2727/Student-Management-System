package net.snmz.sms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import net.snmz.sms.service.StudentService;


@NoArgsConstructor
@AllArgsConstructor
@Controller
public class StudentController {
    @Autowired
	private StudentService studentService;
	
//Öğrencileri listelemek ve model ve görünüm döndürmek için işleyici yöntemi
//Kısacası öğrencileri  gösterecek method
	@GetMapping("/students")
	public String listStudets(Model model) {
		model.addAttribute("students",studentService.getAllStudents());
		
		return "students";
	}
}
