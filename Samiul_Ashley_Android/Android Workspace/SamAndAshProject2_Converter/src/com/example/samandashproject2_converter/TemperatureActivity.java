package com.example.samandashproject2_converter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class TemperatureActivity extends Activity implements OnItemSelectedListener{

	TextView textOut;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.temperature_converter_screen);
		
		final Spinner sTemp;
		
		Button bConvert = (Button) findViewById(R.id.convert_button_temp);
		Button bGoMain = (Button) findViewById(R.id.temp_to_main_button);
		Button bGoWeight = (Button) findViewById(R.id.temp_to_weight_button);
		
		sTemp = (Spinner) findViewById(R.id.spinner_temp);
		sTemp.setOnItemSelectedListener(this);
		
		
		textOut = (TextView) findViewById(R.id.tempOutput);
		textOut.setText("");
		
		//ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item);
		//aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		
		//sTemp.setAdapter(aa);
		
		
		bGoMain.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent ("com.example.samandashproject2_converter.MAINSCREEN"));
				finish();
			}
		});
		
		bGoWeight.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent ("com.example.samandashproject2_converter.WEIGHT"));
				finish();
			}
		});
		
	}

	
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}

	@Override
	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		
		//textOut = (TextView) findViewById(R.id.tempOutput);
		//textOut.setText("");
		// TODO Auto-generated method stub
		
		switch(arg2){
		case 1:
			textOut.setText("FirstOne");
			break;
		case 0:
			textOut.setText("SecondOne");
			break;
		}
	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		textOut.setText("");
	}
	
}
