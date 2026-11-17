package com.example.cen4630app;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class RecipeDisplay extends AppCompatActivity {

    private RecyclerView recyclerViewRecipes;
    private TextView tvEnergyScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_display);

        // Bind views from recipe_display.xml
        recyclerViewRecipes = findViewById(R.id.recyclerViewRecipes);
        tvEnergyScore = findViewById(R.id.textView2);

        // Retrieve energy score passed from MainActivity (defaults to 50)
        int energyScore = getIntent().getIntExtra("ENERGY_SCORE", 50);
        tvEnergyScore.setText("Energy Score: " + energyScore);

        // Set up RecyclerView Layout Manager
        recyclerViewRecipes.setLayoutManager(new LinearLayoutManager(this));

        // TODO: Your backend partner can attach their custom adapter here:
        // RecipeAdapter adapter = new RecipeAdapter(recipeList);
        // recyclerViewRecipes.setAdapter(adapter);
    }
}