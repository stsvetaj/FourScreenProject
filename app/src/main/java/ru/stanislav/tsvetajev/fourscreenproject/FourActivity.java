package ru.stanislav.tsvetajev.fourscreenproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class FourActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_four);

	Button switch_tosc_1 = (Button) findViewById(R.id.switch_tosc_1);
	switch_tosc_1.setOnClickListener(new View.OnClickListener() {
		public void onClick(View view) {
			Intent myIntent = new Intent(view.getContext(), MainActivity.class);
			startActivityForResult(myIntent, 0);
		}
	});
	
}
}