package tech.hmsfirebaseservices.services

interface Crashlytics {

    fun recordException(throwable: Throwable)

    fun log(message: String)

}