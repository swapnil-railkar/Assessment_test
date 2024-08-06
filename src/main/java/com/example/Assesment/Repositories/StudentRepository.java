package com.example.Assesment.Repositories;

import com.example.Assesment.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 *  Repo for student entity.
 */
public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Student> findByUserName(final String username);
}
