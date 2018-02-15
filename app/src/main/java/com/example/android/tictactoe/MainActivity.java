package com.example.android.tictactoe;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.duration;
import static com.example.android.tictactoe.R.id.one;

public class MainActivity extends AppCompatActivity {

    TextView one, two, three, four, five, six, seven, eight, nine;
    int player = 1;
    //player 1 = O
    //player 2 = X
    String o = "O";
    String x = "X";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = (TextView) findViewById(R.id.one);
        two = (TextView) findViewById(R.id.two);
        three = (TextView) findViewById(R.id.three);
        four = (TextView) findViewById(R.id.four);
        five = (TextView) findViewById(R.id.five);
        six = (TextView) findViewById(R.id.six);
        seven = (TextView) findViewById(R.id.seven);
        eight = (TextView) findViewById(R.id.eight);
        nine = (TextView) findViewById(R.id.nine);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(one.getText().toString().equals("")){
                    if (player == 1){
                        one.setText(o);
                        one.setTextColor(Color.parseColor("#D50000"));
                    }
                    if (player == 2){
                        one.setText(x);
                        one.setTextColor(Color.parseColor("#76FF03"));
                    }
                    if(one.getText().toString().equals(o)){
                        player = 2;
                    }
                    if(one.getText().toString().equals(x)){
                        player = 1;
                    }
                }
                gameWon();
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(two.getText().toString().equals("")){
                    if (player == 1){
                        two.setText(o);
                        two.setTextColor(Color.parseColor("#D50000"));
                    }
                    if (player == 2){
                        two.setText(x);
                        two.setTextColor(Color.parseColor("#76FF03"));
                    }
                    if(two.getText().toString().equals(o)){
                        player = 2;
                    }
                    if(two.getText().toString().equals(x)){
                        player = 1;
                    }
                }
                gameWon();
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(three.getText().toString().equals("")){
                    if (player == 1){
                        three.setText(o);
                        three.setTextColor(Color.parseColor("#D50000"));
                    }
                    if (player == 2){
                        three.setText(x);
                        three.setTextColor(Color.parseColor("#76FF03"));
                    }
                    if(three.getText().toString().equals(o)){
                        player = 2;
                    }
                    if(three.getText().toString().equals(x)){
                        player = 1;
                    }
                }
                gameWon();
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(four.getText().toString().equals("")){
                    if (player == 1){
                        four.setText(o);
                        four.setTextColor(Color.parseColor("#D50000"));
                    }
                    if (player == 2){
                        four.setText(x);
                        four.setTextColor(Color.parseColor("#76FF03"));
                    }
                    if(four.getText().toString().equals(o)){
                        player = 2;
                    }
                    if(four.getText().toString().equals(x)){
                        player = 1;
                    }
                }
                gameWon();
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(five.getText().toString().equals("")){
                    if (player == 1){
                        five.setText(o);
                        five.setTextColor(Color.parseColor("#D50000"));
                    }
                    if (player == 2){
                        five.setText(x);
                        five.setTextColor(Color.parseColor("#76FF03"));
                    }
                    if(five.getText().toString().equals(o)){
                        player = 2;
                    }
                    if(five.getText().toString().equals(x)){
                        player = 1;
                    }
                }
                gameWon();
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(six.getText().toString().equals("")){
                    if (player == 1){
                        six.setText(o);
                        six.setTextColor(Color.parseColor("#D50000"));
                    }
                    if (player == 2){
                        six.setText(x);
                        six.setTextColor(Color.parseColor("#76FF03"));
                    }
                    if(six.getText().toString().equals(o)){
                        player = 2;
                    }
                    if(six.getText().toString().equals(x)){
                        player = 1;
                    }
                }
                gameWon();
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(seven.getText().toString().equals("")){
                    if (player == 1){
                        seven.setText(o);
                        seven.setTextColor(Color.parseColor("#D50000"));
                    }
                    if (player == 2){
                        seven.setText(x);
                        seven.setTextColor(Color.parseColor("#76FF03"));
                    }
                    if(seven.getText().toString().equals(o)){
                        player = 2;
                    }
                    if(seven.getText().toString().equals(x)){
                        player = 1;
                    }
                }
                gameWon();
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(eight.getText().toString().equals("")){
                    if (player == 1){
                        eight.setText(o);
                        eight.setTextColor(Color.parseColor("#D50000"));
                    }
                    if (player == 2){
                        eight.setText(x);
                        eight.setTextColor(Color.parseColor("#76FF03"));
                    }
                    if(eight.getText().toString().equals(o)){
                        player = 2;
                    }
                    if(eight.getText().toString().equals(x)){
                        player = 1;
                    }
                }
                gameWon();
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nine.getText().toString().equals("")){
                    if (player == 1){
                        nine.setText(o);
                        nine.setTextColor(Color.parseColor("#D50000"));
                    }
                    if (player == 2){
                        nine.setText(x);
                        nine.setTextColor(Color.parseColor("#76FF03"));
                    }
                    if(nine.getText().toString().equals(o)){
                        player = 2;
                    }
                    if(nine.getText().toString().equals(x)){
                        player = 1;
                    }
                }
                gameWon();
            }
        });
    }

    public void resetBoard(View view){
        this.recreate();
    }

    public void gameWon() {

        String a = one.getText().toString();
        String b = two.getText().toString();
        String c = three.getText().toString();
        String d = four.getText().toString();
        String e = five.getText().toString();
        String f = six.getText().toString();
        String g = seven.getText().toString();
        String h = eight.getText().toString();
        String i = nine.getText().toString();

        if ((a.equals(x) && d.equals(x) && g.equals(x))) {
            msgX();
        }
        if ((b.equals(x) && e.equals(x) && h.equals(x))) {
            msgX();
        }
        if ((c.equals(x) && f.equals(x) && i.equals(x))) {
            msgX();
        }
        if ((a.equals(x) && b.equals(x) && c.equals(x))) {
            msgX();
        }
        if ((d.equals(x) && e.equals(x) && f.equals(x))) {
            msgX();
        }
        if ((g.equals(x) && h.equals(x) && i.equals(x))) {
            msgX();
        }
        if ((a.equals(x) && e.equals(x) && i.equals(x))) {
            msgX();
        }
        if ((c.equals(x) && e.equals(x) && g.equals(x))) {
            msgX();
        }


        if ((a.equals(o) && d.equals(o) && g.equals(o))) {
            msgO();
        }
        if ((b.equals(o) && e.equals(o) && h.equals(o))) {
            msgO();
        }
        if ((c.equals(o) && f.equals(o) && i.equals(o))) {
            msgO();
        }
        if ((a.equals(o) && b.equals(o) && c.equals(o))) {
            msgO();
        }
        if ((d.equals(o) && e.equals(o) && f.equals(o))) {
            msgO();
        }
        if ((g.equals(o) && h.equals(o) && i.equals(o))) {
            msgO();
        }
        if ((a.equals(o) && e.equals(o) && i.equals(o))) {
            msgO();
        }
        if ((c.equals(o) && e.equals(o) && g.equals(o))) {
            msgO();
        }
    }

    public void msgX(){
        Toast.makeText(this, "Player X wins! Game Over!", Toast.LENGTH_LONG).show();
    }

    public void msgO(){
        Toast.makeText(this, "Player O wins! Game Over!", Toast.LENGTH_LONG).show();
    }
}
