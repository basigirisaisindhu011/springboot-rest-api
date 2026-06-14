package com.practice.springboot_api.controller;

import com.practice.springboot_api.bean.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.*;
@RestController
public class StudentController {
    //bean to json format
    @GetMapping("/student")
    public ResponseEntity<Student> getStudent(){

        Student student=new Student(1,"Sai","Sindhu");
        //return ResponseEntity.ok(student);
        return new ResponseEntity<>(student, HttpStatus.OK);

    }
    @GetMapping("students")
    public List<Student> getStudents(){
        List<Student> students=new ArrayList<>();
        students.add(new Student(1,"Sai","Sindhu"));
        students.add(new Student(2,"Harish","Kumar"));
        students.add(new Student(3,"Nithin","Kumar"));
        return students;
    }
    //Springboot RestApi with PathVariable
    //{id} is URI template variable
//    @GetMapping("students/{id}")
//    public Student studentPathVariable(@PathVariable int id){
//        return new Student(id,"Sai","Sindhu");
//    }
    @GetMapping("students/{id}/{first-name}/{last-name}")
    public Student studentPathVariable(@PathVariable int id,@PathVariable("first-name") String firstname,@PathVariable("last-name") String lastname){
        return new Student(id,firstname,lastname);
    }

   //Springboot restApi with RequestParam
    //http://localhost:8080/students/query?id=1&firstname=sai&lastname=sindhu
    @GetMapping("students/query")
    public Student studentRequestVar(@RequestParam int id,@RequestParam String firstname,@RequestParam String lastname){
        return new Student(id,firstname,lastname);
    }

    //Springboot rest Api that handles Http post request
    @PostMapping("students/create")
    public Student createStudent(@RequestBody Student student){
        System.out.println(student.getId());
        System.out.println(student.getFirstname());
        System.out.println(student.getLastname());
        return student;
    }

   //SpringBoot rest api that handles put request-update existing resource
    @PutMapping("students/{id}/update")
    public Student updateStudent( @RequestBody Student student,@PathVariable int id){
        System.out.println(student.getFirstname());
        System.out.println(student.getLastname());
        return student;
    }

    //Sprngboot rest api that handles http delete request
    @DeleteMapping("student/{id}/delete")
    public String deleteStudent(@PathVariable int id){
        System.out.println(id);
       return "Student deleted successfully";
    }

}
