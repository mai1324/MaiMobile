package com.example.maimobile;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Contact extends Activity {
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact);
        
        Button maps = (Button) findViewById(R.id.button1);
        maps.setOnClickListener(new View.OnClickListener() {
        
    	public void onClick(View view) {
            Intent myIntent = new Intent(view.getContext(), GoogleMaps.class);
            startActivityForResult(myIntent, 0);
        }
    });

       
	}
}
