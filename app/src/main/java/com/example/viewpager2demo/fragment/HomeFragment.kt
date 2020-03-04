package com.example.viewpager2demo.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.viewpager2demo.R

/**
 *@author: njb
 *@date:   2020/3/4 0004 20:00
 *@desc:   首页
 */
class HomeFragment : Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = LayoutInflater.from(context).inflate(R.layout.fm_home, null)
        return view
    }
}
