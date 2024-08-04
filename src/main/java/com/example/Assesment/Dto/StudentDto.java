package com.example.Assesment.Dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

/**
 *  Wrapper class for student entity.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudentDto implements Serializable {

    private static final long serialVersionUID = 4256128822521552717L;

    /**
     *  Student name.
     */
    private String name;

    /**
     *  Student address.
     */
    private String address;
}
