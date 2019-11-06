package com.example.celebridade.PackageActivity

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.example.celebridade.R
import com.example.celebridade.localdatabase.AppDatabase
import com.example.celebridade.localdatabase.PackageDAO.celebritiesDAO
import kotlin.random.Random

class CelebrityDetailsActivity : AppCompatActivity() {

    //Inicializando variaveis lateinit e instanciando as propriedados DAO, PEGANDO TODAS AS INFORMAÇÕES DA LISTA(Infos das celebridades)

    private lateinit var ImageCelebrities: ImageView

    private lateinit var CelebritiesDAO: celebritiesDAO

    private lateinit var InfosOfCelebrities: TextView


    //---------------------------------------------------------------------------------------------------------------------------------------
    /* Criando função para instanciar as perguntas(infos)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gotoactivity2button.setOnClickListener {
            val intentGoToActivity2 = Intent(this, Activity2::class.java)
            startActivity(intentGoToActivity2)
        }
    }
     */
//---------------------------------------------------------------------------------------------------------------------------------------

    //função para instanciar aleatoriamente as perguntas e pegar a posição de cada imagem||frase
    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_celebrity_details)

        CelebritiesDAO = AppDatabase.getInstance(this).celebrityDao()

        val random = (0 until 20).random() //Random em 20 frases!

        val celebrity = CelebritiesDAO.getEveryone()[intent.getIntExtra("celebrity_placing", 0) ]
        val quotes = CelebritiesDAO.getAllInfos(intent.getIntExtra("celebrity_placing", 0).toLong() + 1)

//---------------------------------------------------------------------------------------------------------------------------------------

        /* TESTE!! para salvar as instancias
        override fun onSaveInstanceState(outState: Bundle?) {
    outState?.run {
        putString(GAME_STATE_KEY, gameState)
        putString(TEXT_VIEW_KEY, textView.text.toString())
    }
    // call superclass to save any view hierarchy
    super.onSaveInstanceState(outState)
}
         */
//---------------------------------------------------------------------------------------------------------------------------------------
        ImageCelebrities = findViewById(R.id.imageViewCelebrityDetails)


        InfosOfCelebrities = findViewById(R.id.textViewCelebrityDetails)


        ImageCelebrities.setImageResource(celebrity.image)


        InfosOfCelebrities.text = quotes[random].quote


    }

    override fun onResume() {
        super.onResume()
        val bgcolor = Color.argb(255, Random.nextInt(256), Random.nextInt(256), Random.nextInt(256));
        val root = getWindow().getDecorView().getRootView().findViewById<View>(R.id.constraintlayout)
        root.setBackgroundColor(bgcolor)
    }
}
