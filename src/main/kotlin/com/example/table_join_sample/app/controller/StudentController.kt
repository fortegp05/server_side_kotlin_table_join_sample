package com.example.table_join_sample.app.controller

import com.example.table_join_sample.app.domain.repository.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class StudentController {

    @Autowired
    lateinit var studentRepository: StudentRepository

    @GetMapping("students")
    fun getStudents(): String {
        return studentRepository.findAll().toString()
    }
}