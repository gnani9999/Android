package com.example.jntuhr13syllabusbook;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
		public void dosomething1(View v) {
			Intent i=new Intent(this,Years.class);
			startActivity(i);
		}
		
		public void dosomething2(View v) {
			Intent i=new Intent(this,About.class);
			startActivity(i);
		}
		
		public void dosomething3(View v) {
			Intent i=new Intent(this,Contact_US.class);
			startActivity(i);
		}
}
