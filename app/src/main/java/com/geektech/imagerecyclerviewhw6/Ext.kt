package com.geektech.imagerecyclerviewhw6

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity

fun FragmentActivity.add(fragment: Fragment){
    supportFragmentManager.beginTransaction().add(R.id.container_main, fragment).commit()
}