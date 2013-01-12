package com.example.maimobile;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Main extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		Button news = (Button) findViewById(R.id.button1);
        news.setOnClickListener(new View.OnClickListener() {
            
        	public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), New.class);
                startActivityForResult(myIntent, 0);
            }
        });
        
		Button contact = (Button) findViewById(R.id.button4);
        contact.setOnClickListener(new View.OnClickListener() {
            
        	public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Contact.class);
                startActivityForResult(myIntent, 0);
            }
        });
        
		Button info = (Button) findViewById(R.id.button2);
        info.setOnClickListener(new View.OnClickListener() {
            
        	public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Info.class);
                startActivityForResult(myIntent, 0);
            }
        });
        
		Button program = (Button) findViewById(R.id.button3);
        program.setOnClickListener(new View.OnClickListener() {
            
        	public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Program.class);
                startActivityForResult(myIntent, 0);
            }
        });

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
