package ru.stanislav.tsvetajev.fourscreenproject;

import ru.stanislav.tsvetajev.fourscreenproject.R;
import ru.stanislav.tsvetajev.fourscreenproject.SecondActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	Button switch_tosc_2 = (Button) findViewById(R.id.switch_tosc_2);
	switch_tosc_2.setOnClickListener(new View.OnClickListener() {
		public void onClick(View view) {
			Intent myIntent = new Intent(view.getContext(), SecondActivity.class);
			startActivityForResult(myIntent, 0);
		}
	});
	
}
}