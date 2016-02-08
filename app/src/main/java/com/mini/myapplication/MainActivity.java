package com.mini.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonplus,buttonminus,buttondela,buttonganger;
    private TextView textresultat;
    private EditText editforsta,editandra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();



        
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    private void init() {
        buttonplus = (Button) findViewById(R.id.buttonplus);
        buttonminus = (Button) findViewById(R.id.buttonminus);
        buttondela = (Button) findViewById(R.id.buttondela);
        buttonganger = (Button) findViewById(R.id.buttonganger);
        editforsta = (EditText) findViewById(R.id.editforsta);
        editandra = (EditText) findViewById(R.id.editandra);
        textresultat = (TextView) findViewById(R.id.textresultat);

        buttonplus.setOnClickListener(this);
        buttonminus.setOnClickListener(this);
        buttondela.setOnClickListener(this);
        buttonganger.setOnClickListener(this);


    }
    public void onClick(View view){
        String num1 = editforsta.getText().toString();
        String num2 = editandra.getText().toString();
        switch (view.getId()) {
           case R.id.buttonplus:
               int addition = Integer.parseInt(num1) + Integer.parseInt(num2);
               textresultat.setText(String.valueOf(addition));
            break;
            case R.id.buttonminus:
                int subtraction = Integer.parseInt(num1) - Integer.parseInt(num2);
                textresultat.setText(String.valueOf(subtraction));
                break;
            case R.id.buttondela:
               try{
                   int division = Integer.parseInt(num1) / Integer.parseInt(num2);
                   textresultat.setText(String.valueOf(division));
               }catch (Exception e){
                   textresultat.setText("Kan inte dela!");
               }
                break;
            case R.id.buttonganger:
                int multiply = Integer.parseInt(num1) * Integer.parseInt(num2);
                textresultat.setText(String.valueOf(multiply));
                break;



        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
