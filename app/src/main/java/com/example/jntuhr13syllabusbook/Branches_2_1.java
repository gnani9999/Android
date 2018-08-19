package com.example.jntuhr13syllabusbook;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Branches_2_1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_branches_2_1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.branches_2_1, menu);
		return true;
	}
	
	public void dosomething1(View v) {
		Intent i=new Intent(this,Mathematics_3.class);
		startActivity(i);
	}

	public void dosomething2(View v) {
		Intent i=new Intent(this,Probability_shotastic_process.class);
		startActivity(i);
	}
	
	public void dosomething3(View v) {
		Intent i=new Intent(this,Environmental_science.class);
		startActivity(i);
	}
	
	public void dosomething4(View v) {
		Intent i=new Intent(this,Stld.class);
		startActivity(i);
	}
	
	public void dosomething5(View v) {
		Intent i=new Intent(this,Signals_and_systems.class);
		startActivity(i);
	}
	
	public void dosomething6(View v) {
		Intent i=new Intent(this,EDC.class);
		startActivity(i);
	}
	
	public void dosomething7(View v) {
		Intent i=new Intent(this,BS_lab.class);
		startActivity(i);
	}
	
	public void dosomething8(View v) {
		Intent i=new Intent(this,EDC_lab.class);
		startActivity(i);
	}

}
