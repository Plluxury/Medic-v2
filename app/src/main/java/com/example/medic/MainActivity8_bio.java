package com.example.medic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity8_bio extends AppCompatActivity{

    String[] male = { "Мужик", "Женщина"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity8_bio);

        TextView skip = (TextView) findViewById(R.id.skip);

        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity8_bio.this,MainActivity.class);
                startActivity(intent);
            }
        });

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        List<String> list = new ArrayList<String>();
        list.add("Пол");   //  Initial dummy entry
        list.add("Мужской");
        list.add("Женский");

// Populate the spinner using a customized ArrayAdapter that hides the first (dummy) entry
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list) {
            @Override
            public View getDropDownView(int position, View convertView, ViewGroup parent)
            {
                View v = null;

                // If this is the initial dummy entry, make it hidden
                if (position == 0) {
                    TextView tv = new TextView(getContext());
                    tv.setHeight(0);
                    tv.setVisibility(View.GONE);
                    v = tv;
                }
                else {
                    // Pass convertView as null to prevent reuse of special case views
                    v = super.getDropDownView(position, null, parent);
                }

                // Hide scroll bar because it appears sometimes unnecessarily, this does not prevent scrolling
                parent.setVerticalScrollBarEnabled(false);
                return v;
            }
        };
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);

        EditText name = (EditText) findViewById(R.id.name);
        EditText father = (EditText) findViewById(R.id.father);
        EditText surname = (EditText) findViewById(R.id.surname);
        EditText dob = (EditText) findViewById(R.id.dob);

        final Integer[] x = {0};

        Button next = (Button) findViewById(R.id.next);

        name.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (!name.getText().toString().isEmpty()) {
                    father.addTextChangedListener(new TextWatcher() {
                        @Override
                        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                        }

                        @Override
                        public void onTextChanged(CharSequence s, int start, int before, int count) {

                        }

                        @Override
                        public void afterTextChanged(Editable s) {
                            if (!father.getText().toString().isEmpty()) {
                                surname.addTextChangedListener(new TextWatcher() {
                                    @Override
                                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                                    }

                                    @Override
                                    public void onTextChanged(CharSequence s, int start, int before, int count) {

                                    }

                                    @Override
                                    public void afterTextChanged(Editable s) {
                                        if (!surname.getText().toString().isEmpty()) {
                                            dob.addTextChangedListener(new TextWatcher() {
                                                @Override
                                                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                                                }

                                                @Override
                                                public void onTextChanged(CharSequence s, int start, int before, int count) {

                                                }

                                                @Override
                                                public void afterTextChanged(Editable s) {
                                                    if (!dob.getText().toString().isEmpty()) {
                                                        if(spinner != null && spinner.getSelectedItem() !=null ) {
                                                            next.setBackground(ContextCompat.getDrawable(MainActivity8_bio.this, R.drawable.button_r));
                                                            next.setClickable(true);
                                                        }else {
                                                            next.setBackground(ContextCompat.getDrawable(MainActivity8_bio.this, R.drawable.button_nr));
                                                            next.setClickable(false);
                                                        }
                                                    } else {
                                                        next.setBackground(ContextCompat.getDrawable(MainActivity8_bio.this, R.drawable.button_nr));
                                                        next.setClickable(false);
                                                    }
                                                }
                                            });
                                        } else {
                                            next.setBackground(ContextCompat.getDrawable(MainActivity8_bio.this, R.drawable.button_nr));
                                            next.setClickable(false);}
                                    }
                                });
                            }
                            else {
                                next.setBackground(ContextCompat.getDrawable(MainActivity8_bio.this, R.drawable.button_nr));
                                next.setClickable(false);}
                        }
                    });
                } else {
                    next.setBackground(ContextCompat.getDrawable(MainActivity8_bio.this, R.drawable.button_nr));
                    next.setClickable(false);}
            }
        });


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity8_bio.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}