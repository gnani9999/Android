package com.example.jntuhr13syllabusbook;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Workshop_it_lab extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_workshop_it_lab);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.workshop_it_lab, menu);
		return true;
	}

}
