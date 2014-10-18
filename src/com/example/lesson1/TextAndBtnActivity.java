package com.example.lesson1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TextAndBtnActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_text_and_btn);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.text_and_btn, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	public void button1_click(View sender) {
		//EditText text1 = (EditText) findViewById(R.id.editText1);
		//text1.setText("Hello "+text1.getText());
		
		EditText text1 = (EditText) findViewById(R.id.editText1);
		EditText text2 = (EditText) findViewById(R.id.editText2);
		
		double val1 = Double.parseDouble(text1.getText().toString());
		double val2 = Double.parseDouble(text2.getText().toString());
		
		TextView lbl = (TextView) findViewById(R.id.textView2);
		lbl.setText(Double.toString(val1*val2));
	}}
