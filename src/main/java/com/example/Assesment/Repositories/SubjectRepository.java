package com.example.Assesment.Repositories;

import com.example.Assesment.Entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 *  Repo for Subject entity.
 */
public interface SubjectRepository extends JpaRepository<Subject, Long> {

    boolean existsByName(final String name);

    List<Subject> findByNameIn(final List<String> names);
}
