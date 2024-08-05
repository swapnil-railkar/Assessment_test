package com.example.Assesment.Controller;

import com.example.Assesment.Dto.StudentDto;
import com.example.Assesment.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;


    @PostMapping("/students")
    public StudentDto addStudent(@RequestBody StudentDto studentDto) {
        return studentService.create(studentDto);
    }

    @GetMapping("/students")
    public List<StudentDto> getAllStudents() {
        return studentService.getAllStudents();
    }
}
