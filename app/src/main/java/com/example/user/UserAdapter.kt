package com.example.user

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat.getSystemService
import androidx.recyclerview.widget.RecyclerView

class UserAdapter(private val context: Context, val Listener: UserActivity) :
    RecyclerView.Adapter<UserAdapter.MyViewHolder>() {

    private val allUser = ArrayList<User>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserAdapter.MyViewHolder {
        val ViewHolder = MyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.user_item, parent, false)
        )
        ViewHolder.DeleteButton.setOnClickListener {
            Listener.onListener(allUser[ViewHolder.adapterPosition])


        }
        return ViewHolder
    }

    override fun onBindViewHolder(holder: UserAdapter.MyViewHolder, position: Int) {
        holder.fname.text = allUser[position].text
        holder.lname.text = allUser[position].text1


    }

    override fun getItemCount(): Int {
        return allUser.size
    }


    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var fname: TextView = itemView.findViewById(R.id.tvFname)
        var lname: TextView = itemView.findViewById(R.id.tvLname)
        val DeleteButton: Button = itemView.findViewById(R.id.btnDelete)

    }

fun upDataList(newList:List<User>){
    allUser.clear()
    allUser.addAll(newList)
notifyDataSetChanged()
}



}

interface IUserRvAdapter {


    fun onListener(user: User)
}

