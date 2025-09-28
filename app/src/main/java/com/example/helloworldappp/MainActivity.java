package com.example.helloworldappp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView tvDemolabel;
    Button changecolo
    @OverriderButton;

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
        Button changecolorButton = findViewById(R.id.btnchangecolor);
        changeColorButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                tvDemoLabel.setBackgroundColor(Color.YELLOW);//Example: Change color to Yellow
    }

    public void changeTextClick(View view) {

        tvDemolabel.setText("Hello Android!");
    }
            //Main changes
            //Main changes
            //Main changes
            //Main changes
}