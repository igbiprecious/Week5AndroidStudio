package com.precious.recycleraccessmentactivity.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.precious.recycleraccessmentactivity.databinding.PersonItemBinding
import com.precious.recycleraccessmentactivity.models.Person

class PersonAdapter(private val persons: List<Person>)
    : RecyclerView.Adapter<PersonAdapter.PersonViewHolder>() {

    private lateinit var mListener: onItemClickListener
    interface onItemClickListener{
        fun onItemClick(position: Int)
    }

    fun setOnItemClickListener(listener: onItemClickListener){
        mListener = listener
    }

    class PersonViewHolder(var binding: PersonItemBinding, listener: onItemClickListener )
        :RecyclerView.ViewHolder(binding.root){

            fun bind(user: Person){
                binding.userPic.setImageResource(user.userImage)
                binding.firstnameView.text = user.firstname
                binding.lastnameView.text = user.lastname
            }

            init {
                itemView.setOnClickListener {
                    listener.onItemClick(adapterPosition)
                }
            }

        }


    override fun onCreateViewHolder( parent: ViewGroup, viewType: Int ): PersonViewHolder {
        var binding = PersonItemBinding.inflate(LayoutInflater.from(parent.context))
        return PersonViewHolder(binding, mListener)
    }

    override fun onBindViewHolder(holder: PersonAdapter.PersonViewHolder, position: Int) {
        val user = persons[position]
        holder.bind(user)
    }

    override fun getItemCount(): Int {
        return persons.size
    }




}