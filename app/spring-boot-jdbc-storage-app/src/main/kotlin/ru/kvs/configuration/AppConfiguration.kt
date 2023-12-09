package ru.kvs.configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import ru.kvs.audit.InMemoryAudit
import ru.kvs.interfaces.Audit
import ru.kvs.interfaces.EmployeeStorage
import ru.kvs.service.EmployeeService
import ru.kvs.storage.InMemoryEmployeeStorage

@Configuration
open class AppConfiguration {

    @Bean
    open fun storage() = InMemoryEmployeeStorage()

    @Bean
    open fun audit() = InMemoryAudit()

    @Bean
    open fun service(storage: EmployeeStorage, audit: Audit) = EmployeeService(storage, audit)

}