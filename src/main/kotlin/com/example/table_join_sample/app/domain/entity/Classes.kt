package com.example.table_join_sample.app.domain.entity

import com.fasterxml.jackson.annotation.JsonBackReference
import com.fasterxml.jackson.annotation.JsonManagedReference
import org.hibernate.annotations.Fetch
import org.hibernate.annotations.FetchMode
import javax.persistence.*

@Entity
data class Classes (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id : Int = 0,
        var name : String = "",
        @OneToMany(mappedBy = "classes")
        var students: List<Students>
) {
    override fun toString(): String {
        return "id=${id}, name=${name}, students=${students.map {"id=${it.id}, name=${it.name}"}}"
    }
}