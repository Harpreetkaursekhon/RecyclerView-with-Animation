package com.app.recyclerdemo

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.app.adapter.CenterZoomLayoutManager
import com.app.adapter.MyAdapter
import com.app.dataclass.MyModel

class MainActivity : AppCompatActivity() {



    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val  toursRV = findViewById<RecyclerView>(R.id.tours_RV)

        val linearLayoutManager = CenterZoomLayoutManager(this)


        linearLayoutManager.orientation = LinearLayoutManager.HORIZONTAL
        linearLayoutManager.reverseLayout = true
        linearLayoutManager.stackFromEnd = true
        toursRV.layoutManager = linearLayoutManager// here u have to add




        //auto center views
        val snapHelper = LinearSnapHelper()
        snapHelper.attachToRecyclerView(toursRV)
        toursRV.isNestedScrollingEnabled = false


        val places = ArrayList<MyModel>()

        places.add(MyModel("Los Angles","Los Angeles is a sprawling Southern California city and the center of the nation’s film and television industry. Near its iconic Hollywood sign, studios such as Paramount Pictures, Universal and Warner Brothers offer behind-the-scenes tours.",4.5f,
            "https://images.unsplash.com/photo-1429554429301-1c7d5ae2d42e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1050&q=80"))

        places.add(MyModel("China","China, officially the People's Republic of China, is a country in East Asia and is the world's most populous country, with a population of around 1.428 billion in 2017.",4.5f,"https://images.unsplash.com/photo-1529921879218-f99546d03a9d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=675&q=80"))
        places.add(
            MyModel(
                "India ",
                "India, is an independent nation with diversity, incredible culture and multi lingual country.",
                5f,
                "https://images.unsplash.com/photo-1517427677506-ade074eb1432?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=967&q=80"
            )
        )
        places.add(MyModel("Tokyo","Tokyo, Japan’s busy capital, mixes the ultramodern and the traditional, from neon-lit skyscrapers to historic temples. The opulent Meiji Shinto Shrine is known for its towering gate and surrounding woods.",3.5f,"" +
                "https://images.unsplash.com/photo-1540959733332-eab4deabeeaf?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1071&q=80"))



        toursRV.adapter = MyAdapter(this, places)




    }

}

