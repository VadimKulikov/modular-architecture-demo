package ru.kvs.storage.repository

import org.springframework.data.repository.CrudRepository
import ru.kvs.storage.entity.EmployeeEntity

interface EmployeeRepository : CrudRepository<EmployeeEntity, Int>