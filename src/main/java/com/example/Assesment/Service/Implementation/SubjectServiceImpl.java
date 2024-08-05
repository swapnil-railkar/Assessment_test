package com.example.Assesment.Service.Implementation;

import com.example.Assesment.Dto.SubjectDto;
import com.example.Assesment.Service.SubjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SubjectServiceImpl implements SubjectService {

    @Override
    public SubjectDto createSubject(SubjectDto subject) {
        return SubjectDto.builder()
                .name(subject.getName())
                .build();
    }

    @Override
    public List<SubjectDto> getAllSubjects() {
        return List.of(
                SubjectDto.builder()
                        .name("History")
                        .build(),
                SubjectDto.builder()
                        .name("Maths")
                        .build());
    }
}
