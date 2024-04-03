package com.example.demo.POJO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Studentinfo")
public class Student {
	
	@Id
	
	private int rollNo;
	@Column(name = "stname")
	private String name;
	@Column(name = "StBranch")
	private String branch;
	@Column(name = "StPercentage")
	private float percentage;
	public Student(int rollNo, String name, String branch, float percentage) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.branch = branch;
		this.percentage = percentage;
	}
	public Student() {
		super();
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "student [RollNo=" + rollNo + ", name=" + name + ", branch=" + branch + ", percentage=" + percentage
				+ "]";
	}
	
}
