package com.example.postgres.service;

import com.example.postgres.dto.StudentDTO;
import com.example.postgres.entity.Student;
import com.example.postgres.repository.StudentRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void saveStudent(String name, int age){
        Student student = new Student(name, age);
        studentRepository.save(student);
    }
    public void createStudent(StudentDTO studentDTO){
        this.saveStudent(studentDTO.getName(), studentDTO.getAge());
    }

    public List<StudentDTO> getAllStudents() {
        Iterable<Student> students = studentRepository.findAll();
        List<StudentDTO> studentDTOS = new ArrayList<>();
        for (Student student : students) {
            StudentDTO studentDTO = new StudentDTO();
            studentDTO.setId(student.getId());
            studentDTO.setAge(student.getAge());
            studentDTO.setName(student.getName());
            studentDTOS.add(studentDTO);
        }
        return studentDTOS;
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    public void saveOrUpdate(Long updateId, StudentDTO studentDTO) {
//       Iterable<Student> students = studentRepository.findAll();
//        for (Student student : students) {
//            if (student.getName().equals(studentDTO.getName())) {
//
//            }
//        }
        Optional<Student> studentById = studentRepository.findById(updateId);
        if (studentById.isPresent()) {
            Student updateStudent = studentById.get();
            updateStudent.setAge(studentDTO.getAge());
            updateStudent.setName(studentDTO.getName());
            studentRepository.save(updateStudent);
        }
//        saveStudent(studentDTO.getName(), studentDTO.getAge());

    }
}
