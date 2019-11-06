package com.example.celebridade.PackageAdapter

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.celebridade.R
import com.example.celebridade.PackageActivity.MainActivity
import com.example.celebridade.localdatabase.PackageDAO.CelebritiesINFOS
import kotlin.random.Random

class CelebrityAdapter(private val textContext: Context, private val CelebList: List<CelebritiesINFOS>, val listener: MainActivity): RecyclerView.Adapter<CelebrityAdapter.CelebritiesHolderCard>() {



    private val layoutInflater = textContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CelebritiesHolderCard {
        val view = layoutInflater.inflate(R.layout.celebrity_cardview, parent, false)
        return CelebritiesHolderCard(view, textContext, listener)
    }


    //funcão que pegar os items da lista de celebridades
    override fun getItemCount(): Int {
        return CelebList.size
    }

//---------------------------------------------------------------------------------------------------------------------------------------
    /* GET ITEM COUNT TEST
    public View getView(int position, View convertView, ViewGroup parent) {
        //ViewHolder holder;
        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater)
                    context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.list_row_layout, null);
           // holder = new ViewHolder();

            //convertView.setTag(holder);
        }
        TextView headingView = (TextView) convertView.findViewById(R.id.title);
        TextView placeView = (TextView) convertView.findViewById(R.id.place);
         TextView reportedDateView = (TextView) convertView.findViewById(R.id.date);

        headingView.setText(listData.get(position).getHeading());
        placeView.setText("At, " + listData.get(position).getPlace());
        reportedDateView.setText(listData.get(position).getDate());

        return convertView;
     */
//---------------------------------------------------------------------------------------------------------------------------------------


    override fun onBindViewHolder(holderCard: CelebritiesHolderCard, position: Int) {
        val celebrity = CelebList[position]
        holderCard.image.setImageResource(celebrity.image)
        holderCard.quote.text = celebrity.name
    }
//---------------------------------------------------------------------------------------------------------------------------------------
    /*BIND VIEW HOLDER, quando clicar ele ira pegar a posição do card e ira relacionar com o nome e a frase
    public void onBindViewHolder(myViewHolder holder, int position) {

        RecViewHolder currentdata = data.get(position);
        holder.favChecker = currentdata.getFavChecker();
        holder.serialID = currentdata.getSerialID();
        holder.theClassName = currentdata.getTheClassName();
}
java android
     */

    //---------------------------------------------------------------------------------------------------------------------------------------
    class CelebritiesHolderCard(view: View, context: Context, listenCelebrities: ClickListenCelebrities): RecyclerView.ViewHolder(view) {

        //val cardview: CardView = view.findViewById(R.id.celebrity_cardview)


        val image: ImageView = view.findViewById(R.id.imageViewCelebrityDetails)
        val quote: TextView = view.findViewById(R.id.text_cardview)


        init {
            val constraintview = view.findViewById<View>(R.id.constraintlayout)
            val bgcolor = Color.argb(255, Random.nextInt(256), Random.nextInt(256), Random.nextInt(256));
            constraintview.setBackgroundColor(bgcolor)
            view.setOnClickListener{
                listenCelebrities.onClick(it, adapterPosition)
            }

        }
    }
}

//---------------------------------------------------------------------------------------------------------------------------------------
/*      //Evento de clicar e a imagem aparecer ou seja ser clicavel
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

 */




// window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN) deixar a tela totalment fullscreen