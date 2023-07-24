package com.example.hometest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMaths = findViewById(R.id.btnMaths);
        btnMaths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fragmentManager = getSupportFragmentManager();

                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView , MathsFragment.class, null)
                        .setReorderingAllowed(true)
                        .addtoBackstack("name")
                        .commit()
            }
        });

        /// code for English Button to switch Fragments
        Button btnEnglish = findViewById(R.id.btnEnglish);
        btnEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fragmentManager = getSupportFragmentManager();

                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView , EnglishFragment.class, null)
                        .setReorderingAllowed(true)
                        .addtoBackstack("name")
                        .commit()

    }
});
        /// code for Science Button to switch Fragments
        Button btnScience = findViewById(R.id.btnScience);
        btnScience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fragmentManager = getSupportFragmentManager();

                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView , ScienceFragment.class, null)
                        .setReorderingAllowed(true)
                        .addtoBackstack("name")
                        .commit()

            }
        });

