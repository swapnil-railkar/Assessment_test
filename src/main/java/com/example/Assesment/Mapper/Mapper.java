package com.example.Assesment.Mapper;

/**
 *  Mapper interface for conversion between entity and dto.
 * @param <T> Dto
 * @param <T1> Entity
 */
public interface Mapper<T, T1>{

    /**
     *  Convert dto to entity.
     * @param obj Dto obj
     * @return entity obj
     */
    T1 convertToEntity(T obj);

    /**
     *  Convert entity to dto.
     * @param obj Entity obj
     * @return Dto obj
     */
    T convertToDto(T1 obj);
}
