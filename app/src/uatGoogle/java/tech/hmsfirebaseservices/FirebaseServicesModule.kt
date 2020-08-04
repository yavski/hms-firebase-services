package tech.hmsfirebaseservices

import com.google.firebase.analytics.FirebaseAnalytics
import org.koin.dsl.module
import tech.hmsfirebaseservices.services.Analytics
import tech.hmsfirebaseservices.services.Crashlytics
import tech.hmsfirebaseservices.services.Maps

val servicesModule = module {

    single { FirebaseAnalytics.getInstance(get()) }
    single<Analytics> { FirebaseAnalytics(get(), get<ActivityProvider>().activeActivity) }

    single { com.google.firebase.crashlytics.FirebaseCrashlytics.getInstance() }
    single<Crashlytics> { FirebaseCrashlytics(get()) }

    factory<Maps> { GoogleMaps() }
}