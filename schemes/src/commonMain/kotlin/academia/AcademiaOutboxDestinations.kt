package academia

import raven.OutboxDestination

class AcademiaOutboxDestinations(private val base: String) {
    val sms by lazy { OutboxDestination("$base/sms") }
    val email by lazy { OutboxDestination("$base/email") }
}