package tech.hmsfirebaseservices

import android.app.Activity
import android.app.Application
import android.os.Bundle

internal class ActivityProvider(application: Application) {

    var activeActivity: Activity? = null

    init {
        application.registerActivityLifecycleCallbacks(object :
            Application.ActivityLifecycleCallbacks {

            override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
                // No-op
            }

            override fun onActivityStarted(activity: Activity) {
                // No-op
            }

            override fun onActivityResumed(activity: Activity) {
                activeActivity = activity
            }

            override fun onActivityPaused(activity: Activity) {
                activeActivity = null
            }

            override fun onActivityStopped(activity: Activity) {
                // No-op
            }

            override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {
                // No-op
            }


            override fun onActivityDestroyed(activity: Activity) {
                // No-op
            }
        }
        )
    }
}