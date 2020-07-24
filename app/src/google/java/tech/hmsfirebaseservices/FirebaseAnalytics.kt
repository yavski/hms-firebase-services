package tech.hmsfirebaseservices

import android.app.Activity
import android.os.Bundle
import com.google.firebase.analytics.FirebaseAnalytics
import tech.hmsfirebaseservices.services.Analytics

internal class FirebaseAnalytics(
    private val firebaseAnalytics: FirebaseAnalytics,
    private val activity: Activity?
) : Analytics {

    override fun logEvent(name: String, args: Bundle) {
        firebaseAnalytics.logEvent(name, args)
    }

    override fun trackScreen(name: String) {
        activity?.let {
//            firebaseAnalytics.setCurrentScreen(activity, name, null)
        }
    }
}