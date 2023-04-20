package com.example.medic;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity7_password_create extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity7_password_create);

        TextView skip = (TextView) findViewById(R.id.skip);

        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity7_password_create.this, MainActivity8_bio.class);
                startActivity(intent);
            }
        });




        Button one = (Button) findViewById(R.id.one); Button two = (Button) findViewById(R.id.two); Button three = (Button) findViewById(R.id.three);
        Button four = (Button) findViewById(R.id.four); Button five = (Button) findViewById(R.id.five); Button six = (Button) findViewById(R.id.six);
        Button seven = (Button) findViewById(R.id.seven); Button eight = (Button) findViewById(R.id.eight); Button nine = (Button) findViewById(R.id.nine);
        Button zero = (Button) findViewById(R.id.zero);

        one.setOnClickListener(this); two.setOnClickListener(this); three.setOnClickListener(this); four.setOnClickListener(this); five.setOnClickListener(this);
        six.setOnClickListener(this); seven.setOnClickListener(this); eight.setOnClickListener(this); nine.setOnClickListener(this); zero.setOnClickListener(this);

        ImageView del = (ImageView) findViewById(R.id.del);

        del.setOnClickListener(this);
    }

    Integer x = 0;
    String pass = "";
    @Override
    public void onClick(View v) {

        TextView output = (TextView) findViewById(R.id.output);
        switch (v.getId()) {
            case R.id.one:
                if (x == 0){
                    x+=1;
                    output.setText(x.toString());
                    pass+=1;
                    break;
                } else if (x == 1) {
                    x+=1;
                    output.setText(x.toString());
                    pass+=1;
                    break;
                } else if(x == 2){
                    x+=1;
                    output.setText(x.toString());
                    pass+=1;
                    break;
                } else {
                    x+=1;
                    output.setText(x.toString());
                    pass+=1;
                    Toast.makeText(this, ""+pass, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity7_password_create.this, MainActivity8_bio.class);
                    startActivity(intent);
                    break;
                }
            case R.id.two:
                if (x == 0){
                    x+=1;
                    output.setText(x.toString());
                    pass+=1;
                    break;
                } else if (x == 1) {
                    x+=1;
                    output.setText(x.toString());
                    pass+=1;
                    break;
                } else if(x == 2){
                    x+=1;
                    output.setText(x.toString());
                    pass+=1;
                    break;
                } else {
                    x+=1;
                    output.setText(x.toString());
                    pass+=1;
                    Toast.makeText(this, ""+pass, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity7_password_create.this, MainActivity8_bio.class);
                    startActivity(intent);
                    break;
                }
            case R.id.three:
                if (x == 0){
                    x+=1;
                    output.setText(x.toString());
                    pass+=1;
                    break;
                } else if (x == 1) {
                    x+=1;
                    output.setText(x.toString());
                    pass+=1;
                    break;
                } else if(x == 2){
                    x+=1;
                    output.setText(x.toString());
                    pass+=1;
                    break;
                } else {
                    x+=1;
                    output.setText(x.toString());
                    pass+=1;
                    Toast.makeText(this, ""+pass, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity7_password_create.this, MainActivity8_bio.class);
                    startActivity(intent);
                    break;
                }
            case R.id.four:
                if (x == 0){
                    x+=1;
                    output.setText(x.toString());
                    pass+=1;
                    break;
                } else if (x == 1) {
                    x+=1;
                    output.setText(x.toString());
                    pass+=1;
                    break;
                } else if(x == 2){
                    x+=1;
                    output.setText(x.toString());
                    pass+=1;
                    break;
                } else {
                    x+=1;
                    output.setText(x.toString());
                    pass+=1;
                    Toast.makeText(this, ""+pass, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity7_password_create.this, MainActivity8_bio.class);
                    startActivity(intent);
                    break;
                }
            case R.id.five:
                if (x == 0){
                    x+=1;
                    output.setText(x.toString());
                    pass+=1;
                    break;
                } else if (x == 1) {
                    x+=1;
                    output.setText(x.toString());
                    pass+=1;
                    break;
                } else if(x == 2){
                    x+=1;
                    output.setText(x.toString());
                    pass+=1;
                    break;
                } else {
                    x+=1;
                    output.setText(x.toString());
                    pass+=1;
                    Toast.makeText(this, ""+pass, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity7_password_create.this, MainActivity8_bio.class);
                    startActivity(intent);
                    break;
                }
            case R.id.six:
                if (x == 0){
                    x+=1;
                    output.setText(x.toString());
                    pass+=1;
                    break;
                } else if (x == 1) {
                    x+=1;
                    output.setText(x.toString());
                    pass+=1;
                    break;
                } else if(x == 2){
                    x+=1;
                    output.setText(x.toString());
                    pass+=1;
                    break;
                } else {
                    x+=1;
                    output.setText(x.toString());
                    pass+=1;
                    Toast.makeText(this, ""+pass, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity7_password_create.this, MainActivity8_bio.class);
                    startActivity(intent);
                    break;
                }
            case R.id.seven:
                if (x == 0){
                    x+=1;
                    output.setText(x.toString());
                    pass+=1;
                    break;
                } else if (x == 1) {
                    x+=1;
                    output.setText(x.toString());
                    pass+=1;
                    break;
                } else if(x == 2){
                    x+=1;
                    output.setText(x.toString());
                    pass+=1;
                    break;
                } else {
                    x+=1;
                    output.setText(x.toString());
                    pass+=1;
                    Toast.makeText(this, ""+pass, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity7_password_create.this, MainActivity8_bio.class);
                    startActivity(intent);
                    break;
                }
            case R.id.eight:
                if (x == 0){
                    x+=1;
                    output.setText(x.toString());
                    pass+=1;
                    break;
                } else if (x == 1) {
                    x+=1;
                    output.setText(x.toString());
                    pass+=1;
                    break;
                } else if(x == 2){
                    x+=1;
                    output.setText(x.toString());
                    pass+=1;
                    break;
                } else {
                    x+=1;
                    output.setText(x.toString());
                    pass+=1;
                    Toast.makeText(this, ""+pass, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity7_password_create.this, MainActivity8_bio.class);
                    startActivity(intent);
                    break;
                }
            case R.id.nine:
                if (x == 0){
                    x+=1;
                    output.setText(x.toString());
                    pass+=1;
                    break;
                } else if (x == 1) {
                    x+=1;
                    output.setText(x.toString());
                    pass+=1;
                    break;
                } else if(x == 2){
                    x+=1;
                    output.setText(x.toString());
                    pass+=1;
                    break;
                } else {
                    x+=1;
                    output.setText(x.toString());
                    pass+=1;
                    Toast.makeText(this, ""+pass, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity7_password_create.this, MainActivity8_bio.class);
                    startActivity(intent);
                    break;
                }
            case R.id.zero:
                if (x == 0){
                    x+=1;
                    output.setText(x.toString());
                    pass+=1;
                    break;
                } else if (x == 1) {
                    x+=1;
                    output.setText(x.toString());
                    pass+=1;
                    break;
                } else if(x == 2){
                    x+=1;
                    output.setText(x.toString());
                    pass+=1;
                    break;
                } else {
                    x+=1;
                    output.setText(x.toString());
                    pass+=1;
                    Toast.makeText(this, ""+pass, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity7_password_create.this, MainActivity8_bio.class);
                    startActivity(intent);
                    break;
                }
            case R.id.del:
                if (x!=0){
                        x -= 1;
                    output.setText(x.toString());
                    break;
                }

        }
    }
}