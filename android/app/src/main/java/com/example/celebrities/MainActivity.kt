package com.example.celebrities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    lateinit var celebritiesAdapter: CelebritiesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        celebritiesAdapter = CelebritiesAdapter(
            onItemClicked = {
                startActivity<DetailsActivity>()
            }
        )
        celebritiesList.layoutManager = LinearLayoutManager(this)
        celebritiesList.adapter = celebritiesAdapter

        var celebrities = mutableListOf<Celebrity>(
            Celebrity("Matela", R.drawable.matela, "Fala dev"),
            Celebrity("Matela", R.drawable.matela, "Fala dev"),
            Celebrity("Matela", R.drawable.matela, "Fala dev"),
            Celebrity("Matela", R.drawable.matela, "Fala dev")
        )

        celebritiesAdapter.refresh(
            celebrities
        )
    }
}
