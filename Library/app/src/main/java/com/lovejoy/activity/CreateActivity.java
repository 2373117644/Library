package com.lovejoy.activity;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class CreateActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.create_activity);
	}

	public void onClick3(View v)
	{
		this.finish();
		this.overridePendingTransition(R.anim.activity_move_in, R.anim.activity_move_out);
		
	}

}
