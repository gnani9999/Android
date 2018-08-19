package com.example.jntuhr13syllabusbook;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Under_construction extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_under_construction);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.under_construction, menu);
		return true;
	}

}
