package ru.kvs.service

import org.slf4j.LoggerFactory
import ru.kvs.data.AuditMessage
import ru.kvs.data.Employee
import ru.kvs.interfaces.Audit
import ru.kvs.interfaces.EmployeeStorage

class EmployeeService(
    private val employeeStorage: EmployeeStorage,
    private val audit: Audit
) {
    private val logger = LoggerFactory.getLogger(javaClass)

    fun processEmployeeInformation(employee: Employee) {
        logger.info("Received employee info")

        employeeStorage.save(employee)

        val auditMessage = AuditMessage("Employee $employee successfully registered")
        audit.send(auditMessage)

        logger.info("Employee info successfully processed")
    }
}