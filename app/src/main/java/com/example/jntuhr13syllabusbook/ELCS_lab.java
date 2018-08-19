package com.example.jntuhr13syllabusbook;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ELCS_lab extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_elcs_lab);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.elcs_lab, menu);
		return true;
	}

}
