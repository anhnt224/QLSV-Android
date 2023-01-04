//package com.emglab.qlsv.ui.adapter.user
//
//import androidx.recyclerview.widget.RecyclerView
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.TextView
//import com.emglab.qlsv.R
//import com.emglab.qlsv.helper.SharedPrefsHelper
//import com.emglab.qlsv.models.entity.ScheduleStudent
//
//import java.util.*
//import javax.inject.Inject
//
///**
// * Created by admikn on 5/24/2018.
// */
//
//class ScheduleAdapter(var arrMess: List<ScheduleStudent>,
//                      var sharedPrefsHelper: SharedPrefsHelper
//) : androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder>() {
//
//    private val VIEW_TYPE_MY_MESSAGE = 0
//    private val VIEW_TYPE_ANOTHER_MESSAGE = 1
//
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): androidx.recyclerview.widget.RecyclerView.ViewHolder {
//        if (viewType == VIEW_TYPE_MY_MESSAGE) {
//            val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_chat_my_message, parent, false)
//            return MyMessageViewHolder(view)
//        }
//        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_chat_another_user, parent, false)
//        return AnotherUserViewHolder(view)
//    }
//
//    override fun getItemViewType(position: Int): Int {
//        return if (arrMess.get(position).idUser.equals(sharedPrefsHelper.get(SharedPrefsHelper.USER_CODE,""))) VIEW_TYPE_MY_MESSAGE else VIEW_TYPE_ANOTHER_MESSAGE
//    }
//
//    override fun onBindViewHolder(holder: androidx.recyclerview.widget.RecyclerView.ViewHolder, position: Int) {
//
//        if (holder is MyMessageViewHolder){
//            val mess = arrMess[position]
//            var showName = true
//            if (position > 0){
//                val messOld = arrMess[position-1]
//                if (messOld.sender.equals(mess.sender)){
//                    showName = false
//                }
//            }
//            holder.bindItems(mess,showName)
//        }else if (holder is AnotherUserViewHolder){
//            val mess = arrMess[position]
//            var showName = true
//            if (position > 0){
//                val messOld = arrMess[position-1]
//                if (messOld.sender.equals(mess.sender)){
//                    showName = false
//                }
//            }
//            holder.bindItems(mess,showName)
//
//        }
//
//    }
//
//    override fun getItemCount(): Int {
//        return arrMess.size
//    }
//
//    class MyMessageViewHolder(itemView: View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(itemView) {
//
//        lateinit var txtTime : TextView
//        lateinit var txtName2 : TextView
//        lateinit var btnMess2 : TextView
//
//        fun bindItems(chatMessage: ChatMessage,showName: Boolean) {
//
//            txtTime = itemView.findViewById(R.id.txtTime) as TextView
//            txtName2 = itemView.findViewById(R.id.txtName2) as TextView
//            btnMess2 = itemView.findViewById(R.id.btnMess2) as TextView
//
//            txtTime.text = Date(chatMessage.time).converDateToStringYYYYMMDDHHMMSS()
//            btnMess2.text = chatMessage.content
//            txtName2.text = chatMessage.sender
//            txtName2.visibility = if (showName) View.VISIBLE else View.GONE
//
//        }
//
//    }
//
//    class AnotherUserViewHolder(itemView: View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(itemView) {
//
//        lateinit var txtTime : TextView
//        lateinit var txtName1 : TextView
//        lateinit var btnMess1 : TextView
//
//        fun bindItems(chatMessage: ChatMessage,showName: Boolean) {
//
//            txtTime = itemView.findViewById(R.id.txtTime) as TextView
//            txtName1 = itemView.findViewById(R.id.txtName1) as TextView
//            btnMess1 = itemView.findViewById(R.id.btnMess1) as TextView
//
//            txtTime.text = Date(chatMessage.time).converDateToStringYYYYMMDDHHMMSS()
//            txtName1.text = chatMessage.sender
//            btnMess1.text = chatMessage.content
//
//            txtName1.visibility = if (showName) View.VISIBLE else View.GONE
//
//
//        }
//    }
//
//}