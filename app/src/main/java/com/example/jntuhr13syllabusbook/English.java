package com.example.jntuhr13syllabusbook;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class English extends Activity {
	Button a;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_english);
		a=(Button)findViewById(R.id.button1);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.english, menu);
		return true;
	}
	
	public void dosomething(View v) {
		Intent i=new Intent(this,english.class);
		startActivity(i);
	}

}
