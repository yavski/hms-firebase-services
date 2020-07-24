package tech.hmsfirebaseservices

import org.koin.dsl.module

val appModule = module {

    single { ActivityProvider(get()) }
}