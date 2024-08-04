package com.example.Assesment.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 *  Subject entity.
 */
@Getter
@Setter
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "subject")
public class Subject implements Serializable {

    private static final long serialVersionUID = 4256128822521552717L;

    /**
     *  Primary key - auto generated.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     *  Subject name.
     */
    private String name;

    /**
     *  List of students subscribed to this subject.
     */
    @OneToMany
    @JoinColumn(name = "studentId", referencedColumnName = "id")
    private List<Student> students;

}
