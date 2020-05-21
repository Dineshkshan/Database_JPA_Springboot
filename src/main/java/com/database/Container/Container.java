package com.database.Container;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.database.Dao.StudentDao;
import com.database.Model.Student;

@RestController
public class Container 
{
	@Autowired
	StudentDao student;
	
	
	@GetMapping("/getall")
	@ResponseBody
	public List<Student> displayall()
	{
		return student.findAll();
	}
	
	@PostMapping("/insertstudent")
	public String insertstudent(@RequestBody Student stud)
	{
		student.save(stud);
		return "Student inserted successfully";
	}
	
	@PutMapping("/Updatestudent")
	@ResponseBody
	public String updatestudent(@RequestBody Student stud)
	{
		student.save(stud);
		return "Student data Updated";
	}
	
	@DeleteMapping("/deletestudent/{id}")
	@ResponseBody
	public String deletestudent(@PathVariable("id") int id)
	{
		student.deleteById(id);
		return "Student deleted";
	}
}
