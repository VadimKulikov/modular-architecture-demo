package ru.kvs.rest

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.kvs.data.Employee
import ru.kvs.service.EmployeeService

@RestController
@RequestMapping("/employee")
class EmployeeController(
    private val employeeService: EmployeeService
) {

    @PostMapping
    fun saveEmployee(@RequestBody employee: Employee) = employeeService.processEmployeeInformation(employee)
}