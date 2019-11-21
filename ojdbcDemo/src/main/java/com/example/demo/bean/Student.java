package com.example.demo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name="TBL_SPRING_STUDENT")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "tbl_seq")
	@SequenceGenerator(sequenceName = "TBL_SPRING_SEQUENCE",allocationSize = 1,name = "tbl_seq")
	public int id;
	private String name;
	private String pass;


	public int getId() {
			return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}


}

