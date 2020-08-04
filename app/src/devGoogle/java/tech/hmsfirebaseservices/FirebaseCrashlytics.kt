package tech.hmsfirebaseservices

import com.google.firebase.crashlytics.FirebaseCrashlytics
import tech.hmsfirebaseservices.services.Crashlytics

class FirebaseCrashlytics(private val firebaseCrashlytics: FirebaseCrashlytics) : Crashlytics {

    override fun recordException(throwable: Throwable) {
        firebaseCrashlytics.recordException(throwable)
    }

    override fun log(message: String) {
        firebaseCrashlytics.log(message)
    }

}