package tech.hmsfirebaseservices

import com.huawei.agconnect.crash.AGConnectCrash
import tech.hmsfirebaseservices.services.Crashlytics

internal class HmsCrashlytics(private val agConnectCrash: AGConnectCrash) : Crashlytics {

    init {
        agConnectCrash.enableCrashCollection(true)
    }

    override fun recordException(throwable: Throwable) {
        // TODO: https://developer.huawei.com/consumer/en/doc/development/AppGallery-connect-References/agconnectcrash
        // No API for logging stack traces
    }

    override fun log(message: String) {
        agConnectCrash.log(message)
    }

}