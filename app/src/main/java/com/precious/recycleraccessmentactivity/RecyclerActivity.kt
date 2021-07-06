package com.precious.recycleraccessmentactivity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.precious.recycleraccessmentactivity.adapters.PersonAdapter
import com.precious.recycleraccessmentactivity.databinding.ActivityRecyclerBinding
import com.precious.recycleraccessmentactivity.models.Person

class RecyclerActivity : AppCompatActivity() {
    private lateinit var binding : ActivityRecyclerBinding
    private lateinit var myPersonAdapter: PersonAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val persons : List<Person> = listOf(
            Person(
                R.drawable.pic_one,
                "James",
                "Robert"
            ),
            Person(
                R.drawable.pic_two,
                "John",
                "Mary"
            ),
            Person(
                R.drawable.pic_three,
                "Michael",
                "Patricia"
            ),
            Person(
                R.drawable.pic_four,
                "William",
                "David"
            ),
            Person(
                R.drawable.pic_five,
                "Richard",
                "Joseph"
            ),
            Person(
                R.drawable.pic_six,
                "Thomas",
                "Barbara"
            ),
            Person(
                R.drawable.pic_seven,
                "Charles",
                "Christopher"
            ),
            Person(
                R.drawable.pic_eight,
                "Daniel",
                "Susan"
            ),
            Person(
                R.drawable.pic_one,
                "Donald",
                "Steven"
            ),
            Person(
                R.drawable.pic_two,
                "Matthew",
                "Anthony"
            ),
            Person(
                R.drawable.pic_three,
                "Mark",
                "Jessica"
            ),
            Person(
                R.drawable.pic_four,
                "Paul",
                "Andrew"
            ),
            Person(
                R.drawable.pic_five,
                "Joshua",
                "Kenneth"
            ),
            Person(
                R.drawable.pic_six,
                "Kevin",
                "Kimberly"
            ),
            Person(
                R.drawable.pic_seven,
                "Brian",
                "George"
            ),
            Person(
                R.drawable.pic_eight,
                "Edward",
                "Michelle"
            ),
            Person(
                R.drawable.pic_one,
                "Ronald",
                "Timothy"
            ),
            Person(
                R.drawable.pic_two,
                "Jason",
                "Dorothy"
            ),
            Person(
                R.drawable.pic_three,
                "Ryan",
                "Rebecca"
            ),
            Person(
                R.drawable.pic_four,
                "Jacob",
                "Nicholas"
            )

        )

        myPersonAdapter = PersonAdapter(persons)
        binding.personRecyclerView.adapter = myPersonAdapter

        myPersonAdapter.setOnItemClickListener(object : PersonAdapter.onItemClickListener{
            override fun onItemClick(position: Int) {
                val intent = Intent(this@RecyclerActivity, ItemDetailsActivity::class.java)
                intent.putExtra("PositionID", position.toString())
                startActivity(intent)
            }

        })

    }
}