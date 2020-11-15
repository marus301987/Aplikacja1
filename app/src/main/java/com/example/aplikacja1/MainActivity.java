package com.example.aplikacja1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button KliknijMnie;
        Button Powtorz;
        final TextView CommunicateTextView;


        CommunicateTextView = findViewById(R.id.Komunikat);

        KliknijMnie = findViewById(R.id.KliknijMnie);

        Powtorz = findViewById(R.id.Powtorz);

        KliknijMnie.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        CommunicateTextView.setText("Kliknięto");
                    }
                }
        );

        Powtorz.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        CommunicateTextView.setText("Hello World:-)");
                    }
                }
        );





    }
}