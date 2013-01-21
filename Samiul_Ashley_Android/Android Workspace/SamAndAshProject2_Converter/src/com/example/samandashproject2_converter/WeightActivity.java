package com.example.samandashproject2_converter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WeightActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.weight_converter_screen);
		
		Button bConvert = (Button) findViewById(R.id.convert_button_weight);
		Button bGoMain = (Button) findViewById(R.id.weight_to_main_button);
		Button bGoTemp = (Button) findViewById(R.id.weight_to_temp_button);
		
		bGoMain.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent ("com.example.samandashproject2_converter.MAINSCREEN"));
				finish();
			}
		});
		
		bGoTemp.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent ("com.example.samandashproject2_converter.TEMPERATURE"));
				finish();
			}
		});
		
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}
	
}
