package tech.hmsfirebaseservices.services

import android.os.Bundle

interface Analytics {

    fun logEvent(name: String, args: Bundle)

    fun trackScreen(name: String)

}