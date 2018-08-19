package com.example.jntuhr13syllabusbook;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Branches_1st_year extends Activity {
	
	Button a;
	Button b;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_branches_1st_year);
		
		a=(Button)findViewById(R.id.button1);
		b=(Button)findViewById(R.id.button2);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.branches_1st_year, menu);
		return true;
	}
	
	public void dosomething1(View v) {
		Intent i=new Intent(this,Year1_subjects.class);
		startActivity(i);
	}
	
	public void dosomething2(View v) {
		Intent i=new Intent(this,Year1_subjects.class);
		startActivity(i);
	}

}
