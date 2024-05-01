package com.example.fragmenttransactionsapp.fragmtns

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.fragmenttransactionsapp.FragmentClickListener
import com.example.fragmenttransactionsapp.R

class MainFragment(
    private val listener: FragmentClickListener
): Fragment(R.layout.fragment_main)  {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val buttonAdd: Button = view.findViewById<Button>(R.id.add_fragment)
        buttonAdd.setOnClickListener {
            listener.addFragment()
        }

        val buttonReplace: Button = view.findViewById<Button>(R.id.replace_fragment)
        buttonReplace.setOnClickListener {
            listener.replaceFragment()
        }
    }
}