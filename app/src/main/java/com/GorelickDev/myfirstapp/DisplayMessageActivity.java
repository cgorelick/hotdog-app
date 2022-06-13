package com.GorelickDev.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // capture original intent, extract the string containing, if they followed orders, their name
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // capture text view, forcibly add accusatory messaging wrapped around their name
        TextView textView = findViewById(R.id.textView);
        textView.setText(new StringBuilder().append("You know who ate the most hot-dogs? ")
                .append(message).append(", that's who!").toString());
    }
}