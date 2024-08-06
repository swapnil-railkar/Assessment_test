package com.example.Assesment.Service.Implementation;

import com.example.Assesment.Dto.StudentInfo;
import com.example.Assesment.Entity.Student;
import com.example.Assesment.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class StudentInfoService implements UserDetailsService {

    @Autowired
    private StudentRepository studentRepository;


    @Override
    public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {
        final Optional<Student> user = studentRepository.findByUserName(username);
        return user.map(StudentInfo::new)
                .orElseThrow(() -> new UsernameNotFoundException("user not found with username : " + username));
    }
}
