package tech.hmsfirebaseservices

import androidx.fragment.app.Fragment
import com.google.android.gms.maps.SupportMapFragment
import tech.hmsfirebaseservices.services.Maps

class GoogleMaps: Maps {

    override fun getFragment(): Fragment = SupportMapFragment()

}