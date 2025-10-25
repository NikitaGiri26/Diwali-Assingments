package com.demo.dao;

import java.util.List;
import com.demo.beans.Student;
import java.io.IOException;

public interface StudentDao {
    void saveAll(List<Student> slist) throws IOException;
    List<Student> readAll() throws IOException, ClassNotFoundException;
}
