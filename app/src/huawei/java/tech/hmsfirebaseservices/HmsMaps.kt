package tech.hmsfirebaseservices

import androidx.fragment.app.Fragment
import com.huawei.hms.maps.MapFragment
import tech.hmsfirebaseservices.services.Maps

class HmsMaps : Maps {

    // Compile time error - MapFragment is not an android.fragment.app.Fragment subclass
    override fun getFragment(): Fragment = MapFragment()
}