package com.example.celebridade.PackageActivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.view.View
import androidx.core.app.ActivityOptionsCompat
import androidx.core.view.ViewCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.celebridade.R
import com.example.celebridade.PackageAdapter.CelebrityAdapter
import com.example.celebridade.PackageAdapter.ClickListenCelebrities
import com.example.celebridade.localdatabase.AppDatabase
import com.example.celebridade.localdatabase.PackageDAO.celebritiesDAO
import com.example.celebridade.PackageUtilities.StockCelebrities

//Fun MainActivity onde é instanciado o DAO e a Lista de celebridades

class MainActivity : AppCompatActivity(), ClickListenCelebrities {

    private lateinit var celebrityViewList: RecyclerView

    private lateinit var celebritiesDAO: celebritiesDAO

    private var FinalClickTime = 0L

//---------------------------------------------------------------------------------------------------------------------------------------
    /* Teste De OnCreate
   public class bovenbouw extends MainActivity{

   @Override
               public void onCreate(Bundle savedInstanceState) {
                   super.onCreate(savedInstanceState);
                   setContentView(R.layout.activity_main);
                   Button next = (Button) findViewById(R.id.bovenbutton);
                   next.setOnClickListener(new View.OnClickListener() {
                       public void onClick(View view) {
                           Intent myIntent = new Intent(view.getContext(), Vragen.class);
                           startActivityForResult(myIntent, 0);}});}}}
    */

    //---------------------------------------------------------------------------------------------------------------------------------------
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        celebritiesDAO = AppDatabase.getInstance(this).celebrityDao()
        celebritiesDAO.excluCelebritiesfun()

        var celebrities = celebritiesDAO.getEveryone()

        if(celebrities.isEmpty() || celebrities.size != 20) {
            StockCelebrities.addEverybody(celebritiesDAO)

            celebrities = celebritiesDAO.getEveryone()
        }

        celebrityViewList = findViewById(R.id.main_recyclerview)
        celebrityViewList.layoutManager = LinearLayoutManager(this)

        val adapter = CelebrityAdapter(this, celebrities, this)

        celebrityViewList.adapter = adapter
    }

//---------------------------------------------------------------------------------------------------------------------------------------
    /* Teste Atribuição ao on click
   class MainActivity : AppCompatActivity() {

   override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_main)
   }
    */
//---------------------------------------------------------------------------------------------------------------------------------------

    override fun onClick(view: View, placing: Int) {
        if (SystemClock.elapsedRealtimeNanos() - FinalClickTime < 800) {
            return
        }
        FinalClickTime = SystemClock.elapsedRealtime()

        val sap = Intent(this, CelebrityDetailsActivity::class.java)
        val viewImage = view.findViewById<View>(R.id.imageViewCelebrityDetails)
        val alternative = ActivityOptionsCompat.makeSceneTransitionAnimation(this, viewImage, ViewCompat.getTransitionName(viewImage)!!)

        //---------------------------------------------------------------------------------------------------------------------------------------
        /* SAP put extra text,  colocar em posições as celebridades(em ordem)
        Intent i = new Intent(FirstScreen.this, SecondScreen.class);
        String sap = null;
        i.putExtra("STRING_I_NEED", sap);
         */

        //---------------------------------------------------------------------------------------------------------------------------------------
        sap.putExtra("celebrity_placing", placing)//para mudar o nome basta acessar a details activity
        startActivity(sap, alternative.toBundle())
    }
}
