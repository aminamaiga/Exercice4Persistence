package fr.umontpellier.exercice4persistence;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editTexNom, editTextPrenom, editTextAge, editTextPhone;
    private Button afficherPlanning;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editTexNom = (EditText) findViewById(R.id.editext_nom);
        editTextPrenom = (EditText) findViewById(R.id.editext_prenom);
        editTextAge = (EditText) findViewById(R.id.editext_age);
        editTextPhone = (EditText) findViewById(R.id.editext_phone);
        afficherPlanning = (Button)findViewById(R.id.afficher_planning);

        afficherPlanning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PlanningActivity.class);
                startActivity(intent);
            }
        });
    }
}