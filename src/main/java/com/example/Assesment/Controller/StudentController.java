package com.example.Assesment.Controller;

import com.example.Assesment.Dto.StudentDto;
import com.example.Assesment.Entity.Student;
import com.example.Assesment.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;


    @PostMapping("/addStudent")
    public StudentDto addStudent(@RequestBody Student student) {
        return studentService.create(student);
    }

    @GetMapping("/students")
    public List<StudentDto> getAllStudents() {
        return studentService.getAllStudents();
    }
}
