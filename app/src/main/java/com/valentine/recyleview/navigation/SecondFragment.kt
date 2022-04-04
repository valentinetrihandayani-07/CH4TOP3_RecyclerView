package com.valentine.recyleview.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.navArgs
import com.valentine.recyleview.R
import com.valentine.recyleview.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    //nav args: mengirimkan data antar destination secara aman
    private val args: SecondFragmentArgs by navArgs()

    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        val view = binding.root
        return view

        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSecondBinding.bind(view)
        //casting data & view
        binding.txtNameDetail.text = args.user.username
        binding.txtPhoneNumberDetail.text= args.user.phoneNumber.toString()


    }


}