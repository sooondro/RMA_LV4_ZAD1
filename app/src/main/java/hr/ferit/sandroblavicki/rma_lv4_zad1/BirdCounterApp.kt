package hr.ferit.sandroblavicki.rma_lv4_zad1

import android.app.Application
import android.content.Context

class BirdCounterApp: Application() {

    companion object {
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = this
    }
}