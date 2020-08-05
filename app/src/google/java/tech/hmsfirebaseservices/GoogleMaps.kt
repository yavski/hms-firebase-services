package tech.hmsfirebaseservices

import androidx.fragment.app.Fragment
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import tech.hmsfirebaseservices.services.Maps

class GoogleMaps : Maps {

    override fun getFragment(): Fragment {
        val fragment = SupportMapFragment()
        fragment.apply {
            this.getMapAsync { googleMap ->
                val sofia = LatLng(42.69751, 23.32415)
                googleMap.addMarker(MarkerOptions().position(sofia).title("Marker in Sydney"))
                googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sofia, 12f))
                googleMap.uiSettings.isZoomControlsEnabled = true

            }
        }
        return fragment
    }

}