package com.example.myapplication.ui.theme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.example.myapplication.R;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class main_activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        EditText firstName = findViewById(R.id.firstName);
        EditText lastName  = findViewById(R.id.lastName);
        EditText email     = findViewById(R.id.email);

        RadioButton men    = findViewById(R.id.men);

        Button inscription = findViewById(R.id.inscription);

        inscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fn = firstName.getText().toString().trim();
                String ln = lastName.getText().toString().trim();
                String em = email.getText().toString().trim();

                if (fn.isEmpty() || ln.isEmpty() || em.isEmpty()) {
                    Toast.makeText(main_activity.this,
                            getString(R.string.all_fields_required),
                            Toast.LENGTH_SHORT).show();
                } else {
                    Intent i = new Intent(main_activity.this, affichage_activity.class);
                    i.putExtra("prenom", fn);
                    i.putExtra("nom", ln);
                    i.putExtra("email", em);
                    i.putExtra("genre", men.isChecked() ? getString(R.string.genre_homme) : getString(R.string.genre_femme));
                    startActivity(i);
                }
            }
        });
    }
}
