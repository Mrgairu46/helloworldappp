package com.example.helloworldappp;

import android.graphics.Color; // Import the Color class
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView tvDemolabel; // Corrected variable name to match usage
    Button changecolorButton; // Class level variable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        this.tvDemolabel = findViewById(R.id.tvDemolabel);
        // Initialize the class level variable, not a new local one
        changecolorButton = findViewById(R.id.btnchangecolor); // Corrected variable name

        changecolorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Changed from Color.YELLOW to Color.RED
                tvDemolabel.setBackgroundColor(Color.RED);
            }
        });
    }

    // Moved changeTextClick outside of onCreate
    public void changeTextClick(View view) {
        tvDemolabel.setText("Hello Android!");
    }
    // Main changes
    // Main changes
    // Main changes
    // Main changes

    // branchChange
}

