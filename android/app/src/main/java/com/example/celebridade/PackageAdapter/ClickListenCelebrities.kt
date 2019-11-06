package com.example.celebridade.PackageAdapter

import android.view.View

interface ClickListenCelebrities {
//---------------------------------------------------------------------------------------------------------------------------------------

    /* Teste, Função conclick para pegar o vier w a posição
     @Override
        protected void onClick(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            timerSeekBar = (SeekBar)findViewById(R.id.timerSeekBar);
            timerTextView = (TextView) findViewById(R.id.timerTextView);



            timerSeekBar.setMax(600);
            timerSeekBar.setProgress(30);



     */
//---------------------------------------------------------------------------------------------------------------------------------------

    fun onClick(view: View, position: Int)

    //---------------------------------------------------------------------------------------------------------------------------------------
    /*
    timerSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
     */
    //---------------------------------------------------------------------------------------------------------------------------------------
}