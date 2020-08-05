package tech.hmsfirebaseservices

import androidx.fragment.app.Fragment
import com.huawei.hms.maps.SupportMapFragment
import tech.hmsfirebaseservices.services.Maps

class HmsMaps : Maps {
    override fun getFragment(): Fragment = SupportMapFragment()
}