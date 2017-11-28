package com.prikhodko.dbproject.repository;

import com.prikhodko.dbproject.domain.Student;
import com.prikhodko.dbproject.domain.criteria.StudentCriteria;

import java.sql.SQLException;
import java.util.List;

public interface StudentRepository {
    Student get(long id) ;

    long create(Student student);

    void update(Student student);

    Student findByName(String name);

    Student findByLastName(String name);

    Student findByMiddleName(String name);

    List<Student> findByCriteria(StudentCriteria criteria);

    List<Student> findAll();

    void delete(long id);

    void deleteAll();
}