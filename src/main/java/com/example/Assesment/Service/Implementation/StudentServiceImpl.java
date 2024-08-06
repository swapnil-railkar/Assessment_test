package com.example.Assesment.Service.Implementation;

import com.example.Assesment.Dto.StudentDto;
import com.example.Assesment.Entity.Student;
import com.example.Assesment.Entity.Subject;
import com.example.Assesment.Mapper.StudentMapper;
import com.example.Assesment.Repositories.StudentRepository;
import com.example.Assesment.Repositories.SubjectRepository;
import com.example.Assesment.Service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    @Autowired
    private final StudentRepository studentRepository;
    @Autowired
    private final StudentMapper studentMapper;
    @Autowired
    private final SubjectRepository subjectRepository;

    @Override
    public StudentDto create(final Student student) {
        if (Objects.nonNull(student.getSubjects())) {
            final List<String> subjectNames = student.getSubjects().stream()
                    .map(Subject::getName)
                    .map(String::toLowerCase)
                    .toList();
            validateSubjects(subjectNames);
            final List<Subject> subjects = subjectRepository.findByNameIn(subjectNames);
            student.setSubjects(subjects);
        }
        final Student savedStudent = studentRepository.save(student);
        return studentMapper.convertToDto(savedStudent);
    }

    private void validateSubjects(final List<String> subjects) {
        subjects.forEach(subject -> {
            if (!subjectRepository.existsByName(subject.toLowerCase())) {
                throw new IllegalStateException("Subject does not exists : " + subject);
            }
        });
    }

    @Override
    public List<StudentDto> getAllStudents() {
        return studentRepository.findAll().stream()
                .map(studentMapper::convertToDto)
                .toList();
    }
}
