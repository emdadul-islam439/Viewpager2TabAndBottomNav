package com.example.viewpager2demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpager2demo.fragment.HomeFragment
import com.example.viewpager2demo.fragment.KnowledgeFragment
import com.example.viewpager2demo.fragment.NavigationFragment
import com.example.viewpager2demo.fragment.ProjectFragment
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //标题
    private val titles = arrayOf("首页", "知识", "导航", "项目")
    private val fragmentList : MutableList<Fragment> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews();
    }

    /**
     * 初始化控件
     */
    private fun initViews() {
        //初始化fragment
        fragmentList.add(HomeFragment())
        fragmentList.add(KnowledgeFragment())
        fragmentList.add(NavigationFragment())
        fragmentList.add(ProjectFragment())
        //初始化viewPage
        viewPager!!.adapter = object:FragmentStateAdapter(this){
            override fun getItemCount(): Int {
                return fragmentList.size
            }

            override fun createFragment(position: Int): Fragment {
                return  fragmentList[position]
            }
        }
        viewPager.offscreenPageLimit = 3
        val tabLayoutMediator = TabLayoutMediator(
            tab_layout,viewPager, TabLayoutMediator.TabConfigurationStrategy { tab: TabLayout.Tab, position: Int ->
                tab.text = titles[position]
            })
        tabLayoutMediator.attach()
    }
}