package com.example.myapplication.ui.theme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.example.myapplication.R;
import android.widget.TextView;

public class affichage_activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);

        TextView nom        = findViewById(R.id.nom);
        TextView prenom     = findViewById(R.id.prenom);
        TextView emailValue = findViewById(R.id.emailValue);
        TextView genre      = findViewById(R.id.genre);

        Intent intent = getIntent();
        nom.setText(getString(R.string.label_nom) + intent.getStringExtra("nom"));
        prenom.setText(getString(R.string.label_prenom) + intent.getStringExtra("prenom"));
        emailValue.setText(getString(R.string.label_email) + intent.getStringExtra("email"));
        genre.setText(getString(R.string.label_genre) + intent.getStringExtra("genre"));
    }
}
