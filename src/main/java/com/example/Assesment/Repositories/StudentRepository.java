package com.example.Assesment.Repositories;

import com.example.Assesment.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *  Repo for student entity.
 */
public interface StudentRepository extends JpaRepository<Student, Long> {
}
