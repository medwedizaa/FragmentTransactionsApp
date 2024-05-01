package com.example.fragmenttransactionsapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.example.fragmenttransactionsapp.fragmtns.FragmentToAdd
import com.example.fragmenttransactionsapp.fragmtns.FragmentToReplace
import com.example.fragmenttransactionsapp.fragmtns.MainFragment

class MainActivity : AppCompatActivity(R.layout.activity_main), FragmentClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add(R.id.main_container, MainFragment(this@MainActivity), "")
            }
        }
    }

    override fun addFragment() {
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add<FragmentToAdd>(R.id.main_container)
            addToBackStack("")
        }
    }

    override fun replaceFragment() {
        supportFragmentManager.commit {
            replace<FragmentToReplace>(R.id.main_container)
            setReorderingAllowed(true)
            addToBackStack("")
        }
    }

}