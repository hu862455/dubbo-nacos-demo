package com.dubbo.consumer.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hushuai.service.StudentService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Reference(version = "1.0-SNAPSHOT")
    private StudentService studentService;

    @RequestMapping("get/Student/{id}")
    public Object getStudentInfo(@PathVariable("id")Integer id){
       return studentService.getStudent(id);
    }
}
