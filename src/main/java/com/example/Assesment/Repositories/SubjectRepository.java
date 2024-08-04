package com.example.Assesment.Repositories;

import com.example.Assesment.Entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *  Repo for Subject entity.
 */
public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
