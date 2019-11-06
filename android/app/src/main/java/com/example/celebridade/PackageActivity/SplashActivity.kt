package com.example.celebridade.PackageActivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.celebridade.R

class SplashActivity : AppCompatActivity() {

    private var DelayOfH: Handler? = null // delay do handler


    private val TimeWaitSplash: Long = 3000 //tempo de espera de carregamento


    private val Functionable: Runnable = Runnable {
        if (!isFinishing) {

            val soucer = Intent(applicationContext, MainActivity::class.java)
            startActivity(soucer)
            finish()
        }
    }

    /* TESTE THREAD!
      class PrimeThread extends Thread {
         long minPrime;
         PrimeThread(long minPrime) {
             this.minPrime = minPrime;
         }

         public void run() {
             // compute primes larger than minPrime
              . . .
         }
     }

     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        DelayOfH = Handler() //delay = ao tempo de espera do handler!


        DelayOfH!!.postDelayed(Functionable, TimeWaitSplash)
    }


//---------------------------------------------------------------------------------------------------------------------------------------

    /* Testando CREATE
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mindorks)
    }
}
     */

//---------------------------------------------------------------------------------------------------------------------------------------

    //Função de destruir a tela SPLASH e logo em seguida mostrar a tela de celebridades, ou seja removendo um callback
    public override fun onDestroy() {

        if (DelayOfH != null) {
            DelayOfH!!.removeCallbacks(Functionable)
        }

        super.onDestroy()
    }
//---------------------------------------------------------------------------------------------------------------------------------------
    /*fun ONDESTROY
    override fun onDestroy() {
    super.onDestroy()
    Log.i(TAG, "onDestroy")
}
     */
//---------------------------------------------------------------------------------------------------------------------------------------
}
