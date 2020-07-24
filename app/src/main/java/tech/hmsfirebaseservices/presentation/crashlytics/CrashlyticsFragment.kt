package tech.hmsfirebaseservices.presentation.crashlytics

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_crashlytics.*
import org.koin.android.ext.android.inject
import tech.hmsfirebaseservices.R
import tech.hmsfirebaseservices.services.Crashlytics
import java.lang.RuntimeException

class CrashlyticsFragment : Fragment() {

    val crashlytics: Crashlytics by inject()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_crashlytics, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        log_throwable_view.setOnClickListener {
            val throwable = RuntimeException("Testing throwable logging")
            crashlytics.recordException(throwable)
        }

        log_message_view.setOnClickListener {
            crashlytics.log("Testing message logging")
        }
    }
}