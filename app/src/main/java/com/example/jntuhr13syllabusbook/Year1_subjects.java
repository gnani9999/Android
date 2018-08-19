package com.example.jntuhr13syllabusbook;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Year1_subjects extends Activity {
	
	Button a;
	Button b;
	Button c;
	Button d;
	Button e;
	Button f;
	Button g;
	Button h;
	Button i;
	Button j;
	Button k;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_year1_subjects);
		a=(Button)findViewById(R.id.button1);
		b=(Button)findViewById(R.id.button2);
		c=(Button)findViewById(R.id.button3);
		d=(Button)findViewById(R.id.button4);
		e=(Button)findViewById(R.id.button5);
		f=(Button)findViewById(R.id.button6);
		g=(Button)findViewById(R.id.button7);
		h=(Button)findViewById(R.id.button8);
		i=(Button)findViewById(R.id.button9);
		j=(Button)findViewById(R.id.button10);
		k=(Button)findViewById(R.id.button11);
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.year1_subjects, menu);
		return true;
	}
	public void dosomething1(View v) {
		Intent i=new Intent(this,English.class);
		startActivity(i);
	}
		
		public void dosomething2(View v) {
			Intent i=new Intent(this,Mathematics_1.class);
			startActivity(i);	
	}
		
		public void dosomething3(View v) {
			Intent i=new Intent(this,Mathematics_Methods.class);
			startActivity(i);
		}
		public void dosomething4(View v) {
			Intent i=new Intent(this,Engineering_Physics.class);
			startActivity(i);
		}
		public void dosomething5(View v) {
			Intent i=new Intent(this,Engineering_Chemistry.class);
			startActivity(i);
		}
		public void dosomething6(View v) {
			Intent i=new Intent(this,Computer_programming.class);
			startActivity(i);
		}
		public void dosomething7(View v) {
			Intent i=new Intent(this,Engineering_drawing.class);
			startActivity(i);
		}
		public void dosomething8(View v) {
			Intent i=new Intent(this,Computer_programming_lab.class);
			startActivity(i);
		}
		public void dosomething9(View v) {
			Intent i=new Intent(this,Physics_chemistry_lab.class);
			startActivity(i);
		}
		public void dosomething10(View v) {
			Intent i=new Intent(this,ELCS_lab.class);
			startActivity(i);
		}
		public void dosomething11(View v) {
			Intent i=new Intent(this,Workshop_it_lab.class);
			startActivity(i);
		}
}
