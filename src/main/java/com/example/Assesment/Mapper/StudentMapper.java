package com.example.Assesment.Mapper;

import com.example.Assesment.Dto.StudentDto;
import com.example.Assesment.Entity.Student;
import com.example.Assesment.Entity.Subject;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class StudentMapper implements Mapper<StudentDto, Student> {

    @Override
    public Student convertToEntity(final StudentDto studentDto) {
        return Student.builder()
                .name(studentDto.getName())
                .address(studentDto.getAddress())
                .build();

    }

    @Override
    public StudentDto convertToDto(final Student student) {
        final StudentDto studentDto =  StudentDto.builder()
                .name(student.getName())
                .address(student.getAddress())
                .build();

        if (!student.getSubjects().isEmpty()) {
            final List<String> subjects = student.getSubjects().stream()
                    .map(Subject::getName).toList();
            studentDto.setSubjects(subjects);
        }
        return studentDto;
    }
}
