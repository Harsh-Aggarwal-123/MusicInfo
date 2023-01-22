package com.harsh.myapplication.view_pager_adapters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.harsh.myapplication.GenreDetailsActivity
import com.harsh.myapplication.fragemnts.Albums
import com.harsh.myapplication.fragemnts.Artists
import com.harsh.myapplication.fragemnts.Tracks

class SamplePagerAdapter(activity: GenreDetailsActivity) : FragmentStateAdapter(activity) {



    override fun getItemCount(): Int  = 3

    override fun createFragment(position: Int): Fragment {

        return if (position == 0) {
            Albums()
        } else if (position == 1) {
            Artists()
        } else {
            Tracks()
        }
    }
}