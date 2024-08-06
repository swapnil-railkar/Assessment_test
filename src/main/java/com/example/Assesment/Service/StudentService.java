package com.example.Assesment.Service;

import com.example.Assesment.Dto.StudentDto;
import com.example.Assesment.Entity.Student;

import java.util.List;

public interface StudentService {

    /**
     *  This method is used to save new student in repository.
     */
    StudentDto create(final Student student);

    /**
     *  Get all students.
     */
    List<StudentDto> getAllStudents();
}
