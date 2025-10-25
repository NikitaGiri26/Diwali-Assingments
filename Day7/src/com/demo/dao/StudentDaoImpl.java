package com.demo.dao;

import java.io.*;
import java.util.List;
import com.demo.beans.Student;

public class StudentDaoImpl implements StudentDao {
    private static final String FILE_NAME = "students.dat";

    @Override
    public void saveAll(List<Student> slist) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(slist);
            System.out.println(" Students saved successfully to file.");
        }
    }

    @Override
    public List<Student> readAll() throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (List<Student>) ois.readObject();
        }
    }
}
