package com.example.Assesment.Service;

import com.example.Assesment.Dto.StudentDto;

import java.util.List;

public interface StudentService {

    /**
     *  This method is used to save new student in repository.
     */
    StudentDto create(final StudentDto studentDto);

    /**
     *  Get all students.
     */
    List<StudentDto> getAllStudents();
}
