package com.example.laboratorio6;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Actividad1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        String msn= this.getIntent().getExtras().getString("msn");
        TextView txt= findViewById(R.id.txt);
        txt.setText(msn);
    }
    @Override
    protected void onStart(){
        super.onStart();
        Toast toast1 = Toast.makeText(getApplicationContext(),"onStart",Toast.LENGTH_SHORT);
        toast1.setGravity(Gravity.CENTER,0 ,0 );
        toast1.show();

    }
    @Override
    protected void onResume(){
        super.onResume();
        Toast toast1 = Toast.makeText(getApplicationContext(),"onResume",Toast.LENGTH_SHORT);
        toast1.setGravity(Gravity.CENTER,0 ,0 );
        toast1.show();
    }
    @Override
    protected void onPause(){
        super.onPause();
        Toast toast1 = Toast.makeText(getApplicationContext(),"onPause",Toast.LENGTH_SHORT);
        toast1.setGravity(Gravity.CENTER,0 ,0 );
        toast1.show();
    }
    @Override
    protected void onStop(){
        super.onStop();
        Toast toast1 = Toast.makeText(getApplicationContext(),"onStop",Toast.LENGTH_SHORT);
        toast1.setGravity(Gravity.CENTER,0 ,0 );
        toast1.show();
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Toast toast1 = Toast.makeText(getApplicationContext(),"onRestart",Toast.LENGTH_SHORT);
        toast1.setGravity(Gravity.CENTER,0 ,0 );
        toast1.show();
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast toast1 = Toast.makeText(getApplicationContext(),"onDestroy",Toast.LENGTH_SHORT);
        toast1.setGravity(Gravity.CENTER,0 ,0 );
        toast1.show();
    }

}