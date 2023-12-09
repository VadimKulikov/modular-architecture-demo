package ru.kvs.interfaces

import ru.kvs.data.Employee

interface EmployeeStorage {
    fun save(employee: Employee)
}