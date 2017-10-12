package com.example.chinegua.fem_basketcounter;

import android.os.PersistableBundle;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int local = 0;
    private int visitant = 0;

    private final String LOCAL = "local";
    private final String VISITANT = "visitant";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MiW","Creado");



        if (savedInstanceState != null) {
            this.local = savedInstanceState.getInt(LOCAL);
            this.visitant = savedInstanceState.getInt(VISITANT);
        }


        TextView tvTextoL = (TextView) findViewById(R.id.editText7);
        tvTextoL.setText(Integer.toString(this.local));

        TextView tvTextoV = (TextView) findViewById(R.id.editText8);
        tvTextoV.setText(Integer.toString(this.visitant));



    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putInt(LOCAL,local);
        outState.putInt(VISITANT,visitant);

        super.onSaveInstanceState(outState);
    }

    public void localOnePoint(View v){
        Log.i("MiW","Un Punto");
        this.local +=1;
        TextView tvTexto = (TextView) findViewById(R.id.editText7);
        tvTexto.setText(Integer.toString(this.local));
    }

    public void localTwoPoint(View v){
        this.local +=2;
        TextView tvTexto = (TextView) findViewById(R.id.editText7);
        tvTexto.setText(Integer.toString(this.local));
    }

    public void localThreePoint(View v){
        this.local +=3;
        TextView tvTexto = (TextView) findViewById(R.id.editText7);
        tvTexto.setText(Integer.toString(this.local));
    }

    public void visitantOnePoint(View v){
        Log.i("MiW","Un Punto(visitante)");

        this.visitant +=1;
        TextView tvTexto = (TextView) findViewById(R.id.editText8);
        tvTexto.setText(Integer.toString(this.visitant));

    }

    public void visitantTwoPoint(View v){
        this.visitant +=2;
        TextView tvTexto = (TextView) findViewById(R.id.editText8);
        tvTexto.setText(Integer.toString(this.visitant));
    }

    public void visitantThreePoint(View v){
        this.visitant +=3;
        TextView tvTexto = (TextView) findViewById(R.id.editText8);
        tvTexto.setText(Integer.toString(this.visitant));
    }

}
