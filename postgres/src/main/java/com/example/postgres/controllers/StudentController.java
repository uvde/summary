package com.example.postgres.controllers;

import com.example.postgres.dto.StudentDTO;
import com.example.postgres.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public List<StudentDTO> getStudents() {
        List<StudentDTO> listStudents = studentService.getAllStudents();
        return listStudents;
    }

    @PostMapping("/student")
    public void addStudent(@RequestBody StudentDTO studentDTO) {
        studentService.createStudent(studentDTO);
    }

    @DeleteMapping("/student/{studentID}")
    public void deleteStudent(@PathVariable("studentID") Long studentId){
        studentService.deleteStudent(studentId);
    }

    @PutMapping("/student/{updateID}")
    public void saveOrUpdate(@PathVariable("updateID") Long updateId, @RequestBody StudentDTO studentDTO){
        studentService.saveOrUpdate(updateId ,studentDTO);
    }
}





