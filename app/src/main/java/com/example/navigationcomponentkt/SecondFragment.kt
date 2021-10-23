package com.example.navigationcomponentkt

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_second.view.*

//todo 4 make fragment
class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_second, container, false)

        //todo 9 navigation
        view.findViewById<TextView>(R.id.tv).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_secondFragment_to_firstFragment)
        }
        //todo 10 test app

        return view
    }

}
