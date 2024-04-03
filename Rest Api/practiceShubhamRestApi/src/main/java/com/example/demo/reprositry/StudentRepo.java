package com.example.demo.reprositry;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.POJO.Student;
import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{
	public  List<Student> findByName(String name);
}
