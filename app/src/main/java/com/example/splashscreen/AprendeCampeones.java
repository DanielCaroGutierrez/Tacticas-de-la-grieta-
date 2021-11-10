package com.example.splashscreen;

import android.animation.LayoutTransition;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class AprendeCampeones {

    public static class Campeones extends AppCompatActivity {

        TextView DetallesTexto1, DetallesTexto2,DetallesTexto3,DetallesTexto4,DetallesTexto5,DetallesTexto6;
        TextView TituloTexto2,TituloTexto3,TituloTexto4,TituloTexto5,TituloTexto6;
        ImageView campeones, tirador,magos, tanque,asesinos, luchadores;
        LinearLayout layoutDescripcion,layoutDescripcion2;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.aprendecampeones);

            ImageView buttonImage = (ImageView) findViewById(R.id.BackPrincipalActiviti);
            buttonImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    startActivity(new Intent(Campeones.this, PrincipalActivity.class));
                }
            });

            //campeones

            DetallesTexto1 = findViewById(R.id.descripcionTextoC);
            layoutDescripcion = findViewById(R.id.item_description_layoutC);
            campeones = findViewById(R.id.imagen_campeones);

            //Clases

            //adc

            DetallesTexto2 = findViewById(R.id.descripcionTextoC2);
            layoutDescripcion2 = findViewById(R.id.item_description_layoutC2);
            tirador = findViewById(R.id.imagen_adc);
            TituloTexto2 = findViewById(R.id.TituloTextoC2);

            //Tanques

            DetallesTexto3 = findViewById(R.id.descripcionTextoC3);
            tanque = findViewById(R.id.imagen_tanque);
            TituloTexto3 = findViewById(R.id.TituloTextoC3);

            //luchadores

            DetallesTexto4 = findViewById(R.id.descripcionTextoC4);
            luchadores = findViewById(R.id.imagen_luchadores);
            TituloTexto4 = findViewById(R.id.TituloTextoC4);

            //magos

            DetallesTexto5 = findViewById(R.id.descripcionTextoC5);
            magos = findViewById(R.id.mago);
            TituloTexto5 = findViewById(R.id.TituloTextoC5);

            //asesinos

            DetallesTexto6 = findViewById(R.id.descripcionTextoC6);
            asesinos = findViewById(R.id.asesinos);
            TituloTexto6 = findViewById(R.id.TituloTextoC6);


            layoutDescripcion.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
            layoutDescripcion2.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        }

        @RequiresApi(api = Build.VERSION_CODES.KITKAT)
        public void Panda(View view) {

            int v = (DetallesTexto1.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;

            TransitionManager.beginDelayedTransition(layoutDescripcion, new AutoTransition());
            DetallesTexto1.setVisibility(v);


            int va = (campeones.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;

            TransitionManager.beginDelayedTransition(layoutDescripcion, new AutoTransition());
            campeones.setVisibility(va);

        }

        @RequiresApi(api = Build.VERSION_CODES.KITKAT)
        public void Pandaa(View view) {

            //clases

            //tirador

            int v2b = (TituloTexto2.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;

            TransitionManager.beginDelayedTransition(layoutDescripcion2, new AutoTransition());
            TituloTexto2.setVisibility(v2b);

            int v2cd = (tirador.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

            TransitionManager.beginDelayedTransition(layoutDescripcion2, new AutoTransition());
            tirador.setVisibility(v2cd);

            int v2d = (DetallesTexto2.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;

            TransitionManager.beginDelayedTransition(layoutDescripcion2, new AutoTransition());
            DetallesTexto2.setVisibility(v2d);


            //Tanques


            int v2e = (TituloTexto3.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

            TransitionManager.beginDelayedTransition(layoutDescripcion2, new AutoTransition());
            TituloTexto3.setVisibility(v2e);

            int v2fg = (DetallesTexto3.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

            TransitionManager.beginDelayedTransition(layoutDescripcion2, new AutoTransition());
            DetallesTexto3.setVisibility(v2fg);

            int v2hi = (tanque.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

            TransitionManager.beginDelayedTransition(layoutDescripcion2, new AutoTransition());
            tanque.setVisibility(v2hi);

            //luchador

            int v2h = (TituloTexto4.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
            TransitionManager.beginDelayedTransition(layoutDescripcion2, new AutoTransition());
            TituloTexto4.setVisibility(v2h);

            int v2i = (luchadores.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;

            TransitionManager.beginDelayedTransition(layoutDescripcion2, new AutoTransition());
            luchadores.setVisibility(v2i);

            int v2jk = (DetallesTexto4.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

            TransitionManager.beginDelayedTransition(layoutDescripcion2, new AutoTransition());
            DetallesTexto4.setVisibility(v2jk);

            //magos

            int v2k = (TituloTexto5.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
            TransitionManager.beginDelayedTransition(layoutDescripcion2, new AutoTransition());
            TituloTexto5.setVisibility(v2k);

            int v2l = (magos.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;

            TransitionManager.beginDelayedTransition(layoutDescripcion2, new AutoTransition());
            magos.setVisibility(v2l);

            int v2mn = (DetallesTexto5.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

            TransitionManager.beginDelayedTransition(layoutDescripcion2, new AutoTransition());
            DetallesTexto5.setVisibility(v2mn);

            //asesinos

            int v2o = (TituloTexto6.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
            TransitionManager.beginDelayedTransition(layoutDescripcion2, new AutoTransition());
            TituloTexto6.setVisibility(v2o);

            int v2p = (asesinos.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;

            TransitionManager.beginDelayedTransition(layoutDescripcion2, new AutoTransition());
            asesinos.setVisibility(v2p);

            int v2r = (DetallesTexto6.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

            TransitionManager.beginDelayedTransition(layoutDescripcion2, new AutoTransition());
            DetallesTexto6.setVisibility(v2r);


        }
    }
}