package io.armcha.playtabs

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by arman.chatikyan on 10/4/2017.
 */
class TabAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {


    override fun getItem(position: Int): Fragment? = when (position) {

            0 -> frag_one();
            1 -> frag_two();
            2 -> frag_three();

        else -> {SampleFragment3();
        }
    }
   // override fun getItem(position: Int) = SampleFragment()
    //override fun getItem(position: Int) = SampleFragment2()


    //override fun getItem(position: 0) = SampleFragment()
    //override fun getItem(position: 1) = SampleFragment()
    //override fun getItem(position: 2) = SampleFragment()

    override fun getCount() = 4

    override fun getPageTitle(position: Int) = when (position) {
        0 -> "Portraits"
        1 -> "Events"
        2 -> "Weddings"
        else -> "Bookings"
    }
}