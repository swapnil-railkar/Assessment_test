package com.example.Assesment.Service;

import com.example.Assesment.Dto.SubjectDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SubjectService {

    /**
     *  This method is used to store new subject in repository.
     */
    SubjectDto createSubject(final SubjectDto subjectDto);

    /**
     *  This method is used to get all subjects.
     */
    List<SubjectDto> getAllSubjects();
}
