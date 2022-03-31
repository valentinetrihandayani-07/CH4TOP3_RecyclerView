package com.valentine.recyleview.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.navArgs
import com.valentine.recyleview.R


class SecondFragment : Fragment() {

    //nav args: mengirimkan data antar destination secara aman
    private val args: SecondFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //casting data
        val txtName = view.findViewById<TextView>(R.id.txt_name_detail)
        val txtPhone = view.findViewById<TextView>(R.id.txt_phone_number_detail)
        //view
        txtName.text = args.user.username
        txtPhone.text = args.user.phoneNumber.toString()
    }


}