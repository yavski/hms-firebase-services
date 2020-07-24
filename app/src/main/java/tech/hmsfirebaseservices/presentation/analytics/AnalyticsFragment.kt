package tech.hmsfirebaseservices.presentation.analytics

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_analytics.*
import org.koin.android.ext.android.inject
import tech.hmsfirebaseservices.R
import tech.hmsfirebaseservices.services.Analytics

class AnalyticsFragment : Fragment() {

    val analytics: Analytics by inject()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_analytics, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        log_event_view.setOnClickListener {
            val args = Bundle()
            args.putInt("int", Int.MAX_VALUE)
            analytics.logEvent("Hello, world!", args)
        }

        track_screen_view.setOnClickListener {
            analytics.trackScreen("Analytics")
        }
    }

}