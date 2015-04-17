package ru.stanislav.tsvetajev.fourscreenproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_third);

	Button switch_tosc_4 = (Button) findViewById(R.id.switch_tosc_4);
	switch_tosc_4.setOnClickListener(new View.OnClickListener() {
		public void onClick(View view) {
			Intent myIntent = new Intent(view.getContext(), FourActivity.class);
			startActivityForResult(myIntent, 0);
		}
	});
	
}
}
