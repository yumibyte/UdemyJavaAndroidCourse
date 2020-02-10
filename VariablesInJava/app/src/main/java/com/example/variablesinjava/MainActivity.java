package com.example.variablesinjava;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //primitive data types, doesn't occupy ^ memory
        int age = 20;
        float price = 1.5f;
        double userScore = 4.245245;

        long computerRam = 12323423423L;

        boolean isDead = true;

        String name = "Morteza";

        char letterA = 'A';
        // Stack memory variable is ASSIGNED the value (primitives like int)
        // Heap memory is where objects are stored. Reference type. Stack will only hold the address.


    }
}
