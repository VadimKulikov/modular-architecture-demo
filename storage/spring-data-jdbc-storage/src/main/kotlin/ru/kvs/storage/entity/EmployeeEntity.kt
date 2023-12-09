package ru.kvs.storage.entity

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import ru.kvs.data.Employee

@Table("employees")
class EmployeeEntity(
    @Id
    val id: Int = 0,
    val name: String = "",
    val age: Int = 0
) {
    constructor(employee: Employee): this(
        id = employee.id,
        name = employee.name,
        age = employee.age
    )
}