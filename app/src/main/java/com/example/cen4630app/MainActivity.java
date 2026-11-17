package com.example.cen4630app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekBar;
    private Button readyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = findViewById(R.id.seekBar);
        readyButton = findViewById(R.id.readyButton);

        readyButton.setOnClickListener(v -> {
            int energyScore = seekBar.getProgress();
            Intent intent = new Intent(MainActivity.this, RecipeDisplay.class);
            intent.putExtra("ENERGY_SCORE", energyScore);
            startActivity(intent);
        });
    }
}