package ru.kvs.storage

import org.slf4j.LoggerFactory
import ru.kvs.data.Employee
import ru.kvs.interfaces.EmployeeStorage
import ru.kvs.storage.entity.EmployeeEntity
import ru.kvs.storage.repository.EmployeeRepository

class EmployeeJdbcStorage(
    private val employeeRepository: EmployeeRepository
) : EmployeeStorage {
    private val logger = LoggerFactory.getLogger(javaClass)

    override fun save(employee: Employee) {
        logger.info("Saving employee via JDBC")
        employeeRepository.save(EmployeeEntity(employee = employee))
        logger.info("Employee successfully saved")
    }
}