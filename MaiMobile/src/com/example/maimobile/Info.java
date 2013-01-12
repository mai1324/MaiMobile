package com.example.maimobile;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Info extends Activity {
	   
		public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.info);
	        
	        Button news = (Button) findViewById(R.id.button1);
	        news.setOnClickListener(new View.OnClickListener() {
	            
	        	public void onClick(View view) {
	                Intent myIntent = new Intent(view.getContext(), Kanonismos.class);
	                startActivityForResult(myIntent, 0);
	            }
	        });
	        
			Button contact = (Button) findViewById(R.id.button2);
	        contact.setOnClickListener(new View.OnClickListener() {
	            
	        	public void onClick(View view) {
	                Intent myIntent = new Intent(view.getContext(), Spoudes.class);
	                startActivityForResult(myIntent, 0);
	            }
	        });
	        
		}

}
