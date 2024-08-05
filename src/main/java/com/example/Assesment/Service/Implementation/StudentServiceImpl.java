package com.example.Assesment.Service.Implementation;

import com.example.Assesment.Dto.StudentDto;
import com.example.Assesment.Service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    @Override
    public StudentDto create(StudentDto student) {
        return StudentDto.builder()
                .name(student.getName())
                .address(student.getAddress())
                .build();
    }

    @Override
    public List<StudentDto> getAllStudents() {
        return List.of(
             StudentDto.builder()
                     .name("DummyUser1")
                     .address("ABC XYZ 123")
                     .build(),
                StudentDto.builder()
                        .name("DummyUser2")
                        .address("EFG UVW 123")
                        .build()
        );
    }
}
