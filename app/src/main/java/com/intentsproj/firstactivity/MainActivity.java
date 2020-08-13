package com.intentsproj.firstactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button button;
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnclickButtonLister();

           }

    public void OnclickButtonLister(){
        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Context context = getApplicationContext();
                        CharSequence text = "Navigating to Activity 2";
                        int duration = Toast.LENGTH_SHORT;
                        toast = Toast.makeText(context , text, duration);
                        toast.setGravity(Gravity.CENTER_VERTICAL,0,0 );
                        toast.show();

                        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                        startActivity(intent);
                    }
                }
        );

        }
    }
