package com.example.splashscreen;

import static android.view.View.VISIBLE;

import android.animation.LayoutTransition;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.telecom.Call;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class PrinciplesBasicsMap {
    public static class PrinciplesBasics extends AppCompatActivity {

        TextView detallesTexto, detallesTexto2,DetallesTexto2_1, DetallesTexto2_2 ,detallesTexto3, DetallesTexto3_1, DetallesTexto3_2;
        TextView TituloTexto2, TituloTexto2_1, TituloTexto2_2,Titulo3_1, Titulo3_2;
        ImageView mapaLol, mininons, torres, monstruos, abismo, tft;
        LinearLayout layoutDescripcion, layoutDescripcion2,layoutDescripcion3;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.principiosbasicosmapa);

            ImageView buttonImage = (ImageView) findViewById(R.id.BackPrincipalActiviti);
            buttonImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(PrinciplesBasics.this, PrincipalActivity.class));
                }
            });

            //Mapa

            detallesTexto = findViewById(R.id.descripcionTexto);
            layoutDescripcion = findViewById(R.id.item_description_layout);
            mapaLol = findViewById(R.id.imagen_mapa);

            // elementos del mapa

            layoutDescripcion2 = findViewById(R.id.item_description_layout2);

            //Subditos

            TituloTexto2 = findViewById(R.id.TituloTexto2);
            detallesTexto2 = findViewById(R.id.descripcionTexto2);
            mininons = findViewById(R.id.imagen_mapa2);

            //Torres

            TituloTexto2_1 = findViewById(R.id.TituloTexto2_1);
            DetallesTexto2_1 = findViewById(R.id.descripcionTexto2_1);
            torres = findViewById(R.id.imagen_mapa2_1);

            //Montruos

            TituloTexto2_2 = findViewById(R.id.TituloTexto2_2);
            DetallesTexto2_2 = findViewById(R.id.descripcionTexto2_2);
            monstruos = findViewById(R.id.imagen_mapa2_2);

            //tipos de mapa

            layoutDescripcion3 = findViewById(R.id.item_description_layout3);
            detallesTexto3 = findViewById(R.id.descripcionTexto3);

            //abismo

            Titulo3_1 = findViewById(R.id.TituloTexto3_1);
            DetallesTexto3_1 = findViewById(R.id.descripcionTexto3_1);
            abismo = findViewById(R.id.imagen_mapa3_1);

            //tft

            Titulo3_2 = findViewById(R.id.TituloTexto3_2);
            DetallesTexto3_2 = findViewById(R.id.descripcionTexto3_2);
            tft = findViewById(R.id.imagen_mapa3_2);

            layoutDescripcion.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
            layoutDescripcion2.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
            layoutDescripcion3.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

        }


        @RequiresApi(api = Build.VERSION_CODES.KITKAT)
        public void expand(View viw) {

            int v = (detallesTexto.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

            TransitionManager.beginDelayedTransition(layoutDescripcion, new AutoTransition());
            detallesTexto.setVisibility(v);

            int va = (mapaLol.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

            TransitionManager.beginDelayedTransition(layoutDescripcion, new AutoTransition());
            mapaLol.setVisibility(va);

        }

        @RequiresApi(api = Build.VERSION_CODES.KITKAT)
        public void expando(View view) {

            //Minions

            int v2 = (detallesTexto2.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

            TransitionManager.beginDelayedTransition(layoutDescripcion2, new AutoTransition());
            detallesTexto2.setVisibility(v2);

            int v2a = (TituloTexto2.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

            TransitionManager.beginDelayedTransition(layoutDescripcion2, new AutoTransition());
            TituloTexto2.setVisibility(v2a);

            int v2b = (mininons.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

            TransitionManager.beginDelayedTransition(layoutDescripcion2, new AutoTransition());
            mininons.setVisibility(v2b);


            //torres

            int v2c1 = (TituloTexto2_1.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

            TransitionManager.beginDelayedTransition(layoutDescripcion2, new AutoTransition());
            TituloTexto2_1.setVisibility(v2c1);

            int v2c = (DetallesTexto2_1.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

            TransitionManager.beginDelayedTransition(layoutDescripcion2, new AutoTransition());
            DetallesTexto2_1.setVisibility(v2c);

            int v2d = (torres.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

            TransitionManager.beginDelayedTransition(layoutDescripcion2, new AutoTransition());
            torres.setVisibility(v2d);

            //Monstruos

            int v2e = (TituloTexto2_2.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

            TransitionManager.beginDelayedTransition(layoutDescripcion2, new AutoTransition());
            TituloTexto2_2.setVisibility(v2e);

            int v2f = (DetallesTexto2_2.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

            TransitionManager.beginDelayedTransition(layoutDescripcion2, new AutoTransition());
            DetallesTexto2_2.setVisibility(v2f);

            int v2g = (monstruos.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

            TransitionManager.beginDelayedTransition(layoutDescripcion2, new AutoTransition());
            monstruos.setVisibility(v2g);

        }

        @RequiresApi(api = Build.VERSION_CODES.KITKAT)
        public void expand3(View view) {

            int v3 = (detallesTexto3.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

            TransitionManager.beginDelayedTransition(layoutDescripcion3, new AutoTransition());
            detallesTexto3.setVisibility(v3);

            //abismo

            int v3a = (DetallesTexto3_1.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

            TransitionManager.beginDelayedTransition(layoutDescripcion3, new AutoTransition());
            DetallesTexto3_1.setVisibility(v3a);

            int v3b = (Titulo3_1.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

            TransitionManager.beginDelayedTransition(layoutDescripcion3, new AutoTransition());
            Titulo3_1.setVisibility(v3b);

            int v3c = (abismo.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

            TransitionManager.beginDelayedTransition(layoutDescripcion3, new AutoTransition());
            abismo.setVisibility(v3c);

            //tft

            int v3d = (DetallesTexto3_2.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

            TransitionManager.beginDelayedTransition(layoutDescripcion3, new AutoTransition());
            DetallesTexto3_2.setVisibility(v3d);

            int v3e = (Titulo3_2.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

            TransitionManager.beginDelayedTransition(layoutDescripcion3, new AutoTransition());
            Titulo3_2 .setVisibility(v3e);

            int v3f = (tft.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

            TransitionManager.beginDelayedTransition(layoutDescripcion3, new AutoTransition());
            tft.setVisibility(v3f);
        }
    }
}
