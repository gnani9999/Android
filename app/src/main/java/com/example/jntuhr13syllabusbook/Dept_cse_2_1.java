package com.example.jntuhr13syllabusbook;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Dept_cse_2_1 extends Activity {

	Button a;
	Button b;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dept_cse_2_1);
		a=(Button)findViewById(R.id.button1);
		b=(Button)findViewById(R.id.button2);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dept_cse_2_1, menu);
		return true;
	}

	public void dosomething1(View v) {
		Intent i=new Intent(this,Branches_2_1.class);
		startActivity(i);
	}
	
	public void dosomething2(View v) {
		Intent i=new Intent(this,CSE_2_2.class);
		startActivity(i);
	}
	
}
