package com.example.celebrities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.core.app.ActivityCompat
import androidx.core.app.ActivityOptionsCompat
import androidx.core.view.ViewCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.celebrity_holder.view.*
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_IMAGEM_CELEBRIDADE = "extraImagemCelebridade"
    }

    lateinit var celebritiesAdapter: CelebritiesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        celebritiesAdapter = CelebritiesAdapter(
            onItemClicked = { celebrity, holder ->
                val intentShared = Intent(this@MainActivity, DetailsActivity::class.java)
                val imageView = holder.itemView.imageView
                val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this@MainActivity, imageView, imageView.transitionName)
                startActivity(intentShared, options.toBundle()?.apply { putInt(EXTRA_IMAGEM_CELEBRIDADE, celebrity.foto) })

            }
        )
        celebritiesList.layoutManager = LinearLayoutManager(this) as RecyclerView.LayoutManager?
        celebritiesList.adapter = celebritiesAdapter

        var celebrities = mutableListOf<Celebrity>(
            Celebrity("Daniel Radcliffe", R.drawable.danielradcliffe, "Fala dev"),
            Celebrity("Brie Larson", R.drawable.brielarson, "Fala dev"),
            Celebrity("Rami Malek", R.drawable.ramimalek, "Fala dev"),
            Celebrity("Tom Holland", R.drawable.tomholland, "Fala dev"),
            Celebrity("Scarlet jonhason", R.drawable.scarletjonhason, "Fala dev"),
            Celebrity("Michael Fassbender", R.drawable.michaelfassbender, "Fala dev"),
            Celebrity("Miranda Cosgrove", R.drawable.mirandacosgrove, "Fala dev"),
            Celebrity("Joaquin Phoenix", R.drawable.joaquinphoenixjoker, "Fala dev"),
            Celebrity("Benedict Cumberbatch", R.drawable.benedictcumberbatch, "Fala dev"),
            Celebrity("James Mcvoy", R.drawable.jamesmcvoy, "Fala dev")
        )



        celebritiesAdapter.refresh(
            celebrities
        )
    }
}
// window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
//
//
//
//
//