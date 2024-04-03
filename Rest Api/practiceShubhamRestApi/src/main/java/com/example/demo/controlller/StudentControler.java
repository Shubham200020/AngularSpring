package com.example.demo.controlller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.POJO.Student;
import com.example.demo.reprositry.StudentRepo;

@RestController
@CrossOrigin("http://localhost:4200/")
public class StudentControler {
	@Autowired
	StudentRepo repo;

	@RequestMapping("/")
	public String home() {
		return "hello";
	}

	@GetMapping("/Students")
	public List<Student> getAllStudent() {
		List<Student> std = repo.findAll();
		return std;
	}

	@PostMapping("/add")
	public void addContent(@RequestBody Student std) {
		repo.save(std);
	}

	@GetMapping("/getby-roll/{id}")
	public Student findByRoll(@PathVariable int id) {
		Student st = repo.findById(id).get();
		return st;
	}

	@GetMapping("/getby-name/{name}")
	public List<Student> findByName(@PathVariable String name) {
		List<Student> st;
		st = repo.findByName(name);

		return st;
	}
}
