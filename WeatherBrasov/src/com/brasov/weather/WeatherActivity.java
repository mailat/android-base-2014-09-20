package com.brasov.weather;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class WeatherActivity extends Activity {
	String oras = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_weather);
	}

	@Override
	protected void onStart() {
		super.onStart();
		oras = getIntent().getStringExtra("oras");
		
		//TEST
		TextView inputCity =(TextView) findViewById(R.id.inputCity);
		inputCity.setText(oras);
	}
	
	
}
