package com.example.postgres.service;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.example.postgres.dto.StudentDTO;
import com.example.postgres.entity.Student;
import com.example.postgres.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class StudentServiceTest {

    @InjectMocks
    StudentService studentService;

    @Mock
    StudentRepository studentRepository;

    @Test()
    public void test() {

        List<Student> studentList = new ArrayList<>();

        Student student = new Student("Vasia",28);
        Student student1 = new Student("Dahsa",28);
        Student student2 = new Student("Vania",28);
        student.setId(1L);
        student1.setId(2L);
        student2.setId(3L);

        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);

        when(studentRepository.findAll()).thenReturn(studentList);

        List<StudentDTO> studentDTOList = studentService.getAllStudents();

        assertEquals(3, studentDTOList.size());


    }
}
