package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.bean.Student;
import com.example.demo.repo.StudentRepo;



@Controller
public class StudentController {
	@Autowired
	private StudentRepo repo;
	
	@GetMapping("/student")
	public String showHomePage() {
		return "index";
	}

	@PostMapping("/insert")
	public String insert(Student insert, Model model) {
		model.addAttribute("insert", insert);
		repo.save(insert);
		return "success";
	}
	@GetMapping("/viewStudents")
	public String viewStudent(Model model) {
		List<Student> studentList=new ArrayList<Student>();
		//studentList=repo.findAll();
		studentList=repo.findByName("midhun");
		model.addAttribute("list",studentList);
		return "view";
	}
}
