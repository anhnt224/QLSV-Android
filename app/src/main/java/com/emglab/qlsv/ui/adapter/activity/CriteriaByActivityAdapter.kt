package com.emglab.qlsv.ui.adapter.activity

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.emglab.qlsv.R
import com.emglab.qlsv.models.entity.Criteria
import kotlinx.android.synthetic.main.list_item_criteria_by_activity.view.*


class CriteriaByActivityAdapter(
    var context : Context? = null,
    var criterias : List<Criteria> = ArrayList()

) : androidx.recyclerview.widget.RecyclerView.Adapter<CriteriaByActivityAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_item_criteria_by_activity, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val criteria = criterias[position]
        holder.bindItems(criteria)

//        holder.itemView.setOnClickListener {
//            val direction = FruitListFragmentDirections.ActionFruitListFragmentToOrderItemsDetailFragment(orderItem.fruitId)
//            Navigation.findNavController(it).navigate(direction)
//        }

    }


    override fun getItemCount(): Int {
        return criterias.size
    }

    class ViewHolder(itemView: View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(itemView) {

        fun bindItems(criteria: Criteria) {

            itemView.txtName.text = criteria.name
//            itemView.textPoint.text = "${criteria.maxPoint} điểm"
            //itemView.txtQuantityAndPrice.text = "${formatter.format(invoiceLine.unitPrice)}đ x ${invoiceLine.quantity} = ${formatter.format(invoiceLine.getPrice()!!)}đ"

        }
    }
}