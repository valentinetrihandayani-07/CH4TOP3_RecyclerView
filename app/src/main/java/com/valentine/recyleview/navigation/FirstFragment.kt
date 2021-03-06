package com.valentine.recyleview.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.valentine.recyleview.R
import com.valentine.recyleview.User
import com.valentine.recyleview.UserAdapter
import com.valentine.recyleview.databinding.ActivityMainBinding
import com.valentine.recyleview.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {
   //binding
    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentFirstBinding.bind(view)
       // userRecyclerView = view.findViewById(R.id.user_recyclerView_first)
        //list data user
        val userList = listOf(
            User("Valentine", +6282234567),
            User("Trihandayani", +6282276905052),
            User("Sinaga", +62898763213),
        )

        //adapter: memproses data yang akan ditampilkan dalam daftar yang dibuat
        val userAdapter = UserAdapter(userList)

        //layout manager: mengatur tata letak daftar yang akan ditampilkan
        val layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.userRecyclerViewFirst.layoutManager = layoutManager
        binding.userRecyclerViewFirst.adapter = userAdapter

    }


}