package com.thebereau.startrecyclerviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayList = ArrayList<Model> ()

        arrayList.add(Model("Mobile", "Joined Start.NG to learn Mobile Development.", R.drawable.android))
        arrayList.add(Model("Collaborate", "I hope to meet all other interns and also to collaborate with them.", R.drawable.people))
        arrayList.add(Model("Fast Cars", "I'll be celebrating our first success story with a Lambo.", R.drawable.lamborghini))
        arrayList.add(Model("Trips", "Of course a private jet to tour the world.", R.drawable.airplane))
        arrayList.add(Model("Diving", "Scuba diving definitely makes this list!!!", R.drawable.snorkel))
        arrayList.add(Model("Flix & Chill", "Las las nah to netflix and chill, then repeat.", R.drawable.netflix))

        val myAdapter = MyAdapter (arrayList, this)

        recyclerView.layoutManager = LinearLayoutManager (this)
        recyclerView.adapter = myAdapter
    }
}
