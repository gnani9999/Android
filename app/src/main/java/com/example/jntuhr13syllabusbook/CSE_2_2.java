package com.example.jntuhr13syllabusbook;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class CSE_2_2 extends Activity {
	
	Button a;
	Button b;
	Button c;
	Button d;
	Button e;
	Button f;
	Button g;
	Button h;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cse_2_2);
		
		a=(Button)findViewById(R.id.button1);
		b=(Button)findViewById(R.id.button2);
		c=(Button)findViewById(R.id.button3);
		d=(Button)findViewById(R.id.button4);
		e=(Button)findViewById(R.id.button5);
		f=(Button)findViewById(R.id.button6);
		g=(Button)findViewById(R.id.button7);
		h=(Button)findViewById(R.id.button8);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cse_2_2, menu);
		return true;
	}
	
	public void dosomething1(View v) {
		Intent i=new Intent(this,Under_construction.class);
		startActivity(i);
	}
	
	public void dosomething2(View v) {
		Intent i=new Intent(this,Under_construction.class);
		startActivity(i);
	}
	
	public void dosomething3(View v) {
		Intent i=new Intent(this,Under_construction.class);
		startActivity(i);
	}
	
	public void dosomething4(View v) {
		Intent i=new Intent(this,Under_construction.class);
		startActivity(i);
	}
	
	public void dosomething5(View v) {
		Intent i=new Intent(this,Under_construction.class);
		startActivity(i);
	}
	
	public void dosomething6(View v) {
		Intent i=new Intent(this,Under_construction.class);
		startActivity(i);
	}
	
	public void dosomething7(View v) {
		Intent i=new Intent(this,Under_construction.class);
		startActivity(i);
	}
	
	public void dosomething8(View v) {
		Intent i=new Intent(this,Under_construction.class);
		startActivity(i);
	}
	}

