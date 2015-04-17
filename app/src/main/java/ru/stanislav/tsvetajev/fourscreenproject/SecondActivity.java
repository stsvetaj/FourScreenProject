package ru.stanislav.tsvetajev.fourscreenproject;

import ru.stanislav.tsvetajev.fourscreenproject.R;
import ru.stanislav.tsvetajev.fourscreenproject.ThirdActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);

	Button switch_tosc_3 = (Button) findViewById(R.id.switch_tosc_3);
	switch_tosc_3.setOnClickListener(new View.OnClickListener() {
		public void onClick(View view) {
			Intent myIntent = new Intent(view.getContext(), ThirdActivity.class);
			startActivityForResult(myIntent, 0);
		}
	});
	
}
}
