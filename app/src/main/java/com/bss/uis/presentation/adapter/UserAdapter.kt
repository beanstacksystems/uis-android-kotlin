package com.bss.uis.presentation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bss.uis.R
import com.bss.uis.data.remote.dto.response.FetchUserListResponse

class UserAdapter(private val userList: List<FetchUserListResponse>, private val listener: OnItemClickListener?) :
    RecyclerView.Adapter<UserAdapter.UerViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.user_list, parent, false)
        return UerViewHolder(view)
    }

    override fun onBindViewHolder(holder: UerViewHolder, position: Int) {
        holder.title.text = userList[position].userName
        holder.itemView.setOnClickListener {
            listener?.onItemClick(position)
        }

    }

    override fun getItemCount(): Int {
        return userList.size
    }

    class UerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val title: TextView = itemView.findViewById(R.id.tv_userName)
    }

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }


}
