package com.thebereau.startrecyclerviewapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row.view.*

class MyAdapter (val arrayList: ArrayList<Model>, val Context: Context) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItems(model: Model) {
            itemView.titleTv.text = model.title
            itemView.descTv.text = model.des
            itemView.imageIv.setImageResource(model.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val v = LayoutInflater.from(parent.context).inflate(R.layout.row, parent, false)

        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(arrayList[position])

        holder.itemView.setOnClickListener {

           //start of clicked toast, commented out
            /*if (position == 0) {

                Toast.makeText(
                    Context,
                    "You Clicked Mobile",
                    Toast.LENGTH_LONG
                ).show()
            }

            if (position == 1) {

                Toast.makeText(
                    Context,
                    "You Clicked Collaborate",
                    Toast.LENGTH_LONG
                ).show()
            }

            if (position == 2) {

                Toast.makeText(
                    Context,
                    "You Clicked Fast Cars",
                    Toast.LENGTH_LONG
                ).show()
            }

            if (position == 3) {

                Toast.makeText(
                    Context,
                    "You Clicked Trips",
                    Toast.LENGTH_LONG
                ).show()
            }

            if (position == 4) {

                Toast.makeText(
                    Context,
                    "You Clicked Diving",
                    Toast.LENGTH_LONG
                ).show()
            }

            if (position == 5) {

                Toast.makeText(
                    Context,
                    "You Clicked Flix & Chill",
                    Toast.LENGTH_LONG
                ).show()
            }*/
            //end of clicked toast

            //position os selected item gotten
            val model = arrayList.get(position)

            //title an desc gotten with intent
            var gTitle : String = model.title
            var gDescription : String = model.des
            //image which position is selected, gotten with intent
            var  gImageView : Int = model.image

            //creating intent in kotlin
            val intent = Intent(Context, NextActivity::class.java)

            //putting all the items with putExtra intent
            intent.putExtra("iTitle", gTitle)
            intent.putExtra("iDescription", gDescription)
            intent.putExtra("iImageView", gImageView)

            //starting another activity
            Context.startActivity(intent)
        }
    }
}