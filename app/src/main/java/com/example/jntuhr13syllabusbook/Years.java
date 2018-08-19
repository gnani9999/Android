package com.example.jntuhr13syllabusbook;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Years extends Activity {
	
	Button a;
	Button b;
	Button c;
	Button d;
	Button e;
	Button f;
	Button g;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_years);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.years, menu);
		return true;
	}
		public void dosomething1(View v)  {
			Intent i=new Intent(this,Branches_1st_year.class);
			startActivity(i);
		}
		
		public void dosomething2(View v)  {
			Intent i=new Intent(this,Branches2_1.class);
			startActivity(i);
		}
		
		public void dosomething3(View v)  {
			Intent i=new Intent(this,Under_construction.class);
			startActivity(i);
		}
		
		public void dosomething4(View v)  {
			Intent i=new Intent(this,Under_construction.class);
			startActivity(i);
		}
		
		public void dosomething5(View v)  {
			Intent i=new Intent(this,Under_construction.class);
			startActivity(i);
		}
		
		public void dosomething6(View v)  {
			Intent i=new Intent(this,Under_construction.class);
			startActivity(i);
		}
		public void dosomething7(View v)  {
			Intent i=new Intent(this,Under_construction.class);
			startActivity(i);
		}
}
