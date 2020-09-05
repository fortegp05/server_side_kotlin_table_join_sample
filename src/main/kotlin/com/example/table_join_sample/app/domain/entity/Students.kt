package com.example.table_join_sample.app.domain.entity

import javax.persistence.*

@Entity
data class Students(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Int = 0,
        var name: String = "",
        @OneToOne
        @JoinColumn(name = "seats_id")
        var seats: Seats,
        @ManyToOne
        @JoinColumn(name = "class_id")
        var classes: Classes,
        @ManyToMany
        @JoinTable(
                name = "courses",
                joinColumns = [JoinColumn(name = "student_id")],
                inverseJoinColumns = [JoinColumn(name = "teacher_id")]
        )
        var teachers: List<Teachers>
)