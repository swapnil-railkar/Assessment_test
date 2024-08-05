package com.example.Assesment.Service.Implementation;

import com.example.Assesment.Dto.SubjectDto;
import com.example.Assesment.Entity.Subject;
import com.example.Assesment.Mapper.SubjectMapper;
import com.example.Assesment.Repositories.SubjectRepository;
import com.example.Assesment.Service.SubjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private final SubjectRepository subjectRepository;
    @Autowired
    private final SubjectMapper subjectMapper;

    @Override
    public SubjectDto createSubject(final SubjectDto subjectDto) {
        final Subject savedSubject = subjectRepository.save(subjectMapper.convertToEntity(subjectDto));
        return subjectMapper.convertToDto(savedSubject);
    }

    @Override
    public List<SubjectDto> getAllSubjects() {
        return subjectRepository.findAll().stream()
                .map(subjectMapper::convertToDto)
                .toList();
    }
}
