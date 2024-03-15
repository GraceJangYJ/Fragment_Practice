package com.example.fragment

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1: Button = findViewById(R.id.displayFrag1)
        val btn2: Button = findViewById(R.id.displayFrag2)

        btn1.setOnClickListener {
            val fragment1: FragmentOne = FragmentOne()
            loadFragment(fragment1)
        }
        btn2.setOnClickListener {
            val fragment2 = Fragment_Two()
            loadFragment(fragment2)
        }
    }

    fun loadFragment(fragment: Fragment) {
        // Fragment Manager: responsible for managing fragments
        // in activity. It keeps track of the fragment lifecycle
        // and handles transaction involving fragments.
        val fragmentManager = supportFragmentManager

        // Fragment Transaction: used to define a set of operation
        // to be perform on fragments
        val fragmentTransaction: FragmentTransaction =
            fragmentManager.beginTransaction()

        // Replacing the frameLayer with new fragment
        fragmentTransaction.replace(R.id.framelayout, fragment)
        fragmentTransaction.commit()
    }
}