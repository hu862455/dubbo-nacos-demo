package com.dubbo.provide.demo.controller;

import com.alibaba.dubbo.config.annotation.Service;
import com.hushuai.model.Student;
import com.hushuai.service.StudentService;
import org.springframework.stereotype.Component;

@Component
@Service(version = "1.0-SNAPSHOT",timeout = 10000)
public class UserServiceImpl implements StudentService {
    public String sayHi(String name) {
        return "Hi Springboot:"+name;
    }

    public Student getStudent(int id) {
        Student student = new Student();
        student.setAge(18);
        student.setId(123456);
        student.setName("张三");
        return student;
    }
}
