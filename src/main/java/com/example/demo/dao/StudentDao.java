package com.example.demo.dao;

import com.example.demo.model.Student;

public interface StudentDao {

    Integer insert(Student student);

    void update(Student student);

    Student deleteById(Integer id);

    Student getById(Integer id);
}
