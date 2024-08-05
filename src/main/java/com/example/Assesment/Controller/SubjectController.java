package com.example.Assesment.Controller;

import com.example.Assesment.Dto.SubjectDto;
import com.example.Assesment.Service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @PostMapping("/subjects")
    public SubjectDto addSubject(@RequestBody SubjectDto subject) {
        return subjectService.createSubject(subject);
    }

    @GetMapping("/subjects")
    public List<SubjectDto> getAllSubjects() {
        return subjectService.getAllSubjects();
    }
}
