package com.example.studentmanager.service;

import com.example.studentmanager.exception.UserNotFoundException;
import com.example.studentmanager.model.Student;
import com.example.studentmanager.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student addStudent(Student student){
        student.setStudentCode(UUID.randomUUID().toString());
        return studentRepository.save(student);
    }

    public List<Student> findAllStudents(){
        return studentRepository.findAll();
    }

    public Student updateStudent(Student student){
        return studentRepository.save(student);
    }

    public Student findStudentById(Long id){
        return studentRepository.findStudentById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id" + id + "was not found"));
    }

    public void deleteStudent(Long id){
        studentRepository.deleteStudentById(id);
    }
}
