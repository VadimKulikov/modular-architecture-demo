package ru.kvs.storage

import org.slf4j.LoggerFactory
import ru.kvs.data.Employee
import ru.kvs.interfaces.EmployeeStorage

class InMemoryEmployeeStorage : EmployeeStorage {
    private val logger = LoggerFactory.getLogger(javaClass)
    private val employees = mutableMapOf<Int, Employee>()

    override fun save(employee: Employee) {
        logger.info("Saving $employee in memory")
        employees[employee.id] = employee
        logger.info("Employee $employee successfully saved")
    }
}