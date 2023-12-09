package ru.kvs.audit

import org.slf4j.LoggerFactory
import ru.kvs.data.AuditMessage
import ru.kvs.interfaces.Audit

class InMemoryAudit: Audit {
    private val logger = LoggerFactory.getLogger(javaClass)
    private val auditMessages = mutableListOf<AuditMessage>()

    override fun send(message: AuditMessage) {
        logger.info("Saving audit message in memory")
        auditMessages.add(message)
        logger.info("Audit message successfully saved")
    }
}