package com.valentine.recyleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.valentine.recyleview.databinding.ItemUserBinding
import com.valentine.recyleview.navigation.FirstFragmentDirections


class UserAdapter(private val user: List<User>) :
    RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    class UserViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val binding = ItemUserBinding.bind(view)
//
    }

    //nge attach item user
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
        return UserViewHolder(view)
    }

    //get data sesuai dengan posisi
    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        with(holder) {
            binding.usernameTextView.text = user[position].username
            binding.phoneNumberTextView.text = user[position].phoneNumber.toString()
        }

        holder.itemView.setOnClickListener {
            //detail view
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(user[position])
            it.findNavController().navigate(action)
        }

    }

    override fun getItemCount(): Int {
        return user.size
    }
}