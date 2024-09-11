package com.krillinator.ws_lektion_10_service_bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    private final Student student;

    @Autowired
    public StudentController(Student student) {
        this.student = student;
    }

}
