package com.example.medic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.regex.*;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity5_reg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity5_reg);

        EditText email = (EditText) findViewById(R.id.email);
        Button next = (Button) findViewById(R.id.next);

//        Pattern pattern = Pattern.compile(".+\\@yandex\\.ru");
//        Matcher matcher = pattern.matcher(email.getText().toString());

        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }
            @Override
            public void afterTextChanged(Editable s) {
                if (email.getText().toString().contains("@yandex.ru")) {

                    next.setBackground(ContextCompat.getDrawable(MainActivity5_reg.this, R.drawable.button_r));
                    next.setClickable(true);
                } else if (!email.getText().toString().contains("@yandex.ru")) {
                    next.setBackground(ContextCompat.getDrawable(MainActivity5_reg.this, R.drawable.button_nr));
                    next.setClickable(false);
                }
            }
        });


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity5_reg.this, MainActivity6_code_from_email.class);
                startActivity(intent);
            }
        });
    }

    }
