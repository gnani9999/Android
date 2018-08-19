package com.example.jntuhr13syllabusbook;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Stld extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_stld);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.stld, menu);
		return true;
	}

}
