package com.e.log;

import android.app.FragmentManager;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;
//import androidx.fragment.app.Fragment;

public class LoginActivity extends AppCompatActivity {

    //Decided to use a Fragment for my list activity
    FrameLayout jew;
    EditText user, pass;
    TextView TV;
    Button btnn;
    FragmentManager fragm ;
    ProgressBar prog;
    int progressStatus = 0;
    Handler uzumaki = new Handler();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fragment myfrag = new ItemFragment();

        fragm=getFragmentManager();
        FragmentTransaction tran = fragm.beginTransaction();
        setContentView(R.layout.activity_login);
        prog = findViewById(R.id.progess);
        user = findViewById(R.id.username);
        pass =  findViewById(R.id.pass);
        btnn = findViewById(R.id.btn);
        jew = findViewById(R.id.frame);
        btnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((!user.getText().toString().isEmpty() && !pass.getText().toString().isEmpty()) && !user.getText().toString().equals("BigMike")){
                   

                    if (progressStatus <3000){
                        progressStatus++;
                        prog.setVisibility(v.VISIBLE);

                    }
                    else {
                        prog.setVisibility(v.INVISIBLE);

                    }




                   tran.add(R.id.frame, myfrag);

                   tran.commit();

                    overridePendingTransition(R.anim.slide_right, R.anim.slide_right);
                }
                else if(user.getText().toString().equals("BigMike")){

                   Snackbar.make(jew, R.string.banned, Snackbar.LENGTH_LONG)
                            .setAction("close", new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                }
                            })       .show();
                }
                else{
                    Snackbar.make(jew, R.string.error, Snackbar.LENGTH_LONG)
                            .setAction("close", new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                }
                            })       .show();
                }

            }
        });
    }


    }
