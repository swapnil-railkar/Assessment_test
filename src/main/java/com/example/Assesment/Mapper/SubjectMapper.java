package com.example.Assesment.Mapper;

import com.example.Assesment.Dto.SubjectDto;
import com.example.Assesment.Entity.Subject;
import org.springframework.stereotype.Component;

@Component
public class SubjectMapper implements Mapper<SubjectDto, Subject> {

    @Override
    public Subject convertToEntity(final SubjectDto subjectDto) {
        return Subject.builder()
                .name(subjectDto.getName().toLowerCase())
                .build();
    }

    @Override
    public SubjectDto convertToDto(final Subject subject) {
        return SubjectDto.builder()
                .name(subject.getName())
                .build();
    }
}
