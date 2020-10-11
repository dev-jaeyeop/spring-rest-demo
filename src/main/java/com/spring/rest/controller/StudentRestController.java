package com.spring.rest.controller;

import com.spring.rest.entity.Student;
import com.spring.rest.exception.StudentErrorResponse;
import com.spring.rest.exception.StudentNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RequestMapping("api")
@RestController
public class StudentRestController {

    private List<Student> students;

    // define @PostConstruct to load the student data ... only once
    @PostConstruct
    public void loadData() {
        students = new ArrayList<>();

        students.add(new Student("first", "last"));
        students.add(new Student("first1", "last1"));
        students.add(new Student("first2", "last2"));
    }

    // define endpoint for "/students" - return list of students
    @GetMapping("students")
    public List<Student> getStudents() {
        return students;
    }

    // define endpoint for "/students/{studentId}" - return student at index
    @GetMapping("students/{studentId}")
    public Student getStudent(@PathVariable(name = "studentId") int studentId) {

        // just index into the list... keep it simple for now
        if (!(-1 < studentId && studentId < students.size())) {
            throw new StudentNotFoundException("Student is not found - " + studentId);
        }

        return students.get(studentId);
    }

}
