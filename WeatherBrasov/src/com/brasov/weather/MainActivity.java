package com.brasov.weather;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Log.d("WeatherBrasov", "Suntem in onCreate");
	}
	
	public void showWeather(View view)
	{
		//luam orasul din interfata
		EditText inputCity =(EditText) findViewById(R.id.inputCity);
		String orasul = inputCity.getText().toString();
		Log.d("WeatherBrasov", "orasul introdus este" + orasul);
		
		//sarim in a doua activitate
		Intent intent = new Intent(this, WeatherActivity.class);
		intent.putExtra("oras", orasul);
		startActivity(intent);
	}
	
}
