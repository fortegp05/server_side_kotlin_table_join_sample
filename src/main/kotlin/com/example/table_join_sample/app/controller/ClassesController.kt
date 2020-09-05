package com.example.table_join_sample.app.controller

import com.example.table_join_sample.app.domain.repository.ClassesRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ClassesController {

    @Autowired
    lateinit var classesRepository: ClassesRepository

    @GetMapping("classes")
    fun getSeats(): String {
        return classesRepository.findAll().toString()
    }
}