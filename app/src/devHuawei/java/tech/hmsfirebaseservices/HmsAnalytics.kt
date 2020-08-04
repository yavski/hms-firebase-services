package tech.hmsfirebaseservices

import android.os.Bundle
import com.huawei.hms.analytics.HiAnalyticsInstance
import tech.hmsfirebaseservices.services.Analytics

internal class HmsAnalytics(private val hmAnalyticsInstance: HiAnalyticsInstance): Analytics {

    override fun logEvent(name: String, args: Bundle) {
        hmAnalyticsInstance.onEvent(name, args)
    }

    override fun trackScreen(name: String) {
        // TODO: HMS Analytics Kit does not appear to have an api for screen tracking
    }
}