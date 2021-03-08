package fr.umontpellier.exercice4persistence;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.TextView;

public class PlanningActivity extends AppCompatActivity {
TextView planning1, planning2, planning3, planning4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planning);

        planning1 = (TextView)findViewById(R.id.planning1);
        planning2 = (TextView)findViewById(R.id.planning2);
        planning3 = (TextView)findViewById(R.id.planning3);
        planning4 = (TextView)findViewById(R.id.planning4);

        DataViewModel model;
        model = new ViewModelProvider(this).get(DataViewModel.class);
        planning1.setText(model.planning1);
        planning2.setText(model.planning2);
        planning3.setText(model.planning3);
        planning4.setText(model.planning4);
    }
}