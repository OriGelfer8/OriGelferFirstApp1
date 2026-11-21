package com.katza.myfirstapp;

import static android.view.View.INVISIBLE;
import static android.view.View.VISIBLE;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnSendMessage;
Button btnFollow;
TextView tvUserName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSendMessage = findViewById(R.id.btnSendMessage);
        btnSendMessage.setOnClickListener(this);

        btnFollow = findViewById(R.id.btnFollow);
        btnFollow.setOnClickListener(this);

        tvUserName = findViewById(R.id.tvUserName);

    }

    @Override
    public void onClick(View v) {

        int viewId=v.getId();
        if(viewId==R.id.btnSendMessage) {
            Log.d("Ori","SendMessage was clicked");
            Toast.makeText(this, R.string.opening_chat, Toast.LENGTH_SHORT).show();
        }
        if (v.getId() == R.id.btnFollow) {

            Log.d("Ori","Follow was clicked");
            Toast.makeText(this, R.string.started_following, Toast.LENGTH_SHORT).show();

            btnFollow.setText(R.string.following);
        }


    }






   }