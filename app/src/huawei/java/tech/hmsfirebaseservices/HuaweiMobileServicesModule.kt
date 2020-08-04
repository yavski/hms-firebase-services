package tech.hmsfirebaseservices

import com.huawei.agconnect.crash.AGConnectCrash
import com.huawei.hms.analytics.HiAnalytics
import org.koin.dsl.module
import tech.hmsfirebaseservices.services.Analytics
import tech.hmsfirebaseservices.services.Crashlytics
import tech.hmsfirebaseservices.services.Maps

val servicesModule = module {

    single { HiAnalytics.getInstance(get()) }
    single<Analytics> { HmsAnalytics(get()) }

    single { AGConnectCrash.getInstance() }
    single<Crashlytics> { HmsCrashlytics(get()) }

    single<Maps> { HmsMaps() }
}