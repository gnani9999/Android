package com.example.jntuhr13syllabusbook;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Cse_2_1 extends Activity {

	 Button a;
	 Button b;
	 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cse_2_1);
		a=(Button)findViewById(R.id.button1);
		b=(Button)findViewById(R.id.button2);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cse_2_1, menu);
		return true;
	}
	
		public void dosomething1(View v) {
			Intent i=new Intent(this,Probability_and_statistics.class);
			startActivity(i);
		}

		public void dosomething2(View v) {
			Intent i=new Intent(this,MFCS.class);
			startActivity(i);
		}
		
		public void dosomething3(View v) {
			Intent i=new Intent(this,Data_structures.class);
			startActivity(i);
		}
		
		public void dosomething4(View v) {
			Intent i=new Intent(this,DLD.class);
			startActivity(i);
		}
		
		public void dosomething5(View v) {
			Intent i=new Intent(this,BEE.class);
			startActivity(i);
		}
		
		public void dosomething6(View v) {
			Intent i=new Intent(this,EDC.class);
			startActivity(i);
		}
		
		public void dosomething7(View v) {
			Intent i=new Intent(this,Data_structures_lab.class);
			startActivity(i);
		}
		
		public void dosomething8(View v) {
			Intent i=new Intent(this,EDC_lab.class);
			startActivity(i);
		}
}
