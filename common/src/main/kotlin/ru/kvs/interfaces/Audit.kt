package ru.kvs.interfaces

import ru.kvs.data.AuditMessage

interface Audit {
    fun send(message: AuditMessage)
}